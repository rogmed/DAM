package actividad07.ejercicio02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utilidades {

    /**
     * Pide entero
     * 
     * Recibe un string que será el mensaje mostrado por pantalla para pedir un
     * entero por teclado. Muestra error y sigue preguntando por un valor hasta que
     * se introduce un entero válido. Devuelve el entero (num).
     * 
     * @param pregunta string con mensaje para pedir valor al usuario
     * @return entero (num) introducido por el usuario
     */
    public static int pideEntero(String pregunta) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.print(pregunta);
                int num = Integer.parseInt(br.readLine());
                return num;
            } catch (IOException e) {
                System.out.println("Error: " + e);
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un valor entero valido.");
            }
        }
    }


    /**
     * Pide entero con min/max
     * 
     * Recibe un string que será el mensaje mostrado por pantalla para pedir un
     * entero por teclado. Muestra error y sigue preguntando por un valor hasta que
     * se introduce un entero válido. Devuelve el entero (num).
     * 
     * @param pregunta string con mensaje para pedir valor al usuario
     * @param min      valor mínimo en int
     * @param max      valor máximo en int
     * @return entero (num) introducido por el usuario
     */
    public static int pideEntero(String pregunta, int min, int max) {
        while (true) {
            int num = pideEntero(pregunta);
            if (num >= min && num <= max) {
                return num;
            } else {
                System.out.println("Introduzca valor entre " + min + " y " + max);
            }
        }
    }

    
    /**
     * Pide double
     * 
     * Recibe un string que será el mensaje mostrado por pantalla para pedir un
     * decimal (double) por teclado. Muestra error y sigue preguntando por un valor
     * hasta que se introduce un decimal válido. Devuelve el decimal (num).
     * 
     * @param pregunta string con mensaje para pedir valor al usuario
     * @return decimal (num) introducido por el usuario
     */
    public static double pideDouble(String pregunta) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.print(pregunta);
                double num = Double.parseDouble(br.readLine());
                return num;
            } catch (IOException e) {
                System.out.println("Error: " + e);
            } catch (NumberFormatException e) {
                System.out.println("Introduce un valor decimal valido.");
            }
        }
    }

    /**
     * Muestra menu
     * 
     * Muestra un menu de opciones y retorna la opción elegida en forma de int.
     * 
     * @param opciones array de strings con texto de las opciones a mostrar.
     * @return opción elegida en forma de int.
     */
    public static int muestraMenu(String[] opciones) {
        System.out.println("");
        for (int i = 0; i < opciones.length; i++) {
            System.out.println(i + 1 + ". " + opciones[i]);
        }
        int seleccion = pideEntero("Elija opción: ");
        return seleccion;
    }

    /**
     * Presiona Enter
     * 
     * Para el programa, muestra un mensaje y continua tras presionar Enter tecla
     * 
     * @param texto String con mensaje a mostrar
     */
    public static void pressEnter(String texto) {
        System.out.println(texto);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            br.readLine();
        } catch (Exception e) {
        }
    }

    /**
     * Imprime línea
     * 
     * Imprime una linea de n "-"
     * 
     * @param n longitud de la línea
     */
    public static void linea(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.print("\n");
    }

}
