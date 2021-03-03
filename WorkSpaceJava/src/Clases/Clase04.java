/* 19-02-2020
    1. Repaso estructuras de control
    2. Debuggeo
*/
package Clases;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author titto
 */
public class Clase04 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        // CAPTURAR ERRORES

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion = 0;

        boolean valorIncorrecto = true;

        while (valorIncorrecto) {
            String textoEscrito = br.readLine();
            try {
                opcion = Integer.parseInt(textoEscrito);
                valorIncorrecto = false;
            } catch (NumberFormatException e) {
                System.out.println("Se ha producido un error \n " + e.getMessage());
                System.out.println("Tiene que ser un valor numérico");
            } catch (Exception e2) {
                System.out.println("Algún error "+e2.getMessage());
            }
        }
    }
}
