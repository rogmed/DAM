package menu;

import static introduceDatos.Pregunta.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Muestra {

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
        for (int i = 1; i < opciones.length; i++) {
            System.out.println(i + ". " + opciones[i]);
        }
        int seleccion = pideEntero("Elija opción: ");
        return seleccion;
    }

    /**
     * Imprime archivo
     * 
     * Muestra un menu de opciones y retorna la opción elegida en forma de int.
     * 
     * @param file archivo del que mostrar el contenido.
     */
    public static void imprimeArchivo(String ruta_archivo) {
        try {
            File file = new File(ruta_archivo);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String linea_texto = br.readLine();
            while (linea_texto != null) {
                System.out.println(linea_texto);
                linea_texto = br.readLine();
            }
            br.close();
        } catch (NumberFormatException e) {
            System.out.println("No hay archivos que mostrar.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
