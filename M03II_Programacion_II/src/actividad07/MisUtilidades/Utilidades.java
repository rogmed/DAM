package actividad07.MisUtilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utilidades {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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
        while (true) {
            try {
                System.out.print(pregunta);
                int num = Integer.parseInt(br.readLine());
                return num;
            } catch (IOException e) {
                System.out.println("Error: " + e);
            } catch (NumberFormatException e) {
                System.out.println("Error: Introduce un valor entero valido.");
            } catch (Exception e) {
                System.out.println("Error: " + e);
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
     * Pide String
     * 
     * Recibe un string que será el mensaje mostrado por pantalla para pedir un
     * String por teclado. Muestra error y sigue preguntando por un valor
     * hasta que se introduce un String válido. Devuelve el String.
     * 
     * @param pregunta string con mensaje para pedir valor al usuario
     * @return String introducido por usuario.
     */
    public static String pideString(String pregunta) {
        while (true) {
            try {
                System.out.print(pregunta);
                String texto = br.readLine();
                return texto;
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }

    /**
     * Pide char
     * 
     * Recibe un string que será el mensaje mostrado por pantalla para pedir un
     * char por teclado. Muestra error y sigue preguntando por un valor
     * hasta que se introduce un char válido. Devuelve el char.
     * 
     * @param pregunta string con mensaje para pedir valor al usuario
     * @return char introducido por usuario.
     */
    public static char pideChar(String pregunta) {
        while (true) {
            try {
                System.out.print(pregunta);
                char texto = (char) System.in.read();
                return texto;
            } catch (Exception e) {
                System.out.println("Error: " + e);
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
        for (int i = 0; i < opciones.length; i++) {
            System.out.println(i + ". " + opciones[i]);
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

    /**
     * Imprime líneas envolviendo texto
     * 
     * Envuelve texto en un sandwich de lineas
     * 
     * @param texto texto a envolver
     */
    public static void linea(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print("-");
        }
        System.out.print("\n");
        System.out.println(texto);
        for (int i = 0; i < texto.length(); i++) {
            System.out.print("-");
        }
        System.out.print("\n");
    }

}
