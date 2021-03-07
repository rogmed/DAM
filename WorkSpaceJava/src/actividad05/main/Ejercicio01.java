package actividad05.main;

import static actividad05.introduceDatos.Pregunta.*;
import static actividad05.operaciones.Valores.*;
import static actividad05.operaciones.algebraicas.Operaciones.*;
import static actividad05.operaciones.geometricas.Operaciones.*;

public class Ejercicio01 {

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = pideEntero("\nElija una opcion:"
                    + "\n1- Muestra Pi."
                    + "\n2- Muestra valor aleatorio."
                    + "\n3- Muestra seno."
                    + "\n4- Muestra coseno."
                    + "\n5- Muestra raiz cuadrada."
                    + "\n6- Calcula potencia."
                    + "\n0- Salir."
                    + "\nOpcion: ");
            
            switch (opcion){
                    case 1:
                        muestraPi();
                        break;
                    case 2:
                        muestraValorAleatorio();
                        break;
                    case 3:
                        double num = pideDouble("Introduzca un valor: ");
                        muestraSeno(num);
                        break;
                    case 4:
                        num = pideDouble("Introduzca un valor: ");
                        muestraCoseno(num);
                        break;
                    case 5:
                        muestraRaizCuadrada();
                        break;
                    case 6:
                        double base = pideDouble("Introduzca base: ");
                        double exp = pideDouble("Introduzca exponente: ");
                        calculaPotencia(base, exp);
                        break;
                    default:
                        System.out.println("Por favor, elija una opción válida.");
            }
            
        } while (opcion != 0);
        System.out.println("\nCerrando programa.\nGracias. Adiós");
    }
}
