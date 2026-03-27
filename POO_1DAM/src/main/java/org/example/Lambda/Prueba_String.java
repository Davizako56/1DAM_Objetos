package org.example.Lambda;
import java.util.List;
import java.util.stream.Stream;

public class Prueba_String {

    public static void main(String[] args) {

        Stream<String> pruebaStream = Stream.of("Ibai","IlloJuan","Falete","Kevin")
                .filter(persona -> persona.startsWith("I"))
                .filter(persona -> persona.contains("o"));

        List<String> lista = pruebaStream.toList();
        System.out.println(lista);
    }
}
