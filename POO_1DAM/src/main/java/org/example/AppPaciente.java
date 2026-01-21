package org.example;
import java.util.Scanner;

public class AppPaciente {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el nombre del paciente:");
        String nombre = entrada.next();
        System.out.println("Introduce la edad del paciente:");
        int edad = entrada.nextInt();
        System.out.println("Introduce el género del paciente:");
        char genero = entrada.next().toUpperCase().charAt(0);
        System.out.println("Introduce el peso paciente:");
        double peso = entrada.nextDouble();
        System.out.println("Introduce la altura del paciente");
        int altura = entrada.nextInt();

        Paciente paciente1 = new Paciente(nombre, edad, genero, peso, altura);
        Paciente paciente2 = new Paciente(nombre, edad, genero, 0, 0);
        Paciente paciente3 = new Paciente();

        paciente3.setNombre("Adrian");
        paciente3.setEdad(18);
        paciente3.setGenero('H');
        paciente3.setPeso(85);
        paciente3.setAltura(180);

        double resultado = paciente1.calcularIMC();

        if (resultado == -1) {
            System.out.println("El paciente 1 tiene infrapeso");
        }else if (resultado == 1) {
            System.out.println("El paciente 1 tiene sobrepeso");
        }else{
            System.out.println("El paciente 1 está en su peso ideal");
        }
        System.out.println();

        resultado = paciente2.calcularIMC();

        if (resultado == -1) {
            System.out.println("El paciente 2 tiene infrapeso");
        }else if (resultado == 1) {
            System.out.println("El paciente 2 tiene sobrepeso");
        }else{
            System.out.println("El paciente 2 está en su peso ideal");
        }
        System.out.println();

        resultado = paciente3.calcularIMC();

        if (resultado == -1) {
            System.out.println("El paciente 3 tiene infrapeso");
        }else if (resultado == 1) {
            System.out.println("El paciente 3 tiene sobrepeso");
        }else{
            System.out.println("El paciente 3 está en su peso ideal");
        }
        System.out.println();

        System.out.println("El paciente 1 " + (paciente1.esMayorDeEdad() ? " es mayor de edad" : " es menor de edad"));
        System.out.println();
        System.out.println("El paciente 2 " + (paciente2.esMayorDeEdad() ? " es mayor de edad" : " es menor de edad"));
        System.out.println();
        System.out.println("El paciente 3 " + (paciente3.esMayorDeEdad() ? " es mayor de edad" : " es menor de edad"));
        System.out.println();

        System.out.print("Paciente 1: ");
        System.out.println(paciente1.toString());
        System.out.println();
        System.out.print("Paciente 2: ");
        System.out.println(paciente2.toString());
        System.out.println();
        System.out.print("Paciente 3: ");
        System.out.println(paciente3.toString());
    }
}
