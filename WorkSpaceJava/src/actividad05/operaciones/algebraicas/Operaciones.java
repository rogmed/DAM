package actividad05.operaciones.algebraicas;

import static actividad05.introduceDatos.Pregunta.*;

public class Operaciones {

    /**
     * Muestra raiz cuadrada
     * 
     * Muestra un mensaje pidiendo un decimal (numero), y muestra otro mensaje
     *  con la raiz cuadrada (resultado). No devuelve nada.
     */
    public static void muestraRaizCuadrada() {
        double numero = pideDouble("Introduce valor decimal: ");
        double resultado = Math.sqrt(numero);
        System.out.println("Raiz cuadrada de " + numero + ": " + resultado);
    }

    /**
     * Recibe un decimal (num1) que será la base, y otro decimal (num2) que
     * será la potencia. Muestra por pantalla un mensaje con num1 y num2,
     * seguido del resultado de elevar num1 a num2. No devuelve nada.
     * 
     * @param num1 base
     * @param num2 exponente
     */
    public static void calculaPotencia(double num1, double num2) {
        double resultado = Math.pow(num1, num2);
        System.out.println(num1 + " elevado a " + num2 + ": " + resultado);
    }
}
