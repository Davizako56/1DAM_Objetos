package org.example.Banco;

public abstract class MetodoPago {

    public MetodoPago() {

    }

    public void procesarPago(double importe) {
        System.out.println("Procesando pago de importe " + importe + "€");
    }
}
