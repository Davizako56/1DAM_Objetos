package org.example.Lambda;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prueba_String {

    public static void main(String[] args) {

        //Stream<String> pruebaStream = Stream.of("Ibai","IlloJuan","Falete","Kevin")
                //.filter(persona -> persona.startsWith("I"))
                //.filter(persona -> persona.contains("a"))
                //.map(String::toUpperCase);

        //List<String> lista = pruebaStream.toList();
        //System.out.println(lista);

        //List<String> lista2 = Arrays.asList("Jijona","Yema","Piedra","Duro");

        //lista2 = lista2.stream().filter(turron -> turron.contains("o")).toList();
        //System.out.println(lista2);

        tarea();
    }

    public static void tarea() {

        Stream<String> nombres = Stream.of("Ana", "Luis", "Pedro", "Antonio")
                .filter(persona -> persona.length() > 4)
                .map(String::toLowerCase);
    }
}
