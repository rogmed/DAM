package Clases;

public class Clase06b {

    public static void main(String[] args) {
        System.out.println("Algunos ejemplos de algoritmos con array.");
        System.out.println("Array de ejemplo: int [] numeros = {3, 2, 5, 1}");
        System.out.println("");
        
        // Suma valores en un array
        System.out.println("1. Suma valores en un array.");
        int [] numeros = {3, 2, 5, 1};
        int suma = 0;
        for(int pos=0; pos<numeros.length; pos++){
            suma += numeros[pos];
        }
        System.out.println("Suma total: "+suma);
        System.out.println("");
        
        // Valor máximo
        System.out.println("2. Valor máximo.");
        int max = numeros[0];
        for(int pos = 0; pos<numeros.length; pos++){
            if(max<numeros[pos]){
                max = numeros[pos];
            }
        }
        System.out.println("Máximo: "+max);
        System.out.println("");
        
        // Valores menores y mayores que 3
        System.out.println("Valores menores, mayores e iguales a 3.");
        
        int [] menores_mayores = new int[numeros.length]; // Almacenar valores ordenados
        int pos_next = 0;   // Controla la posicion en la que vamos guardando en el nuevo array
        
        for(int pos=0; pos < numeros.length; pos++){
            if(numeros[pos]<3){
                menores_mayores[pos_next]=numeros[pos];
                pos_next++;
            }
        }
        for(int pos=0; pos < numeros.length; pos++){
            if(numeros[pos]>3){
                menores_mayores[pos_next]=numeros[pos];
                pos_next++;
            }
        }
        
        // Ordenar de máximo a mínimo
        
            
        
        
        
    }
    
}
