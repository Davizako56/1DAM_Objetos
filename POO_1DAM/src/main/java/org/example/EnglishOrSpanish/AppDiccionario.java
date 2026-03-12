package org.example.EnglishOrSpanish;
import java.util.Random;
import java.util.Scanner;

public class AppDiccionario {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        int aciertos = 0;
        int errores = 0;
        int preguntas = 0;
        String respuesta;

        Diccionario diccionario = new Diccionario();

        String[] español = {
                "casa", "perro", "gato", "árbol", "cielo",
                "mar", "montaña", "río", "ciudad", "pueblo",
                "coche", "camino", "flor", "sol", "luna",
                "estrella", "nube", "viento", "lluvia", "nieve",
                "fuego", "tierra", "aire", "agua", "comida",
                "bebida", "libro", "mesa", "silla", "puerta",
                "ventana", "escuela", "trabajo", "amigo", "familia",
                "música", "película", "juego", "tiempo", "dinero",
                "ropa", "zapato", "mano", "cabeza", "corazón",
                "niño", "mujer", "hombre", "día", "noche"
        };

        String[] ingles = {
                "house", "dog", "cat", "tree", "sky",
                "sea", "mountain", "river", "city", "town",
                "car", "road", "flower", "sun", "moon",
                "star", "cloud", "wind", "rain", "snow",
                "fire", "earth", "air", "water", "food",
                "drink", "book", "table", "chair", "door",
                "window", "school", "work", "friend", "family",
                "music", "movie", "game", "time", "money",
                "clothes", "shoe", "hand", "head", "heart",
                "child", "woman", "man", "day", "night"
        };

        for(int i = 0; i < español.length; i++) {
            diccionario.nuevoPar(español[i], ingles[i]);
        }

        System.out.println("*** ADIVINA LA PALABRA ***");

        do {

            int num = random.nextInt(50);

            diccionario.primeraLetraTraduccion(español[num]);
            System.out.println("Indique la respuesta correcta:");
            respuesta = entrada.next();

            if(respuesta.equalsIgnoreCase("fin")) {
                System.out.println("FIN DEL PROGRAMA");
                System.out.println("Total preguntas: " + preguntas);
                System.out.println("Total aciertos: " + aciertos);
                System.out.println("Total errores: " + errores);

                try {
                    int porcentaje = (aciertos * 100) / preguntas;
                    System.out.println("Aciertos: " + porcentaje + "%");
                }catch(ArithmeticException e) {
                    System.out.println("Aciertos: 0%");
                }
            }else if(respuesta.equalsIgnoreCase(ingles[num])) {
                System.out.println("¡CORRECTO!");
                preguntas++;
                aciertos++;
            }else{
                System.out.println("¡ERROR!");
                preguntas++;
                errores++;
            }

        }while(!respuesta.equalsIgnoreCase("fin"));

    }
}
