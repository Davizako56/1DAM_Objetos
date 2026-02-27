package org.example.Practica2;

/**
 * Esta excepción sirve para asegurarse de que no haya dorsales repetidos dentro de un mismo equipo.
 * @author David Giner
 */
public class DorsalRepetidoException extends RuntimeException {

    public DorsalRepetidoException(String message) {
        super(message);
    }
}
