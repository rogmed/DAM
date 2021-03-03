package actividad05.introduceDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pregunta {

    public static void main(String[] args) {
        int x = pideEntero("Introduce entero: ");
        System.out.println("Has inroducido: " + x);

        double y = pideDouble("Introduce decimal:");
        System.out.println("Has introducido: "+y);
    }

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
                System.out.println(e+"\nIntroduce un valor entero valido.");
            }
        }
    }

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
                System.out.println(e+"\nIntroduce un valor decimal valido.");
            }
        }
    }
}
