package actividad07;

import actividad07.exceptions.*;

public class Persona {

    String nombre;
    Integer edad;
    String dni;

    public Persona(String nombre, Integer edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws NombreIncorrecto {
        if (nombre.matches(".*\\d.*")) {
            throw new NombreIncorrecto("El nombre no puede contener dígitos.");
        } else if(nombre.length()<3) {
            throw new NombreIncorrecto("El nombre debe tener mínimo 3 letras");
        } else {
            this.nombre = nombre;
        }
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) throws EdadIncorrecta {
        if (edad < 1 || edad > 110) {
            throw new EdadIncorrecta("La edad no puede ser menor a 1 ni "+
            "mayor a 110.");
        } else {
            this.edad = edad;
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) throws DniIncorrecto {
        if (dni.length()!=9) {
            throw new DniIncorrecto("El DNI ha de tener una string de 9 valores.");
        } else {
            this.dni = dni;
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