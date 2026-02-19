package org.example.Excepciones;

public class DepositoMaximoException extends RuntimeException {

    public DepositoMaximoException() {
        super("No se puede ingresar más de 3000€.");
    }
}
