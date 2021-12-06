/**
 * Rogelio Medina Medina
 * DAMx_M03IIB - Programacion II 2021/22
 * UF5
 * Actividad07 Estructuras de datos avanzadas y control de excepciones
 */

package actividad07;

import actividad07.exceptions.DemasiadoObjetos;
import actividad07.exceptions.DniIncorrecto;
import actividad07.exceptions.EdadIncorrecta;
import actividad07.exceptions.NombreIncorrecto;
import actividad07.exceptions.PosicionIncorrecta;

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
                linea("MENU PRINCIPAL");
                System.out.println(
                " 1. Crea un trabajador"+
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
                        try{
                            addTrabajadorGrupoTrabajo();
                        } catch (DemasiadoObjetos e){
                            System.out.println(e.getMessage());
                            e.printStackTrace();
                        } catch (Exception e) {
                            System.out.println("Error inesperado");
                            e.printStackTrace();
                        } finally {
                            pressEnter();
                        }
                        break;
                    case 4:
                    try {
                        borraTrabajadorGrupoTrabajo();
                    } catch (PosicionIncorrecta e) {
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                        pressEnter();
                    }
                        break;
                }

                if (opcion!=0) {
                    linea("Trabajadores:");
                    for (String k : trabajadores.keySet()) {
                        Persona p = trabajadores.get(k);
                        System.out.println(p.toString());
                    }
    
                    linea("Grupo Trabajo:");
                    for (Persona p : grupoTrabajo) {
                        System.out.println(grupoTrabajo.indexOf(p)+"- " +
                        p.toString());
                    }
                    pressEnter("\nPresiona ENTER para continuar.");
                }   
            } while (opcion !=0);          
    }
    
    // OPCION 1
    static void creaTrabajador() {
        boolean errorStatus = false;
        Persona p = new Persona(null, null, null);
        do {
            try {
                if (p.getDni() == null){
                    p.setDni(pideString("Introduzca DNI: "));
                }
                if (p.getNombre() == null){
                    p.setNombre(pideString("Introduzca nombre: "));
                }
                if (p.getEdad() == null){
                    p.setEdad(pideEntero("Introduzca edad: "));
                }
                errorStatus = false;
                trabajadores.put(p.getDni(), p);
                System.out.println("Creado trabajador: " + p.toString());
                pressEnter();
            } catch (DniIncorrecto e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                errorStatus = true;
                p.dni = null;
            } catch (EdadIncorrecta e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                errorStatus = true;
                p.edad = null;
            } catch (NombreIncorrecto e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                errorStatus = true;
                p.nombre = null;
            }
        } while (errorStatus);

    }

    // OPCION 2
    static void borraTrabajador() {
        try {
            String dni = pideString("\nIntroduzca DNI de trabajador a borrar: ");
            System.out.println("Borrado: "+trabajadores.get(dni).toString());
            trabajadores.remove(dni);
        } catch (NullPointerException e) {
            System.out.println("No existe ese trabajador. Volviendo al menú.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error inesperado");
            e.printStackTrace();
        } finally {
            pressEnter();
        }
    }

    // OPCION 3
    static void addTrabajadorGrupoTrabajo() throws DemasiadoObjetos {
        if (grupoTrabajo.size() >= 2) {
            throw new DemasiadoObjetos("Grupo de trabajo no puede " +
                "contener más de 2 trabajadores.");
        } else {
            String dni = pideString("\nIntroduzca DNI de trabajador a "+
                "añadir a Grupo de Trabajo: ");
            if ((trabajadores.get(dni) != null) && (!grupoTrabajo.contains(trabajadores.get(dni)))) {
                grupoTrabajo.add(trabajadores.get(dni));
                System.out.println("Añadido al grupo de trabajo: "+
                    trabajadores.get(dni).toString());
            } else {
                System.out.println("DNI no válido o ya se encuentra en el grupo.");
            }
        }
    }

    // OPCION 4
    static void borraTrabajadorGrupoTrabajo() throws PosicionIncorrecta {
        int i = pideEntero("Índice del trabajador dentro de Grupo de "+
            "Trabajo a borrar: ");
        if (i > grupoTrabajo.size()-1 || i < 0) {
            throw new PosicionIncorrecta("Posición incorrecta.");
        } else {
            System.out.println("Borrando de grupo de trabajo: "+
                grupoTrabajo.get(i).toString());
            grupoTrabajo.remove(i);
        }
    }
}
