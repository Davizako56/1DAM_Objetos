package org.example.Colecciones;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BateriaColas {

    public static void main(String[] args) {

        ejercicio3();
    }

    public static void ejercicio3() {

        Queue<String> playlist = new LinkedList<>();

        playlist.offer("Let it be - The Beatles");
        playlist.offer("Bohemian Rhapsody - Queen");
        playlist.offer("Shape of you - Ed Sheeran");
        playlist.offer("Blinding lights - The Weeknd");
        playlist.offer("Stay - Justin Bieber");

        System.out.println("Estado inicial de la playlist: " + playlist);
        System.out.println();

        while(!playlist.isEmpty()){

            System.out.println("Reproduciendo: " + playlist.poll());
            System.out.println("Estado de la playlist después de reproducir la canción: " + playlist);

        }

        System.out.println("La playlist ha terminado.");
    }

    public static void ejercicio5() {

        Deque<String> palabras = new LinkedList<>();
    }
}
