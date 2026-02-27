package org.example.Practica2;

/**
 * Excepción creada para controlar que los formatos de algunas variables sean correctos
 * @author David Giner
 */
public class FormatoIncorrectoException extends RuntimeException {

    public FormatoIncorrectoException(String message) {
        super(message);
    }
}
