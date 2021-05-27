package actividadT09.vehiculos;

import static actividadT09.vehiculos.Utilidades.*;

public abstract class Vehiculo implements IAlquilable{
    String matricula;
    String modelo;
    int plazas = 5;
    int numeroDias = 0;
    double precioDia = 50;

    public Vehiculo(String matricula, String modelo, int plazas) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.plazas = plazas;
    }

    /* Constructor para copiar un vehiculo*/
    public Vehiculo (Vehiculo original) {}

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre(){
        return modelo;
    }

    public void setNombre(String nombre) {
        this.modelo = nombre;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias (int numeroDias){
        this.numeroDias = numeroDias;
    }

    public double getPrecioTotalAlquilerPorDias(){
        return numeroDias*precioDia;
    }

    public void pideDatos(){
        linea("Establecer dats de vehículo.");
        this.matricula = pideString("Introduce matrícula: ");
        this.modelo = pideString("Introduzca modelo: ");
        this.plazas = pideEntero("Introduzca número de plazas: ");
        this.numeroDias = pideEntero("Introduzca número de días a alquilar: ");
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo +
            " - Matrícula: " + matricula +
            " - Plazas: " + plazas + 
            " - Días: " + numeroDias +
            " - Precio total: " + String.format("%.2f", getPrecioTotalAlquilerPorDias());
    }
}
