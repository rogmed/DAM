package workspacejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tema04_Act02 {

    public static void main(String[] args) {
        int num = entero_positivo();
        System.out.println("Número: "+num);
    }

    public static int entero_positivo() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Introduca un entero mayor que 0: ");
                int numero = Integer.parseInt(br.readLine());
                if (numero > 0) {
                    return numero;
                } else {
                    System.out.println("Número debe ser mayor que 0.");
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Error: " + e);

            }
        }
    }
}
