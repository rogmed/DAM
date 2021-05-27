package ejercicio01.cuentaCorriente;

public class Cuenta {
 
    private final double numeroCuenta;
    private double saldo;
    private String titular;

    public Cuenta (double numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // @Override - Sobreescribe el método toString de la clase madre Object.class
    public String toString(String opcion) {
        switch (opcion){
            case "saldo":
                return ""+saldo;
            case "numeroCuenta":
                return ""+numeroCuenta;
            default:
                return "";
        }
    }


}
