package Clases;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Clase05 {

    public static void main(String[] args) throws IOException {

        java.io.BufferedReader br = new java.io.BufferedReader(new InputStreamReader(System.in));

        double lista_precios[];

        System.out.println("Cuantos precios quieres guardar?");
        int numeroPrecios = Integer.parseInt(br.readLine());

        lista_precios = new double[numeroPrecios];

        for (int i = 0; i < numeroPrecios; i++) {
            System.out.print("Introduce precio " + i + ": ");
            lista_precios[i] = Double.parseDouble(br.readLine());
        }
        System.out.println("");
        System.out.println("Array: "+lista_precios); // Dirección de memoria donde se guarda el array

        for (int i = 0; i < numeroPrecios; i++) {
            System.out.println("Precio " + i + ": " + lista_precios[i]);
        }
        
        // FOR-EACH
        System.out.println("");
        int i = 0;
        System.out.println("Mostrar valor con for-each");
        for(double precio : lista_precios){
            System.out.println("Precio "+i+": "+precio);
            i++;
        }
    }
}
