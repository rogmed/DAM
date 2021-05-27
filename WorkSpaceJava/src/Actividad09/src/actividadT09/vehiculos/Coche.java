package actividadT09.vehiculos;

import static actividadT09.vehiculos.Utilidades.*;

public class Coche extends Vehiculo {

    String gama;

    public Coche(String matricula, String modelo, int plazas, String gama) {
        super(matricula, modelo, plazas);
        this.gama = gama;
    }

    public double getPrecioDia() {
        return super.precioDia + plazas*1.5;
    }

    @Override
    public double getPrecioTotalAlquilerPorDias(){
        return numeroDias * getPrecioDia();
    }

    public void pideDatos(){
        linea("Establecer datos de vehículo.");
        this.matricula = pideString("Introduce matrícula: ");
        this.modelo = pideString("Introduzca modelo: ");
        this.plazas = pideEntero("Introduzca número de plazas: ");
        this.numeroDias = pideEntero("Introduzca número de días a alquilar: ");
        this.gama = pideString("Introduzca gama (A, B, C, D): ");
    }

    public String toString() {
        return "Vehículo: "+ modelo + " - Matrícula: " + matricula+
            " - Plazas: " + plazas + " - Gama: " + gama +
            " - Precio/día: " + String.format("%.2f", getPrecioDia()) +
            " - Días: " + numeroDias +
            " - Importe: " + String.format("%.2f",getPrecioTotalAlquilerPorDias());
    }

    public String getNombre(){
        return modelo;
    }
}
