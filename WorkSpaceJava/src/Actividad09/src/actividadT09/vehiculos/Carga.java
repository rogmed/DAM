package actividadT09.vehiculos;

import static actividadT09.vehiculos.Utilidades.*;

public class Carga extends Vehiculo {

    double PMA;

    public Carga(String matricula, String modelo, int plazas, double PMA) {
        super(matricula, modelo, plazas);
        this.PMA = PMA;
    }

    public double getPrecioDia() {
        return super.precioDia + PMA*1.5;
    }

    @Override
    public double getPrecioTotalAlquilerPorDias(){
        return numeroDias*getPrecioDia();
    }

    public void pideDatos(){
        linea("Establecer dats de vehículo.");
        this.matricula = pideString("Introduce matrícula: ");
        this.modelo = pideString("Introduzca modelo: ");
        this.plazas = pideEntero("Introduzca número de plazas: ");
        this.numeroDias = pideEntero("Introduzca número de días a alquilar: ");
        this.PMA = pideDouble("Introduzca PMA (Peso Máximo Autorizado) en toneladas: ");
    }

    public String toString() {
        return "Vehículo: "+ modelo + " - Matrícula: " + matricula+
            " - Plazas: " + plazas + " - PMA: " + PMA + " t" +
            " - Precio/día: " + String.format("%.2f", getPrecioDia()) +
            " - Días: " + numeroDias +
            " - Importe: " + String.format("%.2f",getPrecioTotalAlquilerPorDias());
    }

    public String getNombre(){
        return modelo;
    }
}
