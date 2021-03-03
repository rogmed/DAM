// Actividad01 - Ejercicio01
// Rogelio Medina Medina
// 11-02-2021

package actividad01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio01 {
    public static void main(String[] args) throws IOException {
        int manzanas_tienda;
        int manzanas_queremos_comprar;
        double precio_manzana;
        double dinero_pagado;

        manzanas_tienda = 20;
        manzanas_queremos_comprar = 2;
        precio_manzana = 0.40;

        System.out.println("Vamos a comprar " + manzanas_queremos_comprar + " manzanas");
        // modificamos el contenido de las variables numericas para representar la
        // compra de manzanas
        dinero_pagado = precio_manzana * manzanas_queremos_comprar;
        manzanas_tienda = manzanas_tienda - manzanas_queremos_comprar;

        // mostramos por consola el valor de las variables numericas. De forma implícita
        // se convierte de de numero a string.
        System.out.println("Nos han costado:" + dinero_pagado);
        System.out.println("En la tienda quedan " + manzanas_tienda + " manzanas");

        System.out.println("Quantas mazanas más quieres comprar?");
        // Declaramos una variable compleja de nombre "br" y de tipo "BufferedReader".
        // Las variables del tipo "BufferedReader" contienen funciones para leer datos
        // por consola
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // utilizamos la función "readLine" de la variable "br" para leer un dato por
        // consola. Guardamos el número introducido en la variable "valor_escrito"
        String valor_escrito = br.readLine();

        /*
         * Convertimos mediante una conversion explicita la variable "valor_escrito" a
         * un valor entero para poder operar con él y lo almacenamos en la variable
         */
        manzanas_queremos_comprar = Integer.parseInt(valor_escrito);

        System.out.println("Vamos a comprar " + manzanas_queremos_comprar + " manzanas");
        // modificamos el contenido de las variables numericas para representar la
        // compra de manzanas
        dinero_pagado = precio_manzana * manzanas_queremos_comprar;
        manzanas_tienda = manzanas_tienda - manzanas_queremos_comprar;
        // mostramos por consola el valor de las variables numericas. De forma implícita
        // se convierte de de numero a string.
        System.out.println("Nos han costado:" + dinero_pagado);
        System.out.println("En la tienda quedan " + manzanas_tienda + " manzanas");
        
        /* 2. Al código anterior (ejercicio01.java) añade después del último
         * System.out.println();  un código que indique que la tienda tiene 15.5
         * litros de leche a 0.95€/litro y a continuación pida “Cuantos litros
         * de leche vas a comprar”, se reciba un número decimal escrito por el
         * usuario y finalmente se indique cuantos litros quedan a la tienda y
         * cuanto a costado la compra . Se debe pode indicar un número con
         * decimales para la compra.
         */
        double leche_tienda = 15.5;
        double leche_queremos_comprar;
        double leche_precio = 0.95;
        
        System.out.println("");
        
        System.out.println("En la tienda quedan " + leche_tienda + " litros de leche.");
        System.out.println("¿Cuántos litros de leche vas a comprar?");
        leche_queremos_comprar = Double.parseDouble(br.readLine());
        
        System.out.println("Vamos a comprar " + leche_queremos_comprar + " litros de leche.");
        
        dinero_pagado = leche_queremos_comprar * leche_precio;
        System.out.println("Nos ha costado " + dinero_pagado + "€");
        
        leche_tienda -= leche_queremos_comprar;
        System.out.println("En la tienda quedan " + leche_tienda + " litros de leche.");
        
    }

}
