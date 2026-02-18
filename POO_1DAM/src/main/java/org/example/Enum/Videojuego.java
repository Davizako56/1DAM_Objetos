package org.example.Enum;
import java.util.Random;
import java.util.Scanner;

public class Videojuego {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Introduce la dificultad:");
        Dificultad dificultad = Dificultad.valueOf(entrada.next().toUpperCase());

        int puntuacion = random.nextInt(5001);
        int total = puntuacion * dificultad.getMultiplicador();

        System.out.println("Puntuación: " + puntuacion);
        System.out.println("Puntuación total: " + total);
    }
}
