package actividad05.operaciones;

import static actividad05.introduceDatos.Pregunta.*;

public class Valores {

    public static void muestraPi() {
        System.out.println("Pi: " + Math.PI);
    }

    public static void muestraValorAleatorio() {
        int max = pideEntero("Introduce valor máximo: ");
        int resultado = (int)(Math.random() * (max+1));
        System.out.println("Número generado aleatoriamente: " + resultado);
    }
}
