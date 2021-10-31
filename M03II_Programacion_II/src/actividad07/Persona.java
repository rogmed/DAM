package actividad07;

import actividad07.exceptions.*;

public class Persona {

    String nombre;
    int edad;
    String dni;

    public Persona(String nombre, int edad, String dni) throws NombreIncorrecto,
     EdadIncorrecta, DniIncorrecto {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws NombreIncorrecto {
        try {
            if(nombre.length()<3) {
                throw new NombreIncorrecto("El nombre debe tener mínimo 3 letras");
            } else if (nombre.matches(".*\\d.*")) {
                throw new NombreIncorrecto("El nombre no puede contener dígitos.");
            } else {
                this.nombre = nombre;
            }
        } catch (NombreIncorrecto e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws EdadIncorrecta {
        try {
            if (edad < 0 || edad > 110) {
                throw new EdadIncorrecta("La edad no puede ser menor a 1 ni "+
                "mayor a 110.");
            } else {
                this.edad = edad;
            }
        } catch (EdadIncorrecta e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) throws DniIncorrecto {
        try {
            if (dni.length()!=9) {
                throw new DniIncorrecto("El DNI ha de tener una string de 9 valores.");
            } else {
                this.dni = dni;
            }
        } catch (DniIncorrecto e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }

    Exception EdadIncorrecta = new Exception("La edad no puede ser menor a 1 o "
    +"mayor a 110.");

}

/**
 * public class Carga extends Vehiculo {
 * 
 * double PMA;
 * 
 * public Carga(String matricula, String modelo, int plazas, double PMA) {
 * super(matricula, modelo, plazas); this.PMA = PMA; }
 * 
 * public double getPrecioDia() { return super.precioDia + PMA*1.5; }
 * 
 * @Override public double getPrecioTotalAlquilerPorDias(){ return
 *           numeroDias*getPrecioDia(); }
 * 
 *           public void pideDatos(){ linea("Establecer dats de vehículo.");
 *           this.matricula = pideString("Introduce matrícula: "); this.modelo =
 *           pideString("Introduzca modelo: "); this.plazas =
 *           pideEntero("Introduzca número de plazas: "); this.numeroDias =
 *           pideEntero("Introduzca número de días a alquilar: "); this.PMA =
 *           pideDouble("Introduzca PMA (Peso Máximo Autorizado) en toneladas:
 *           "); }
 * 
 *           public String toString() { return "Vehículo: "+ modelo + " -
 *           Matrícula: " + matricula+ " - Plazas: " + plazas + " - PMA: " + PMA
 *           + " t" + " - Precio/día: " + String.format("%.2f", getPrecioDia())
 *           + " - Días: " + numeroDias + " - Importe: " +
 *           String.format("%.2f",getPrecioTotalAlquilerPorDias()); }
 * 
 *           public String getNombre(){ return modelo; } }
 * 
 */