// Rogelio Medina Medina
// 11-02-2021
/* Crea un programa de nombre Ejemplo3Numeros que pida 3 valores decimales y que:
Muestre el resultado de multiplicar los 3
Muestre el resultado de sumar los 3
Muestre por consola si el 1er número es mayor que el 2o
Muestre por consola si los 3 números son iguales
Muestre por consola si el 1er número es múltiple de 2
*/

package UF1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Ejemplo3Numeros {
    public static void main (String[] args) throws IOException {
        System.out.println("Introduce tres decimales (A, B, C):");
        
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        
        System.out.print("Introduce A: ");
        Float A = Float.parseFloat(br.readLine());
        
        System.out.print("Introduce B: ");
        Float B = Float.parseFloat(br.readLine());
        
        System.out.print("Introduce C: ");
        Float C = Float.parseFloat(br.readLine());
        
        System.out.println("");
        
        // 1. Muestre el resultado de multiplicar los 3
        System.out.println("Resultado de multiplicar los 3.");
        Float aux1 = A * B * C;
        System.out.println((A) + " * " + (B) + " * " + (C) + " = " + (aux1));
        System.out.println("");
        
        // 2. Muestre el resultado de sumar los 3
        System.out.println("Resultado de sumar los 3.");
        Float aux2 = A + B + C;
        System.out.println((A) + " + " + (B) + " * " + (C) + " = " + (aux2));
        System.out.println("");
        
        // 3. Muestre por consola si el 1er número es mayor que el 2o
        System.out.println("Comprobar si el 1er número es mayor que el 2o.");
        if (A > B){
            System.out.println("- A es mayor que B.");
        }else{
            System.out.println("A no es mayor que B.");
        }
        System.out.println("");
        
        // 4. Muestre por consola si los 3 números son iguales
        System.out.println("Comprobar si los 3 números son iguales.");
        if ((Objects.equals(A, B)) && (Objects.equals(B, C))) {
            System.out.println("A, B y C son iguales.");
        }else{
            System.out.println("A, B y C no son iguales.");
        }
        System.out.println("");
        
        // 5. Muestre por consola si el 1er número es múltiple de 2
        System.out.println("Comprobar si el 1er número es múltiple de 2.");
        if ((A % 2 == 0) && (A != 0)) {
            System.out.println("A es múltiplo de 2.");
        }else{
            System.out.println("A no es múltiplo de 2");
        }
        System.out.println("");

    }
}
