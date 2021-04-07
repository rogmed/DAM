package Clases;

public class Clase05b {

    public static void main(String[] args) {
        // EJEMPLOS INICIALIZAR ARRAY
        
        double [] precios = new double[8];
        precios[0] = 4.5;
        precios[1] = 8;
        precios[2] = 2;
        
        double [] otros_precios = {4.5, 8, 2};
        
        // ARRAY MULTIDIMENSIONAL
        
        double [][] precios_productos = new double[2][3];
        //precios_productos[0]={5, 6.6, 2};
        //precios_productos[1]={10, 8, 2.5};
        precios_productos[0][0]=5;
        precios_productos[0][1]=6.6;
        precios_productos[0][2]=2;
        precios_productos[1][0]=10;
        precios_productos[1][1]=8;
        precios_productos[1][2]=2.5;
        
        // RECORRER ARRAY MULTIDIMENSIONAL
        for(int i=0; i<precios_productos.length; i++){
            for(int j=0; j<precios_productos[i].length ; j++){
                System.out.println("precios_productos["+i+"]["+j+"]: "+precios_productos[i][j]);
            }
        }
    }  
}
