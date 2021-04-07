package actividad03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ejercicio01 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[] numeros = new double[5];
        double[] numeros_ordenados = new double[numeros.length]; // Array para ordenar en pares e impares
        int pos; // Variable para controlar la posicion dentro del array numeros[]
        int pos_next; // Variable para controlar posicion dentro del array numeros_ordenados[]
        int opcion_menu = 1;
        double resultado;
        double max;
        double min;
        boolean error;
        double valor_introducido = 0;

        System.out.println("Introduzca 5 valores decimales entre 0 y 100.");

        for (pos = 0; pos < numeros.length; pos++) {
            error = true;
            while (error) {
                System.out.print("Introduzca valor " + pos + ": ");
                try {
                    valor_introducido = Double.parseDouble(br.readLine());

                } catch (NumberFormatException e) {
                    System.out.println("Por favor, introduzca un valor decimal válido.");
                }
                if (0 <= valor_introducido && valor_introducido <= 100) {
                    numeros[pos] = valor_introducido;
                    error = false;
                } else if (0 > valor_introducido || valor_introducido > 100) {
                    System.out.println("Por favor, introduzca solo decimales entre 0 y 100.");
                }
            }
        }

        System.out.println("");
        do {

            System.out.println("Presiona ENTER para continuar.");
            br.readLine();
            System.out.println("Contenidos del array " + numeros + ":");
            for (pos = 0; pos < numeros.length; pos++) {
                System.out.println("numeros[" + pos + "]: " + numeros[pos]);
            }

            System.out.println("\nIntroduzca la operación a realizar del siguiente menú de opciones: \n"
                    + "1- Modificar el valor almacenado en una posición. \n"
                    + "2- Mostrar el resultado de sumar todos los números \n"
                    + "3- Mostrar el número más alto y más bajo. \n"
                    + "4- Ordena el array situando primero todos los números pares y luego los impares\n"
                    + "0- Finalizar");
            error = true;
            while (error) {
                try {
                    System.out.print("Elija opción: ");
                    opcion_menu = Integer.parseInt(br.readLine());
                    error = false;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Introduzca una opción válida.");
                }
            }

            switch (opcion_menu) {
                case 1:
                    System.out.println("Elija posición a modificar del 0 al " + (numeros.length - 1) + ".");
                    pos = Integer.parseInt(br.readLine());
                    error = true;
                    while (error) {
                        System.out.print("Introduzca valor para numeros[" + pos + "] : ");
                        try {
                            valor_introducido = Double.parseDouble(br.readLine());

                        } catch (NumberFormatException e) {
                            System.out.println("Por favor, introduzca un valor decimal válido.");
                        }
                        if (0 <= valor_introducido && valor_introducido <= 100) {
                            numeros[pos] = valor_introducido;
                            error = false;
                        } else if (0 > valor_introducido || valor_introducido > 100) {
                            System.out.println("Por favor, introduzca solo decimales entre 0 y 100.");
                        }
                    }
                    System.out.println("");
                    break;
                case 2:
                    resultado = 0;
                    for (pos = 0; pos < numeros.length; pos++) {
                        resultado += numeros[pos];
                    }
                    System.out.println("Suma total: " + resultado);
                    System.out.println("");
                    break;
                case 3:
                    max = min = numeros[0];
                    for (pos = 1; pos < numeros.length; pos++) {
                        if (max < numeros[pos]) {
                            max = numeros[pos];
                        }
                        if (min > numeros[pos]) {
                            min = numeros[pos];
                        }
                    }
                    System.out.println("Máximo: " + max + "\nMínimo: " + min);
                    System.out.println("");
                    break;
                case 4:
                    pos_next = 0;
                    for (pos = 0; pos < numeros.length; pos++) {
                        if (numeros[pos] % 2 == 0) {
                            numeros_ordenados[pos_next] = numeros[pos];
                            pos_next++;
                        }
                    }
                    for (pos = 0; pos < numeros.length; pos++) {
                        if (numeros[pos] % 2 != 0) {
                            numeros_ordenados[pos_next] = numeros[pos];
                            pos_next++;
                        }
                    }
                    for (pos = 0; pos < numeros.length; pos++) {
                        numeros[pos] = numeros_ordenados[pos];
                    }
                    System.out.println("Array ordenado con numeros pares al princpio e impares al final.");
                    break;
                case 0:
                    System.out.println("Finalizando programa.");
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion_menu != 0);
    }
}
