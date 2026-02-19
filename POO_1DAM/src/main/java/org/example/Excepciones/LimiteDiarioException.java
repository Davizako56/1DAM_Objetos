package org.example.Excepciones;

public class LimiteDiarioException extends RuntimeException {
    public LimiteDiarioException() {
        super("No se puede retirar mas de 600€.");
    }
}
