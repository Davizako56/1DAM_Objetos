package org.example.Enum;

public enum Tarjetas {

    MAESTRO(1.5), VISA(0), MASTERCARD(5);

    private final double comision;

    Tarjetas(double comision){
        this.comision = comision;
    }

    public double getComision() {

        return comision;
    }
}
