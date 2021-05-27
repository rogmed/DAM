package actividad07.ejercicio02;

public class SaborHelado extends Comida {
    private String sabor;
    private int grasa; // % de grasa
    private String edulcorante; // Tipo de edulcorante

    public SaborHelado(String sabor, double precio, double kcal, int grasa, String edulcorante){
        // super(String nombre, double precio, double kcal)
        super("Bola " + sabor, precio, kcal);
        this.sabor = sabor;
        this.grasa =  grasa;
        this.edulcorante = edulcorante;

    }

    @Override
    public String toString() {
        return getNombre() + " " + sabor +
            " - Kcal: " + getKcal() +
            " - Grasa: " + grasa +
            "% - Edulcorante: " + edulcorante +
            " - Precio: " + String.format("%.2f",getPrecio()) + "€";
    }
    
}
