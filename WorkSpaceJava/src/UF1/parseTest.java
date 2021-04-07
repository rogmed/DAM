package UF1;

public class parseTest {

    public static void main(String[] args) {
        String numeroTexto = "40";
        System.out.println("Valor de numeroTexto = " + numeroTexto);
        
        short numCorto = Short.parseShort(numeroTexto);
        System.out.println("Resultado de Short.parseShort(numeroTexto)");
        System.out.println(numCorto);
        
        int numero = Integer.parseInt(numeroTexto);
        System.out.println("Resultado de Integer.parseInt(numeroTexto)");
        System.out.println(numero);
        
        double numDecimal = Double.parseDouble(numeroTexto);
        System.out.println("Resultado de Double.parseDouble(numeroTexto)");
        System.out.println(numDecimal);
        
        float numLargo = Float.parseFloat(numeroTexto);
        System.out.println("Resultado de Float.parseFloat(numeroTexto)");
        System.out.println(numLargo);
    }
    
}
