package actividad07.ejercicio02;

public class Horchata extends Comida {
    private int cantidad;
    private int porChufa;

    public Horchata(int cantidad, int porChufa){
        // super(String nombre, double precio, double kcal)
        super("Horchata", 2.50 * cantidad, 20 * cantidad);
        this.cantidad = cantidad;
        this.porChufa = porChufa;
    }

    int getCantidad() {
        return cantidad;
    }

    void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    int getPorChufa() {
        return porChufa;
    }

    void setPorChufa(int porChufa) {
        this.porChufa = porChufa;
    }

    @Override
    public String toString() {
        return getNombre() +
        " - Kcal: " + getKcal() + 
        " - % chufa: " + getPorChufa() +"%" +
        " - Cantidad: " + getCantidad() +
        " - Precio: " + String.format("%.2f",getPrecio()) + "€";
    }
}
