package Clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clase03 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            System.out.println("Introduce número: ");
            Float numero = Float.parseFloat(br.readLine());
        
            if (10 < numero && numero < 20){
                System.out.println("Número entre 10 y 20.");
                break;
            }
        }
        double otro_numero = 5;
        while(otro_numero <= 10) {
            System.out.println(otro_numero++);
        }
        
        // EJEMPLOS
        
        // WHILE
        int x = 10;
        
        while(x>0){
            // El código aquí dentro se ejecuta mientras while(true)
            // Puedes romperlo con break; o return;
        }
        
        // FOR
        for (int y = 0; y < 10; y++){
            // Este código se va a ejecutar mientras (y < 0)
            // Se declara "y" y se declara el incremento "y++"
        }
        
        //DO-WHILE
        int i = 0;
        do {
            //Se ejecuta esto al menos una vez, y se repite mientras abajo
            // halla while(true)
            System.out.println(i++);
        } while(i<10);
        
        //SWITCH
        System.out.println("Introducir opción: ");
        int opcion = Integer.parseInt(br.readLine());
        
        switch (opcion){
            case 1:
                //Hacer opción 1
                break;
            case 2:
                //Hacer opción 2
                break;
            case 0:
                //Hacer opción 0... ej: salir
                break;
            default:
                //Hacer opción por defecto
        }
        
    }
}
