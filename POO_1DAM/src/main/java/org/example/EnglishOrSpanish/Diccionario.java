package org.example.EnglishOrSpanish;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Diccionario {
    static Random random = new Random();

    private HashMap<String,String> mapita;

    public Diccionario() {
        mapita = new HashMap<>();
    }

    public HashMap<String, String> getMapita() {
        return mapita;
    }

    public void setMapita(HashMap<String, String> mapita) {
        this.mapita = mapita;
    }

    public void nuevoPar(String español, String ingles) {

        for(Map.Entry<String,String> mapa : mapita.entrySet()) {

            if(mapa.getKey().equalsIgnoreCase(español)) {

                System.out.println("Esta palabra ya existe en el diccionario.");
                return;
            }
        }

        mapita.put(español, ingles);
    }

    public String traduce(String palabra) {

        for(Map.Entry<String,String> mapa : mapita.entrySet()) {

            if(mapa.getKey().equalsIgnoreCase(palabra)) {
                System.out.println("Palabra en inglés: " + mapa.getValue());
                return mapa.getValue();
            }
        }

        System.out.println("Esta palabra no se encuentra en el diccionario.");
        return null;
    }

    public String palabraAleatoria() {

        String[] claves = mapita.keySet().toArray(new String[0]);
        int num = random.nextInt(claves.length);

        System.out.println("Palabra aleatoria: " + claves[num]);

        return claves[num];
    }

    public String primeraLetraTraduccion(String palabra) {

        for(Map.Entry<String,String> mapa : mapita.entrySet()) {

            if(mapa.getKey().equalsIgnoreCase(palabra)) {

                String[] ingles = mapa.getValue().split("");

                System.out.println(mapa.getKey() + ": " + ingles[0].toUpperCase() + "...");
                return ingles[0].toUpperCase();
            }
        }

        System.out.println("Esta palabra no se encuentra en el diccionario.");
        return null;
    }
}
