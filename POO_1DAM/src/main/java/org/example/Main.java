package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Paciente vacio = new Paciente();

        System.out.println(vacio.getDni());

        Paciente paciente = new Paciente("David", 20, 'M', 50, 160);

        System.out.println(paciente.calcularIMC());
    }
}