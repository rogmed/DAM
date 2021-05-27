package actividad07.ejercicio02;

public class Comida {
    private String nombre;
    private double precio;
    private double kcal;

    public Comida (String nombre, double precio, double kcal) {
        this.nombre = nombre;
        this.precio = precio;
        this.kcal = kcal;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    double getPrecio() {
        return precio;
    }

    void setPrecio(double precio) {
        this.precio = precio;
    }

    double getKcal() {
        return kcal;
    }

    void setKcal(double kcal){
        this.kcal = kcal;
    }

    @Override
    public String toString() {
        return getNombre() +
            " - Kcal: " + getKcal() +
            " - Precio: " + String.format("%.2f",getPrecio()) + "€";
    }
    
}
