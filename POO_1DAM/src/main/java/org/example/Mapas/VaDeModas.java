package org.example.Mapas;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VaDeModas {
    static Scanner entrada = new Scanner(System.in);

    public static boolean casoDePrueba() {

        int num = entrada.nextInt();

        if(num == 0) {
            return false;
        }else{

            entrada.nextLine();
            String serie = entrada.nextLine();

            if(serie.split(" ").length > num) {
                System.out.println("ERROR: Hay más números de lo previsto");
            }else{

                int[] numeros = new int[num];
                int i = 0;

                for (String dig : serie.split(" ")) {

                     numeros[i] = Integer.parseInt(dig);
                     i++;
                }

                HashMap<Integer, Integer> mapita = new HashMap<>();

                for(int valor : numeros) {

                    if(mapita.containsKey(valor)) {
                        mapita.put(valor, mapita.get(valor) + 1);
                    }else{
                        mapita.put(valor, 1);
                    }
                }

                for(Map.Entry<Integer,Integer> mapa : mapita.entrySet()) {

                    int mayor = mapa.getValue();

                    for(Map.Entry<Integer,Integer> menor : mapita.entrySet()) {

                        if(menor.getValue() > mayor) {

                            mayor = menor.getValue();
                        }
                    }

                    System.out.println(mapita.get(mapa.getKey()));
                    break;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        while(casoDePrueba()) {

        }
    }
}
