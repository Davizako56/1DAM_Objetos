package org.example.Lambda;
import java.util.ArrayList;
import java.util.List;

public class AppPersona {

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan", 16));
        personas.add(new Persona("Ana", 18));
        personas.add(new Persona("Pedro", 25));
        personas.add(new Persona("María", 17));
        personas.add(new Persona("Luis", 30));

        VerificarVoto verificador = persona -> persona.getEdad() >= 18;

        List<Persona> votadores = new ArrayList<>();

        for(Persona persona : personas) {

            if(verificador.puedeVotar(persona)) {
                votadores.add(persona);
            }
        }

        System.out.println("Personas que pueden votar:");

        for(Persona persona : votadores) {
            System.out.println("- " + persona.getNombre());
        }
    }
}
