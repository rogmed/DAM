package menu;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static introduceDatos.Pregunta.*;

public class Opciones {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String rutaProyecto = System.getProperty("user.dir");
    static String s = File.separator; // Guarda separador de rutas. En caso de linux "/" en variable "s"
    static String linea = System.getProperty("line.separator");

    /**
     * 1. Nuevo archivo
     * 
     * Pide un nombre al usuario y crea un archivo con ese nombre en la ruta
     * recibida como parámetro.
     * 
     * @throws IOException
     */
    public static void nuevoArchivo() {
        String nombre;
        System.out.println("Introduzca nombre de archivo: ");
        while (true) {
            try {
                nombre = br.readLine();
                break;
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
        File nuevo = new File(rutaProyecto + s + "src" + s + "actividad06" + s + "archivos" + s + nombre);
        try {
            nuevo.createNewFile();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    /**
     * 2. Listar Archivos
     * 
     * Lista y numera los archivos contenidos en la carpeta "archivos", excluyendo
     * las carpetas.
     * 
     * @return contenidos array tipo File[] con los archivos listados.
     */
    public static File[] listarArchivos() {
        File carpeta = new File(rutaProyecto + s + "src" + s + "actividad06" + s + "archivos");

        FileFilter fileFilter = new FileFilter() {
            public boolean accept(File file) {
                return file.isFile();
            }
        };

        File[] contenidos = carpeta.listFiles(fileFilter);
        int i = 0;
        for (File archivo : contenidos) {
            i++;
            System.out.println(i + " - " + archivo.getName());
        }
        return contenidos;
    }

    /**
     * 3. Muestra un archivo
     * 
     * Lista los archivos en la carpeta "archivos" y da a elegir cual leer.
     * 
     * @throws IOException
     */
    public static void muestraArchivo() {
        File[] lista = listarArchivos();
        int seleccion;

        seleccion = pideEntero("Elija número de archivo a mostrar: ") - 1;

        System.out.println("Mostrando " + lista[seleccion].getName());

        try {
            FileReader fr = new FileReader(lista[seleccion]);
            BufferedReader br = new BufferedReader(fr);
            String linea_texto = br.readLine();
            while (linea_texto != null) {
                System.out.println(linea_texto);
                linea_texto = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    /**
     * 4. Borrar archivo
     * 
     * Lista los archivos en la carpeta "archivos" y da a elegir cual borrar.
     */
    public static void borrarArchivo() {
        File[] lista = listarArchivos();
        int seleccion;
        while (true) {
            try {
                seleccion = pideEntero("Elija número de archivo a borrar: ") - 1;

                String nombre = lista[seleccion].getName();
                boolean borrado = lista[seleccion].delete();

                if (borrado) {
                    System.out.println(nombre + " borrado.");
                }
                break;
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                System.out.println("Elija un número válido.");
            }
        }
    }
}
