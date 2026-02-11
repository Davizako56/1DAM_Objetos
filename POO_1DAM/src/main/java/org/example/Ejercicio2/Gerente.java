package org.example.Ejercicio2;

public class Gerente extends Empleado{

    public Gerente() {
        super();
    }

    @Override

    public void realizarTarea() {
        System.out.println("Supervisando el proyecto y organizando reuniones.");
    }
}
