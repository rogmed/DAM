package actividad05.operaciones.algebraicas;

import static actividad05.introduceDatos.Pregunta.*;

public class Operaciones {

    public static void muestraRaizCuadrada() {
        double numero = pideDouble("Introduce valor decimal: ");
        double resultado = Math.sqrt(numero);
        System.out.println("Raiz cuadrada de "+numero+": "+resultado);
    }
    
    public static void calculaPotencia(double num1, double num2) {
        double resultado = Math.pow(num1, num2);
        System.out.println(num1+" elevado a "+num2+": "+resultado);
    }
}
