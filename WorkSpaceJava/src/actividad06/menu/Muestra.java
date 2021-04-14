package actividad06.menu;

import static actividad06.introduceDatos.Pregunta.*;

public class Muestra {

    /**
     * Muestra menu
     * 
     * Muestra un menu de opciones y retorna la opción elegida en forma de int.
     * 
     * @param opciones array de strings con texto de las opciones a mostrar.
     * @return opción elegida en forma de int.
     */
    public static int muestraMenu (String[] opciones) {
        System.out.println("");
        for (int i=1; i<opciones.length; i++){
            System.out.println(i + ". " + opciones[i]);
        }
        int seleccion = pideEntero("Elija opción: ");
        return seleccion;
    }
    
}
