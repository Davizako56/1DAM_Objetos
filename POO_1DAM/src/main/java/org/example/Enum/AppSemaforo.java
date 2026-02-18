package org.example.Enum;

public class AppSemaforo {

    public static void main(String[] args) {

        Semaforo semaforo = Semaforo.ROJO;

        for(int i = 0; i < 10; i++) {
            System.out.println(semaforo.name());
            semaforo = semaforo.siguiente();

        }
    }
}
