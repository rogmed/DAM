package workspacejava;

import java.io.*;

public class WorkSpaceJava {
    
    public static void main(String[] args) throws IOException {
        System.out.println("Hola, ¿cómo te llamas?");
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        
        String nombre = br.readLine();
        
        System.out.println("Bienvenido, " + nombre + ".");
    }
    
}
