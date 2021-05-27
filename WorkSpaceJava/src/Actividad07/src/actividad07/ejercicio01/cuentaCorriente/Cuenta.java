package actividad07.ejercicio01.cuentaCorriente;

public class Cuenta {
    private final int numeroCuenta;
    private double saldo;
    private String titular;

    public Cuenta (int numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    int getNumeroCuenta() {
        return numeroCuenta;
    }

    double getSaldo() {
        return saldo;
    }

    String getTitular() {
        return titular;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void setTitular(String titular) {
        this.titular = titular;
    }

    // @Override - Sobreescribe el método toString de la clase madre Object.class
    public String toString() {
        return "Cuenta número: " + numeroCuenta +
        " || Titular: " + titular + " || Saldo: " + String.format("%.2f",saldo) + " €";
    }
}
