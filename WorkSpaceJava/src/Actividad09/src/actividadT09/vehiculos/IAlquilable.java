package actividadT09.vehiculos;

public interface IAlquilable {
    void setNumeroDias(int dias);
    double getPrecioTotalAlquilerPorDias();
    String toString();
    void pideDatos();
    String getNombre();
}
