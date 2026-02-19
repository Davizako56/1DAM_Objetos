package org.example.Excepciones;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException() {
        super("No tienes suficiente saldo");
    }
}
