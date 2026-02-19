package org.example.Excepciones;

public class CuentaBancaria {

    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresarDinero(double dinero) {
        setSaldo(saldo + dinero);
        System.out.println("Dinero ingresado con éxito. Saldo actual: " + saldo);
    }

    public void retirarDinero(double dinero) {
        setSaldo(saldo - dinero);
        System.out.println("Saldo retirado con éxito. Saldo actual: " + saldo);
    }

    public void consultarSaldo() {
        System.out.println("Saldo disponible: " + getSaldo());
    }

    @Override

    public String toString() {
        return "[Saldo = " + saldo + "]";
    }
}
