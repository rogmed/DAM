package actividad07.ejercicio02;

public class Cucurucho extends Comida{
    private int numBolas;
    private double precioTotal;
    private SaborHelado[] sabores; 

    public Cucurucho(String nombre, double precio, double kcal, int numBolas){
        // super(String nombre, double precio, double kcal)
        super("Cucurucho " + nombre, precio , kcal);
        this.numBolas = numBolas;
        sabores = new SaborHelado[numBolas];
    }

    int getNumBolas() {
        return numBolas;
    }

    void setNumBolas(int numBolas) {
        this.numBolas = numBolas;
    }


    /**
     * Añade bola helado
     * 
     * Añade una bola de helado al cucurucho en la posicion y sabor especificado.
     * 
     * @param sabor
     * @param posicion
     */
    void addBolaHelado(int posicion, String sabor, double precio, double kcal, int grasa, String edulcorante ) {
        sabores[posicion] = new SaborHelado(sabor, precio, kcal, grasa,  edulcorante);
    }

    /**
     * Calcula precio total
     * 
     * Suma el precio total base del cucurucho y de las bolas.
     * 
     * @return precio total
     */

    double calculaPrecio() {
        precioTotal = super.getPrecio();
        for (int i = 0; i<sabores.length; i++){
            precioTotal += sabores[i].getPrecio();
        }
        return precioTotal;
     }

     double getPrecio() {
         return precioTotal;
     }

    @Override
    public String toString() {        
        String texto_cucurucho = getNombre() +
            " - Kcal: " + getKcal() +
            " - Precio: "+String.format("%.2f",super.getPrecio())+"€";
        for (int i = 0; i<sabores.length; i++) {
            texto_cucurucho += "\n    - " + sabores[i].toString();
        }
        texto_cucurucho += "\n    Total cucurucho con " + numBolas +" bolas: " +
            String.format("%.2f",calculaPrecio()) + "€";
        return texto_cucurucho;
    }
        
    
}
