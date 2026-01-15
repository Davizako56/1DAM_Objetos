package org.example;

public class AppPersona {

    public static void main(String[] args) {

        Persona persona = new Persona("David","12345678G",20, "San Juan", "Bombero");

        persona.imprimirDatos();
        System.out.println();

        persona.setNombre("Carlos");
        persona.setEdad(19);

        System.out.println("Cambio de nombre y edad:");
        persona.imprimirDatos();
    }
}
