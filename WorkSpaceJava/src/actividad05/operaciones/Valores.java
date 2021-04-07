package actividad05.operaciones;

import static actividad05.introduceDatos.Pregunta.*;

public class Valores {

    /**
     * Muestra Pi
     * 
     * Muestra el valor de Pi. No devuelve nada.
     */
    public static void muestraPi() {
        System.out.println("Pi: " + Math.PI);
    }

    /**
     * Muestra valor aleatorio
     * 
     * Pide un valor entero máximo (max), y muestra un entero (resultado)
     * aleatorio entre 0 y max inclusive. No devuelve nada.
     */
    public static void muestraValorAleatorio() {
        int max = pideEntero("Introduce valor máximo: ");
        int resultado = (int)(Math.random() * (max+1));
        System.out.println("Número generado aleatoriamente: " + resultado);
    }
}
