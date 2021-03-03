// Clase 02
// 12-02-2021
package Clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clase02 {

    public static void main(String[] args) throws IOException {
        String textoEscrito = "5 texto de ejemplo";
        textoEscrito = "5 texto de ejemplo";
        int edad = 40;
        edad = 30;
        float litrosAceite = 1.9F;
        double litrosAgua = 2.5;
        
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        
       double numero1 = 10;
       double numero2 = 5;
       double resultado;
       
       resultado = numero1++;
       System.out.println("resultado: " + resultado + " numero: " + numero1);
       
       resultado = ++numero1;
       System.out.println("resultado: " + resultado + " numero: " + numero1);
       
       boolean num1EsDistintoNum2 = numero1 != numero2;
       System.out.println(numero1 + " es disinto que " + numero2 + "? -> " + num1EsDistintoNum2);
       
       boolean verdadero = true;
       boolean falso = false;
       
       System.out.println("verdadero && falso: " + (verdadero && falso));
       System.out.println("verdadero || falso: " + (verdadero || falso));
       System.out.println("verdadero != falso: " + (verdadero != falso));
       System.out.println("verdadero ^ falso: " + (verdadero ^ falso));


    }

}
