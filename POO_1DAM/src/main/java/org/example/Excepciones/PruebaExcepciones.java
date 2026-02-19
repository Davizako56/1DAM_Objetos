package org.example.Excepciones;


public class PruebaExcepciones {

    public static void main(String[] args) {

        int edad = 15;

        if(edad < 18) {
            throw new EdadValida();
        }
    }
}
