package org.example.Mapas;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BateriaMapas {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        ejercicio3();
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

    static HashMap<String, Double> mapita = new HashMap<>();

    public static void ejercicio3() {

        menu();
    }

    public static void menu() {

        System.out.println("*** REGISTRO DE TEMPERATURAS ***");

        while(true) {
            System.out.println("Elige una opción [insertar, actualizar, consultar, ver todas, salir]:");
            String opcion = entrada.nextLine().toLowerCase();
            opciones(opcion);
            System.out.println();
        }
    }

    public static void opciones(String opcion) {

        switch(opcion) {

            case "insertar":

                System.out.println("Introduce los nuevos datos (ciudad/temperatura):");
                String[] ciudad = entrada.nextLine().split("/");

                for(Map.Entry<String,Double> mapa : mapita.entrySet()) {

                    if(mapa.getKey().equalsIgnoreCase(ciudad[0])) {

                        System.out.println("Esta ciudad ya existe.");
                        return;
                    }
                }

                mapita.put(ciudad[0], Double.valueOf(ciudad[1]));
                break;

            case "actualizar":

                System.out.println("Introduce la ciudad a actualizar:");
                String nuevo = entrada.nextLine();

                for(Map.Entry<String,Double> validar : mapita.entrySet()) {

                    if(validar.getKey().equalsIgnoreCase(nuevo)) {

                        System.out.println("Introduce su nueva temperatura:");
                        double temperatura = entrada.nextDouble();

                        for(Map.Entry<String,Double> mapa : mapita.entrySet()) {

                            if(mapa.getKey().equalsIgnoreCase(nuevo)) {

                                mapa.setValue(temperatura);
                                System.out.println("Nueva temperatura de " + mapa.getKey() + ": " + mapa.getValue());
                                entrada.nextLine();
                                return;
                            }
                        }
                    }
                }

                System.out.println("La ciudad no existe.");
                break;

            case "consultar":

                System.out.println("Que ciudad quieres consultar?");
                String consultar = entrada.nextLine();

                for(Map.Entry<String,Double> mapa : mapita.entrySet()) {

                    if(mapa.getKey().equalsIgnoreCase(consultar)) {

                        System.out.println(mapa.getKey() + " - " + mapa.getValue());
                        return;
                    }
                }

                System.out.println("La ciudad no existe.");
                break;

            case "ver todas":

                System.out.println("*** CIUDADES APUNTADAS ***");

                for(Map.Entry<String,Double> mapa : mapita.entrySet()) {

                    System.out.println(mapa.getKey() + " - " + mapa.getValue());
                }

                break;

            case "salir":

                System.out.println("Saliendo del programa...");
                System.exit(0);

            default:

                System.out.println("Caso no válido, inténtelo de nuevo");
                break;
        }
    }
}
