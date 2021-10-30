package Clases;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase06 {
    public static void main(String[] args) throws Exception {
        System.out.println("Clase 06");
        // 1. Test units con JUnit 5 y similares
        // Capturar errores y crear excepciones

        // *** try catch ***
        try {
            // Código que se ejecuta
        } catch(ArithmeticException e) {
            // Se capturan excepciones concretas como ArithmeticException, etc
            // Si se captura excepcion en try, se ejecuta el código de aquí
        } catch(Exception e) {
            // Se capturan al final todas las excepciones no incluidas en tipos anterioes
        } finally {
            // Instrucciones que se ejecutan siempre al final
        }

        // *** throws exception ***
        // En la cabecera de un método (main por ejemplo)

        // *** Exception ***
        /* Es la super clase de la que se pueden crear otras excepciones 
        En este ejemplo hemos creado una excepcion propia MyException, y
        elegimos que el programa la lance bajo cierta condición
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Introduce un valor entre 0 y 10: ");
            int nota = Integer.parseInt(br.readLine());
            if(nota<0 || nota>10) {
                throw new MyException("Nota fuera de rango");
            }
            } catch(MyException e ) {
                System.out.println(e.getMessage());
        }

        /** Expresiones regulares
         * string s;
         * s.matches("EXPRESION REGULAR")
         */
        




    }
}