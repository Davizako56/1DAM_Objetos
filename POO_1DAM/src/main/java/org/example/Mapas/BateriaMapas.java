package org.example.Mapas;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BateriaMapas {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        ejercicio2();
    }

    public static void ejercicio1() {

        System.out.println("Introduce una frase:");
        String frase = entrada.nextLine().toLowerCase();

        HashMap<String, Integer> mapita = new HashMap<>();

        for(String palabra : frase.split(" ")) {

            if(mapita.containsKey(palabra)) {
                mapita.put(palabra, mapita.get(palabra) + 1);
            }else{
                mapita.put(palabra, 1);
            }
        }

        for(Map.Entry<String, Integer> mapa : mapita.entrySet()) {

            System.out.println(mapa.getKey() + ": " + mapa.getValue());
        }
    }

    public static void ejercicio2() {

        System.out.println("Introduce una palabra:");
        String palabra = entrada.next().toLowerCase();

        HashMap<Character, Integer> mapita = new HashMap<>();

        for(char letra : palabra.toCharArray()) {

            if(mapita.containsKey(letra)) {
                mapita.put(letra, mapita.get(letra) + 1);
            }else{
                mapita.put(letra, 1);
            }
        }

        for(Map.Entry<Character, Integer> mapa : mapita.entrySet()) {

            System.out.println(mapa.getKey() + ": " + mapa.getValue());
        }
    }
}
