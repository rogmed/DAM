package actividad06.introduceDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pregunta {

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
                System.out.println(e + "\nIntroduce un valor entero valido.");
            }
        }
    }

    /**
     * Pide double
     * 
     * Recibe un string que será el mensaje mostrado por pantalla para pedir un
     * decimal (double) por teclado. Muestra error y sigue preguntando por un
     * valor hasta que se introduce un decimal válido. Devuelve el decimal (num).
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
                System.out.println(e + "\nIntroduce un valor decimal valido.");
            }
        }
    }
}
