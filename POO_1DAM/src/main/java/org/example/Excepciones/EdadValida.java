package org.example.Excepciones;

public class EdadValida extends RuntimeException {


    public EdadValida() {
        super("Edad no permitida.");
    }
}
