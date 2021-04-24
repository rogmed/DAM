package Clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Clase11{
    public static void main(String[] args) throws IOException {
        // Ruta de proyecto. Donde se encuentra el directorio WorkSpaceJava
        // Este bloque hace que funcione con independencia del SO
        String rutaProyecto = System.getProperty("user.dir");
        System.out.println(rutaProyecto);
        String s = File.separator; //Guarda separador de rutas. En caso de linux "/" en variable "s"
        String linea = System.getProperty("line.separator");

        // Leer de archivo
        //Informacion sobre el fichero (necesita java.io.File).
        File document = new File(rutaProyecto + s + "archivos" + s + "prueba_java"); 
        //Stream conectado al fichero a leer (necesita java.io.FileReader).
        FileReader fr = new FileReader(document); 

        BufferedReader br = new BufferedReader(fr);
        String linea_texto = br.readLine();

        // Almacenar contenido para poder concatenar mas tarde con escritura.
        String contenido_file = "";

        // Bucle para ir imprimiendo cada linea y leer la siguiente.
        while(linea_texto != null){
            System.out.println(linea_texto);
            contenido_file += linea_texto + linea;
            linea_texto = br.readLine();
        }
        // Cerrar archivo para no bloquear escrita de otros procesos
        br.close();

        // Escritura a archivo
        // Vamos a usar el mismo archivo "document"
        // Stream conectado al fichero a escribir (necesita java.io.FileWriter)
        FileWriter fw = new FileWriter(document);
        // Buffer que almacena datos hacia el stream (java.io.BufferedWriter)
        BufferedWriter bw = new BufferedWriter(fw);

        // Escribe el contenido almacenado anteriormente.
        bw.write(contenido_file);

        // Guarda los datos en el buffer
        bw.write("Nuevo texto");

        // Envia los datos que queden al buffer
        bw.flush();
        // Se liberan los recursos asignados al outputStream.
        bw.close();


        // VER DIRECTORIO Y SUS CONTENIDOS
        File carpetaArchivos = new File (rutaProyecto + s + "archivos");
        System.out.println("Es carpeta: " + carpetaArchivos.isDirectory());
        System.out.println("Es archivo: " + carpetaArchivos.isFile());
        System.out.println("Existe: " + carpetaArchivos.exists());

        String [] listaNombresArchivos = carpetaArchivos.list();
        for (int i=0; i < listaNombresArchivos.length ; i++) {
            System.out.println(listaNombresArchivos[i]);
        }

        File[] listadoFiles = carpetaArchivos.listFiles();
        File segundoFile = listadoFiles[1];
        System.out.println("Segundo archivo o carpeta: " + segundoFile.getName());
        System.out.println("Es archivo: " + segundoFile.isFile());


    }

}





