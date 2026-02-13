package org.example.Banco;

public class PayPal extends MetodoPago{

    private static final String formato_cuenta = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+.com$";
    private String cuenta;
    private double saldo;

    public PayPal(String cuenta, double saldo) {

        this.cuenta = cuenta;
        this.saldo = saldo;
    }

    public PayPal() {
        saldo = 23;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean validarPayPal(double importe) {

        System.out.println("Validando...");

        if(cuenta.matches(formato_cuenta) && saldo >= importe) {
            return true;
        }

        return false;
    }

    @Override

    public void procesarPago(double importe) {

        if(validarPayPal(importe)) {
            System.out.println("Procesando pago de importe " + importe + "€ con PayPal.");
        }else if(!cuenta.matches(formato_cuenta)) {
            System.out.println("ERROR: La cuenta de PayPal no existe");
        }else{
            System.out.println("ERROR: Saldo insuficiente.");
        }
    }

    @Override

    public String toString() {

        return "[Cuenta = " + cuenta + ", saldo = " + saldo + "]";
    }
}
