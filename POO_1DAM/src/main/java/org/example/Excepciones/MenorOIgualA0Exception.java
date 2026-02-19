package org.example.Excepciones;

public class MenorOIgualA0Exception extends RuntimeException{

    public MenorOIgualA0Exception(double num) {
        super((num == 0 ? "El dinero no puede ser igual a 0" : "El dinero no puede ser menor que 0"));
    }
}
