package Clases;

public class Clase06 {

    public static void main(String[] args) {
        String [][] turnosTrabajo = {{"Juan", "Maria"},{"Pepe"}};
        
        String [] arrayValores = {"Pepe", "Maria", "Ines"};
        
        String [] arrayValores02 = arrayValores;
        arrayValores02[0] = "Miguel";
        System.out.println(arrayValores[0]+" - "+arrayValores02[0]);
        System.out.println();
        
        String [] arrayValores03 = arrayValores.clone();
        
        String[] arrayValores04 = new String[arrayValores.length];
        for(int pos = 0; pos< arrayValores04.length; pos++){
            arrayValores04[pos] = arrayValores[pos];
        }
    }
    
}
