package actividad07;

import actividad07.exceptions.DniIncorrecto;
import actividad07.exceptions.EdadIncorrecta;
import actividad07.exceptions.NombreIncorrecto;

public class GestionaPersonas {

    // static HashMap< , > trabajadores = new HashMap< , >();
    // static ArrayList< > grupoTrabajo = new ArrayList < >();
    public static void main(String[] args) {
        try {
            // trabajadores.put(" ", new Person(nombre, edad, dni));
            // trabajadores.put(" ", new Person(nombre, edad, dni));
            new Person("Paco", 26, "32323232S"); // BORRAR ESTO
        } catch(DniIncorrecto | EdadIncorrecta | NombreIncorrecto e1) {
            e1.printStackTrace();
        }





    }
    
}
