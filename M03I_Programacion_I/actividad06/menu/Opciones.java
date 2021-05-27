package menu;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.FileFilter;
import java.io.FileNotFoundException;

import static introduceDatos.Pregunta.*;
import static menu.Muestra.*;

public class Opciones {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String s = File.separator; // Guarda separador de rutas. En caso de linux "/" en variable "s"
    static String rutaProyecto = System.getProperty("user.dir");
    static String rutaArchivos = rutaProyecto + s + "src" + s + "actividad06" + s + "archivos" + s;
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
        File nuevo = new File(rutaArchivos + nombre);
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
        File carpeta = new File(rutaArchivos);
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
        while (lista.length > 0) {
            try {
                seleccion = pideEntero("Elija número de archivo a mostrar: ") - 1;
                System.out.println("Mostrando " + lista[seleccion].getName());
                imprimeArchivo(lista[seleccion].getAbsolutePath());
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Elija un número válido.");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        if (lista.length == 0) {
            System.out.println("No hay archivos que mostrar.");
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
        while (lista.length > 0) {
            try {
                seleccion = pideEntero("Elija número de archivo a borrar: ") - 1;
                String nombre = lista[seleccion].getName();
                boolean borrado = lista[seleccion].delete();
                if (borrado) {
                    System.out.println(nombre + " borrado.");
                }
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Elija un número válido.");
            }
        }
        if (lista.length == 0) {
            System.out.println("No hay archivos para borrar.");
        }
    }

    /**
     * 5. Renombrar archivo
     * 
     * Lista los archivos en la carpeta "archivos" y da a elegir cual renombrar.
     */
    public static void renombrarArchivo() {
        File[] lista = listarArchivos();
        int seleccion;
        while (lista.length > 0) {
            try {
                seleccion = pideEntero("Elija número de archivo a renombrar: ") - 1;
                String nombre = lista[seleccion].getName();
                System.out.println("Nuevo nombre para " + nombre + ": ");
                String nuevo_nombre = br.readLine();
                File file = new File(rutaArchivos + nuevo_nombre);
                boolean renombrado = lista[seleccion].renameTo(file);
                if (renombrado) {
                    System.out.println(nombre + " cambiado a " + file.getName());
                } else {
                    System.out.println("No se han realizado cambios.");
                }
                break;
            } catch (IOException e) {
                System.out.println(e);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Elija un número válido.");
            }
        }
        if (lista.length == 0) {
            System.out.println("No hay archivos para renombrar.");
        }
    }

    /**
     * 6. Modificar archivo
     * 
     * Lista los archivos en la carpeta "archivos" y da a elegir de cual se quiere
     * reemplazar un caracter según su posición.
     * 
     * -----------NOTA-----------------------------------------------------------
     * Al principio esta función elegía una posición e introducía un String con
     * la función .writeBytes("String"), pero la modifiqué para que hiciera
     * exactamente lo que dice el enunciado y elige un solo caracter y fuerza a
     * que se reemplace con un solo caracter.
     */
    public static void modificarArchivo() {
        File[] lista = listarArchivos();
        int seleccion;
        while (lista.length > 0) {
            try {
                seleccion = pideEntero("Elija número de archivo a modificar: ") - 1;
                String nombre = lista[seleccion].getName();
                System.out.println("Mostrando " + nombre + ": ");
                RandomAccessFile file = new RandomAccessFile(rutaArchivos + nombre, "rw");
                imprimeArchivo(lista[seleccion].getAbsolutePath());
                if (lista[seleccion].length() > 0) {
                    int posicion = pideEntero(
                            "Elija una posición para reemplazar entre 0 y " + (lista[seleccion].length() - 1) + ": ");
                    file.seek(posicion);
                    System.out.print("Reemplazar: " + (char) file.readByte() + " -> ");
                    while (true) {
                        String nuevo_char = br.readLine();
                        if (nuevo_char.length() == 1) {
                            file.seek(file.getFilePointer() - 1);
                            file.writeBytes(nuevo_char);
                            break;
                        } else {
                            System.out.print("Por favor, introduzca un unico caracter: ");
                        }
                    }
                } else {
                    System.out.println(nombre + " no contiene caracteres que reemplazar.");
                }
                file.close();
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Elija un número válido.");
            } catch (FileNotFoundException e) {
                System.out.println("Archivo no encontrado.");
            } catch (EOFException e) {
                System.out.println("Posición no válida.");
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        if (lista.length == 0) {
            System.out.println("No hay archivos para modificar.");
        }
    }
}
