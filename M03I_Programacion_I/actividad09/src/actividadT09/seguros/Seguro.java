package actividadT09.seguros;

import static actividadT09.vehiculos.Utilidades.*;
import actividadT09.vehiculos.IAlquilable;

public class Seguro implements IAlquilable {
    String nombre;
    String descripcion;
    double precioDia = 10.50;
    int numeroDias = 1;

    public Seguro(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Seguro(String nombre, String descripcion, int numeroDias) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroDias = numeroDias;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        this.numeroDias = numeroDias;
    }

    public double getPrecioTotalAlquilerPorDias() {
        return precioDia * numeroDias;
    }

    @Override
    public String toString() {
        return "Nombre " + nombre +
            " - Precio/dia: " + String.format("%.2f", precioDia) + " €/día" +
            " - Días: " + numeroDias +
            " - Importe: " + String.format("%.2f", getPrecioTotalAlquilerPorDias())+ "€" +
            "\n  - Descripción: " + descripcion;
    }

    public void pideDatos(){
        linea("Establecer datos de seguro.");
        this.nombre = pideString("Introduce nombre: ");
        this.descripcion = pideString("Introduzca descripcion: ");
        this.numeroDias = pideEntero("Introduzca número de días: ");
    }

}
