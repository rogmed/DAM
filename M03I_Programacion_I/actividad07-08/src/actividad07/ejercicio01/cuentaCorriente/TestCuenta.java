package actividad07.ejercicio01.cuentaCorriente;

import static actividad07.ejercicio01.cuentaCorriente.Utilidades.*;

public class TestCuenta {
    // Contiene objetos Cuenta
    static Cuenta[] cuentas ={
        new Cuenta(1, "Nelson Mandela", 250350),
        new Cuenta(2, "Gandalf el Gris", 1000),
        new Cuenta(3, "Guybrush Threepwood", 50000),
        new Cuenta(4, "Terri Medina", 1000000),
    }; 
    static int numCuenta; // Guarda número de cuenta
    static int pos; // posición dentro del array Cuenta[] cuentas
    static int pos1; // posición 1 para cuando se necesitan guardar varias a la vez
    static int pos2; // posición 2

    public static void main(String[] args) {
        String[] opciones = {
            "Consultar saldo.",
            "Ingresar dinero.",
            "Sacar dinero.",
            "Realizar transferencia.",
            "Salir.",
        };

        int opcion;
        do {
            for (int i = 0; i < 40; i++) {
                System.out.print("-");
            }
            System.out.println("\nCUENTA CORRIENTE.");
            for (int i = 0; i < 40; i++) {
                System.out.print("-");
            }

            opcion = muestraMenu(opciones);

            switch (opcion) {
                case 1:
                    consultaSaldo("Introduzca número de cuenta para consultar saldo: ");
                    break;
                case 2:
                    ingresarDinero();
                    break;
                case 3:
                    sacarDinero();
                    break;
                case 4:
                    realizarTransferencia();
                    break;
                case 5:
                    System.out.println("Cerrando programa.");
                    break;
                default:
                    System.out.println("Por favor, elija una opción correcta.");
            }
            System.out.println("");
            pressEnter("Presiona ENTER para continuar.");
            System.out.println("");
        } while (opcion != opciones.length);
    }

    /**
     * 1. Consultar Saldo
     * 
     * Pregunta un número de cuenta y muestra la información de la misma.
     * Guarda en la variable pos el índice de la cuenta dentro del array cuentas.
     * 
     * @param mensaje texto del mensaje a mostrar al pedir el número de cuenta
     * @return true si encuentra la cuenta y false si no la encuentra
     */
    static boolean consultaSaldo(String mensaje) {
        boolean encontrada = false;
        numCuenta = pideEntero(mensaje);
        for (int i = 0; i < cuentas.length; i++) {
            if (numCuenta == cuentas[i].getNumeroCuenta()) {
                System.out.println(cuentas[i].toString());
                encontrada = true;
                pos = i;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("No existe ese número de cuenta.");
        }
        return encontrada;
    }

    /**
     * 2. Ingresar dinero
     * 
     * Pregunta un número de cuenta y te da la opción de ingresar una cantidad.
     */
    static void ingresarDinero() {
        if (consultaSaldo("Introduzca número de cuenta para ingreso: ")) {
            double ingreso = pideDouble("Cantidad a ingresar: ");
            if (ingreso < 0) {
                System.out.println("Cantidad no válida. Para retiradas de dinero elija la opción 3.");
            } else {
                cuentas[pos].setSaldo(cuentas[pos].getSaldo() + ingreso);
                System.out.println("Nuevo saldo: " + cuentas[pos].getSaldo());
            }
        }

    }

    /**
     * 3. Sacar dinero
     * 
     * Pregunta un número de cuenta y te da la opción de retirar una cantidad.
     */
    static void sacarDinero() {
        if (consultaSaldo("Introduzca número de cuenta para sacar dinero: ")) {
            double retirada = pideDouble("Cantidad a retirar: ");
            if (retirada < 0) {
                System.out.println("Cantidad no válida. Para ingresos elija la opción 2.");
            } else if (retirada > cuentas[pos].getSaldo()) {
                System.out.println("Fondos insuficientes." + "\nOperación cancelada.");
            } else {
                cuentas[pos].setSaldo(cuentas[pos].getSaldo() - retirada);
                System.out.println("Nuevo saldo: " + cuentas[pos].getSaldo());
            }
        }
    }

    /**
     * 4. Realizar trasferencia
     * 
     * Pregunta un número de cuenta de origen, uno de destino, y una cantidad de
     * dinero para hacer una trasferencia.
     */
    static void realizarTransferencia() {
        if (consultaSaldo("Introduzca número de cuenta de origen: ")) {
            pos1 = pos;
            if (consultaSaldo("Introduzca número de cuenta de destino: ")) {
                pos2 = pos;
                double retirada = pideDouble("Cantidad a trasferir: ");
                if (retirada < 0) {
                    System.out.println("Cantidad no válida.");
                } else if (retirada > cuentas[pos1].getSaldo()) {
                    System.out.println("Fondos insuficientes." + "\nOperación cancelada.");
                } else {
                    cuentas[pos1].setSaldo(cuentas[pos1].getSaldo() - retirada);
                    cuentas[pos2].setSaldo(cuentas[pos2].getSaldo() + retirada);
                    System.out.println("Cuenta número: " + cuentas[pos1].getNumeroCuenta() + " - Nuevo saldo: "
                            + cuentas[pos1].getSaldo());
                    System.out.println("Cuenta número: " + cuentas[pos2].getNumeroCuenta() + " - Nuevo saldo: "
                            + cuentas[pos2].getSaldo());
                }
            }
        }
    }
}
