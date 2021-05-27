/**
 * Rogelio Medina Medina
 * 
*/

package actividadT09;

import actividadT09.seguros.*;
import actividadT09.vehiculos.Carga;
import actividadT09.vehiculos.Coche;
import actividadT09.vehiculos.IAlquilable;
import static actividadT09.vehiculos.Utilidades.*;

public class GestionConcesionario {

    static int opcion;
    static int numVehiculos;
    static int numSeguros;
    static int diasAlquiler;
    static double importe;
    static IAlquilable[] seguros = {
            new Seguro("Gold", "El mejor. Pase lo que pase estás cubierto y te tratan como a un rey."),
            new Seguro("Silver", "Está muy bien también. Cubre todo lo básico para que no te preocupes de nada."), };
    static IAlquilable[] flota = { 
            new Coche("8271MAJ", "Volvo S60", 5, "A"),
            new Coche("8644KAL", "Opel Corsa", 4, "C"),
            new Carga("2435GSS", "Toyota Furgo3000", 3, 2.9),
            new Carga("2346KHL", "MAN SuperCamion", 2, 20), };
    static IAlquilable[] alquiler = null;

    public static void main(String[] args) {

        String[] opciones = { "Salir", "Mostrar la información de la flota",
                "Mostrar la información de los seguros disponible",
                "Reiniciar el alquiler indicando el total de vehículos y seguros que se quiere alquilar (entre 1 y 5)",
                "Establecer el número de días del alquiler", "Mostrar el alquiler", };

        do {
            linea("Gestion de concesionario:");
            opcion = muestraMenu(opciones);
            switch (opcion) {
                case 0:
                    System.out.println("Cerrando programa.");
                    return;
                case 1:
                    mostrarArrayToString(flota);
                    break;
                case 2:
                    mostrarArrayToString(seguros);
                    break;
                case 3:
                    reiniciarAlquiler();
                    break;
                case 4:
                    establecerDias();
                    break;
                case 5:
                    if (!mostrarArrayToString(alquiler)){
                        System.out.println("Alquiler vacío. Use opción 3 para iniciar un nuevo alquiler.");
                    } else {
                        importe = 0;
                        for (IAlquilable item:alquiler) {
                            importe += item.getPrecioTotalAlquilerPorDias();
                        }
                        linea("Importe total: " + String.format("%.2f",importe) + "€");
                    }
                    
                    break;
                default:
                    System.out.println("Introduzca una opción válida.");
            }
            pressEnter("Presiona ENTER");
        } while (opcion != 0);
    }

    static boolean mostrarArrayToString(IAlquilable[] items) {
        if (items == null) {
            return false;
        } else {
            for (int i = 0; i < items.length; i++) {
                System.out.println(i + 1 + ".- " + items[i].toString());
            }
            return true;
        }
    }

    static void reiniciarAlquiler() {
        String confirmacion = pideString("¿Desea reiniciar el alquilar y empezar de cero? (S/N)");
        confirmacion = confirmacion.toLowerCase();
        if (confirmacion.equals("s") || confirmacion.equals("si") || confirmacion.equals("y")) {
            alquiler = new IAlquilable[pideEntero("Total de vehículos mas seguros a añadir (entre 1 y 5): ", 0, 5)];
            for (int i = 0; i < alquiler.length; i++) {
                opcion = pideEntero("(1) Añade vehículo (2) Añade seguro: ", 1, 2);
                if (opcion == 1) {
                    mostrarArrayToString(flota);
                    alquiler[i] = flota[pideEntero("Vehículo a añadir: ", 1, flota.length)-1];
                    System.out.println("Añadido " + alquiler[i].getNombre());
                } else if (opcion == 2) {
                    mostrarArrayToString(seguros);
                    alquiler[i] = seguros[pideEntero("Seguro a añadir: ", 1, seguros.length)-1];
                    System.out.println("Añadido " + alquiler[i].getNombre());
                }
            }

        } else {
            System.out.println("Operación cancelada.");
        }
        System.out.println("");
    }

    static void establecerDias() {
        if (alquiler != null) {
            diasAlquiler = pideEntero("Introduzca número de dias para el alquiler (1 a 30): ", 1, 30);
            for (IAlquilable item:alquiler){
                item.setNumeroDias(diasAlquiler);
            }
            System.out.println("Alquiler establecido a " + diasAlquiler + " dias.");
        } else {
            System.out.println("Alquiler vacío. Use opción 3 para iniciar un nuevo alquiler.");
        }


    }

}
