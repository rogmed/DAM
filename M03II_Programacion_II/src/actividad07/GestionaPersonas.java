package actividad07;

import actividad07.exceptions.DniIncorrecto;
import actividad07.exceptions.EdadIncorrecta;
import actividad07.exceptions.NombreIncorrecto;

import static actividad07.MisUtilidades.Utilidades.*;

import java.util.ArrayList;
import java.util.HashMap;

public class GestionaPersonas {

    // static HashMap< , > trabajadores = new HashMap< , >();
    static HashMap<String,Persona> trabajadores = new HashMap<String,Persona>();

    // static ArrayList< > grupoTrabajo = new ArrayList < >();
    static ArrayList<Persona> grupoTrabajo = new ArrayList<Persona>();

    public static void main(String[] args) {
            // trabajadores.put(" ", new Person(nombre, edad, dni));
            // trabajadores.put(" ", new Person(nombre, edad, dni));  
            Persona persona1 = new Persona("Snake Pliskin", 32, "11111111A");
            trabajadores.put(persona1.getDni(), persona1);
            Persona persona2 = new Persona("George Stobbart", 28, "22222222B");
            trabajadores.put(persona2.getDni(), persona2);

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
                        creaTrabajador();
                        break;
                    case 2:
                        borraTrabajador();
                        break;
                    case 3:
                        addTrabajadorGrupoTrabajo();
                        break;
                    case 4:
                        System.out.println("ELEGIDA OPCION "+ opcion);
                        // borraTrabajadorGrupoTrabajo();
                        break;
                }

                if (opcion!=0) {
                    System.out.println("\nTrabajadores:");
                    for (String k : trabajadores.keySet()) {
                        Persona p = trabajadores.get(k);
                        System.out.println(p.getNombre() +" - Edad: " +p.getEdad() +
                        " - DNI: " + p.getDni());
                    }
    
                    System.out.println("\nGrupo Trabajo:");
                    for (Persona p : grupoTrabajo) {
                        System.out.println(p.getNombre() +" - Edad: " +p.getEdad() +
                        " - DNI: " + p.getDni());
                    }
                    pressEnter("\nPresiona ENTER para continuar.");
                }   
            } while (opcion !=0);          
    }
    
    static void creaTrabajador() {
        boolean errorStatus = false;
        Persona nuevaPersona = new Persona(null, null, null);
        do {
            try {
                if (nuevaPersona.getDni() == null){
                    nuevaPersona.setDni(pideString("Introduzca DNI: "));
                }
                if (nuevaPersona.getNombre() == null){
                    nuevaPersona.setNombre(pideString("Introduzca nombre: "));
                }
                if (nuevaPersona.getEdad() == null){
                    nuevaPersona.setEdad(pideEntero("Introduzca edad: "));
                }
                errorStatus = false;
                trabajadores.put(nuevaPersona.getDni(), nuevaPersona);
            } catch (DniIncorrecto e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                errorStatus = true;
                nuevaPersona.dni = null;
            } catch (EdadIncorrecta e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                errorStatus = true;
                nuevaPersona.edad = null;
            } catch (NombreIncorrecto e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
                errorStatus = true;
                nuevaPersona.nombre = null;
            }
        } while (errorStatus);

    }

    static void borraTrabajador() {
        try {
            String dni = pideString("\nIntroduzca DNI de trabajador a borrar: ");
            System.out.println("Borrado: "+trabajadores.get(dni).getNombre() +
                " - Edad: "+trabajadores.get(dni).getEdad()+
                " - DNI: "+trabajadores.get(dni).getDni()
                );
            trabajadores.remove(dni);
            pressEnter("Presiona ENTER para continuar.");
        } catch (NullPointerException e) {
            System.out.println("No existe ese trabajador. Volviendo al menú.");
        } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }

    static void addTrabajadorGrupoTrabajo() {
        try {
            String dni = pideString("\nIntroduzca DNI de trabajador a añadir"+
                " a Grupo de Trabajo: ");
            grupoTrabajo.add(trabajadores.get(dni));
        } catch (NullPointerException e) {
            System.out.println("DNI incorrecto.");
        } catch (Exception e) {
            System.out.println("Error inesperado");
            e.printStackTrace();
        }
    }
}
