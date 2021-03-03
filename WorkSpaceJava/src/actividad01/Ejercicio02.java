// Actividad01 - Ejercicio02
// Rogelio Medina Medina
// 11-02-2021

package actividad01;

public class Ejercicio02 {

    public static void main(String[] args) {
        
    // 3. TIPOS DE VARIABLES
    
    System.out.println("TIPOS DE VARIABLE.\n");

    //Tipo de dato entero de 32 bits de longitud
    int variableEntera =10;
    System.out.println("Variable tipo int muestra datos enteros de 32 bits. Ejemplo:"+variableEntera);
    
    //Tipo de dato booleano de 1 bit de longitud
    boolean verdadero = true;
    System.out.println("Variable tipo boolean muestra verdadero (true) o falso (false). Ejemplo: " + verdadero);
    
    //Tipo de dato byte de 1 byte de longitud
    byte num_byte = 127;
    System.out.println("Variable tipo byte muestra números enteros entre -128 y 127 y ocupa 1 byte. Ejemplo: " + num_byte);
    
    //Tipo de dato char de 2 byte de longitud
    char letra = 'A';
    System.out.println("Variable tipo char muestra caracteres en Unicode de 16 bits. Ejemplo: " + letra);
    
    //Tipo de dato short de 2 bytes de longitud
    short num_short = 9000;
    System.out.println("Variable de tipò short muestra enteros de 16 bits. Ejemplo: " + num_short);
    
    //Tipo de dato long de 64 bits de longitud
    long num_long = 314159265;
    System.out.println("Variable tipo long muestra enteros de 64 bits. Ejemplo: " + num_long);
    
    //Tipo de dato float de 32 bits de longitud
    float pi = 3.1415926535897932384626433832795f;
    System.out.println("Variable de tipo float de 32 bits muestra números con decimales. Ejemplo: " + pi);
    
    //Tipo de dato double de 64 bits de longitud
    double pi_ext = 3.1415926535897932384626433832795;
    System.out.println("Variable de tipo double de 64 bits muestra números con decimales. Ejemplo: " + pi_ext);
    
    //Tipo de dato String almacena un conjunto de texto
    String texto = "Ey mira, un mono de tres cabezas.";
    System.out.println("Variable String almacena una cadena de texto. Ejemplo: " + texto);
    
    //Tipo de dato Array almacena un conjunto de variables
    int[] valores = new int[]{4, 8, 15, 16, 23, 42};
    System.out.println("Variable de tipo Array almacena una lista de valores. Ejemplo: " + valores[0]
    + ", " + valores[1]
    + ", " + valores[2]
    + ", " + valores[3]
    + ", " + valores[4]
    + ", " + valores[5]);
    
    System.out.println("\n=====================================================\n\n");
    
    // 4. OPERADORES ARITMÉTICOS, RELACIONES, LÓGICOS, UNITARIOS Y DE ASIGNACIÓN
    
    System.out.println("TIPOS DE OPERADORES\n");
    
    System.out.println("--Operadores aritméticos binarios--\n");
   
    // Ejemplo de operadores aritméticos "+", "-", "*", y "/".
    System.out.println("Ejemplo de operadores aritméticos \"+\", \"-\", \"*\", y \"/\"");
    int resultado = 12 - 2 * 21 + 100 / 2;
    System.out.println("El resultado de 12 - 2 * 21 + 100 / 2 = " + resultado);
    System.out.println("");
    
    // Ejemplo de resto "%".
    System.out.println("Ejemplo de resto \"%\".");
    resultado = 12 % 5;
    System.out.println("El resultado de 12 % 5 = " + resultado);
    System.out.println("");
    
    System.out.println("--Operadores aritméticos unarios--\n");
    
    // Ejemplo de ++
    System.out.println("Ejemplo de ++");
    resultado = 5;
    resultado ++;
    System.out.println("Usamos resultado ++ para incrementar en 1: " + resultado);
    System.out.println("");
    
    // Ejemplo de --
    System.out.println("Ejemplo de -- ");
    resultado --;
    System.out.println("Usamos resultado -- para volver a bajar a 5: " + resultado);
    System.out.println("");
    
    // Ejemplo de !
    System.out.println("Ejemplo de !");
    boolean soleado = true;
    System.out.println("Cambia un valor booleano. Ejemplo:");
    System.out.println("soleado: " + soleado);
    soleado = !soleado;
    System.out.println("!soleado: " + soleado);
    System.out.println("");
    
    System.out.println("--Operadores aritméticos de asignación--\n");
    
      // Ejemplo += -= *=
    System.out.println("Ejemplo de += -= *=");
    resultado += 10;
    System.out.println("resultado += 10 : " + resultado);
    resultado -= 5;
    System.out.println("resultado -= 5 : " + resultado);
    resultado *= 2;
    System.out.println("resultado *= 2 : " + resultado);
    resultado /= 4;
    System.out.println("resultado /= 4 : " + resultado);
    resultado %= 2;
    System.out.println("resultado %= 2 : " + resultado);
    System.out.println("");
    
    System.out.println("--Operadores relacionales--\n");

    //Ejemplos de ==, !=, >, <, >=, <=
    System.out.println("Ejemplos para A = 10 y B = 20");
    int A = 10;
    int B = 20;
    System.out.println("A == B: " + (A == B));
    System.out.println("A != B: " + (A != B));
    System.out.println("A > B: " + (A > B));
    System.out.println("A < B: " + (A < B));
    System.out.println("A >= B: " + (A >= B));
    System.out.println("A <= B: " + (A <= B));
    
    System.out.println("--Operadores lógicos--\n");

    //Ejemplos de &&, ||, !
    System.out.println("Ejemplo con variables viento, lluvia y nublado");
    boolean viento = false;
    boolean lluvia = false;
    boolean nublado = true;
    System.out.println("viento: " + viento);
    System.out.println("lluvia: " + lluvia);
    System.out.println("nublado: " + nublado);
    System.out.println("lluvia && nublado: " + (lluvia && nublado));
    System.out.println("lluvia || nublado: " + (lluvia || nublado));
    System.out.println("!viento: " + !viento);
    
    System.out.println("");
    }
    
}
