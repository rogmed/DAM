package actividad07;

import actividad07.exceptions.DniIncorrecto;
import actividad07.exceptions.EdadIncorrecta;
import actividad07.exceptions.NombreIncorrecto;

import static actividad07.MisUtilidades.Utilidades.*;
import java.util.ArrayList;
import java.util.HashMap;

public class GestionaPersonas {

    // static HashMap< , > trabajadores = new HashMap< , >();
    static HashMap<String,String> trabajadores = new HashMap<String,String>();

    // static ArrayList< > grupoTrabajo = new ArrayList < >();
    static ArrayList<Persona> grupoTrabajo = new ArrayList<Persona>();

    public static void main(String[] args) {
        try {
            trabajadores.put("11111111A","Snake Pliskin");
            trabajadores.put("22222222B","George Stobbart");

            // MENU
            int opcion;
            do {
                System.out.println("\nMenú principal. Elija una opción:"+
                "\n 1. Crea un trabajador"+
                "\n 2. Borra un trabajador"+
                "\n 3. Añade un trabajador al grupo de trabajo"+
                "\n 4. Borra un trabajador del grupo de trabajo"+
                "\n 0. Salir");
                opcion = pideEntero("Introduzca número de opción: ",0,4);

                switch(opcion)
                {
                    case 0:
                        System.out.println("Cerrando programa. Gracias.");
                        break;
                    case 1:
                        System.out.println("ELEGIDA OPCION "+ opcion);
                        // creaTrabajador();
                        break;
                    case 2:
                        System.out.println("ELEGIDA OPCION "+ opcion);
                        // borraTrabajador();
                        break;
                    case 3:
                        System.out.println("ELEGIDA OPCION "+ opcion);
                        // addTrabajadorGrupoTrabajo();
                        break;
                    case 4:
                        System.out.println("ELEGIDA OPCION "+ opcion);
                        // borraTrabajadorGrupoTrabajo();
                        break;
                }
            } while (opcion !=0);
            

            // trabajadores.put(" ", new Person(nombre, edad, dni));
            // trabajadores.put(" ", new Person(nombre, edad, dni));
            Persona person1 = new Persona("Paco", 26, "32323232S"); // BORRAR ESTO
            

        } catch(DniIncorrecto | EdadIncorrecta | NombreIncorrecto e1) {
            e1.printStackTrace();
        }





    }
    
}
