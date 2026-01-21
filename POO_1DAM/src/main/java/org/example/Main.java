package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Paciente vacio = new Paciente();

        System.out.println(vacio.getDni());

        Paciente paciente = new Paciente("David", 20, 'H', 71, 173);

        System.out.println(paciente.calcularIMC());

        System.out.println("El paciente " + paciente.getNombre() + (paciente.esMayorDeEdad() ? " es mayor de edad" : " es menor de edad"));

        Paciente pepe = new Paciente("Pepe",80,'G',40,160);

        System.out.println(pepe.getGenero());
    }
}