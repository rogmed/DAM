/*
Rogelio Medina Medina
32066868-S
rogeliomdn@gmail.com
DAM - Linkia
20-21_2_DAM_M03IA_Programación I
DAM_M03I_20-21_2_ACAS > UF2: Diseño modular > Práctica de funciones y librerías
actividad04
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio01 {

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.print("\nElija una opción:\n" + "1. Conversor de euros a LINKIA_COINS.\n"
                    + "2. Calcula el día de la semana.\n" + "3. Realiza progresión.\n" + "4. Salir.\n" + "Opción: ");
            opcion = pideEntero();
            System.out.println("");

            switch (opcion) {
            case 1:
                System.out.print("Introduzca cantidad en Euros (€): ");
                double resultado = conversorEuroLinkia(pideDouble());
                System.out.println(resultado + " Linkia Coin");
                break;
            case 2:
                System.out.println(diaDeLaSemana());
                break;
            case 3:
                System.out.print("Introduzca primer valor: ");
                int num1 = pideEntero();
                System.out.print("Introduzca segundo valor: ");
                int num2 = pideEntero();
                progresionDescendente(num1, num2);
                break;
            case 4:
                break;
            default:
                System.out.println("Elija una opción válida");
            }
        } while (opcion != 4);
    }

    /** 
     * Pide entero.
     * 
     * Pide un número entero por teclado. Si se introduce un valor no válido
     * sigue pidiendo hasta que se introduce un entero.
     * 
     * @return numero   valor entero.
     */
    public static int pideEntero() {
        BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                int numero = Integer.parseInt(br.readLine());
                return numero;
            } catch (IOException e) {
                System.out.println("Error: " + e);
            } catch (NumberFormatException e) {
                System.out.println("Error. Introduzca un número entero.");
            }
        }
    }

    /**
     * Función para leer un número double por teclado.
     * 
     * @return numero   valor double.
     */
    public static double pideDouble() {
        BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                double numero = Double.parseDouble(br.readLine());
                return numero;
            } catch (IOException e) {
                System.out.println("Error: " + e);
            } catch (NumberFormatException e) {
                System.out.println("Error. Introduzca un número decimal.");
            }
        }
    }

    /**
     * Conversor de Euros a Linkia Coin.
     * 
     * Recibe valor en euros y devuelve conversión a Linkia Coin.
     * 
     * @param eur   cantidad de Euros a convertir
     * @return      cantidad equivalente en Linkia Coin
     */
    public static double conversorEuroLinkia(double eur) {
        double linkia_coin = eur * 0.5;
        return linkia_coin;
    }

    /**
     * Dia de la semana
     * 
     * Pide un número de la semana por consola y devuelve el nombre del día
     * correspondiente (dias_semana[pos]).
     * 
     * @return  dia de la semana en un string
     */
    public static String diaDeLaSemana() {
        String[] dias_semana = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
        System.out.print("Introduzca número de día de la semana: ");
        while (true) {
            try {
                int numero_dia = pideEntero();
                int pos = numero_dia - 1;
                return dias_semana[pos];
            } catch (Exception e) {
                System.out.println("Introduce un valor entre 1 y 7.");
            }
        }
    }

    /**
     * Progresión descendente
     * 
     * Recibe dos números enteros y muestra por consola una progresión descendente
     * del mayor al menor. No devuelve nada.
     * 
     * @param num1  base
     * @param num2  exponente
     */
    public static void progresionDescendente(int num1, int num2) {
        for (int i = Math.max(num1, num2); i >= Math.min(num1, num2); i--) {
            System.out.println(i);
        }
    }
}
