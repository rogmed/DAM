package T2_Estructuras_Basicas_de_Control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploControlDeFlujo {

  
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String teclado;

        while (true){
            System.out.println("Elige una opción:\n"
                    + " 1- Muestra los números del 20 al 40 con un while.\n"
                    + " 2- Muestra los números del 50 al 30 con un bucle for.\n"
                    + " 0- Finaliza el programa.\n");
            teclado = br.readLine();
            String option = teclado;
                switch (option) {
                    case "1":
                        int k = 20;
                        while(k<=40){
                            System.out.println(k);
                            k++;
                        }
                        break;
                    case "2":
                        for(int i=50; i>=30; i--){
                            System.out.println(i);
                        }   break;
                    case "0":
                        return;
                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
        } 
    }
}
