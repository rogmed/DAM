package actividad05.operaciones.geometricas;

public class Operaciones {

    /**
     * Muestra seno
     * 
     * Recibe un decimal (num), y muestra por pantalla el seno de num.
     * No devuelve nada.
     * 
     * @param num angulo en radianes
     */
    public static void muestraSeno(double num) {
        System.out.println("Seno de " + num + ": " + Math.sin(num));
    }

    /**
     * Muestra coseno
     * 
     * Recibe un decimal (num), y muestra por pantalla el coseno de num.
     * No devuelve nada.
     * 
     * @param num angulo en radianes
     */
    public static void muestraCoseno(double num) {
        System.out.println("Coseno de " + num + ": " + Math.cos(num));
    }

}
