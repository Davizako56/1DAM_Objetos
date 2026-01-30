package org.example.PartidoDeTenis;

public class AppTenis {

    public static void main(String[] args) {

        Jugador carlos = new Jugador("Carlos", 2);
        Jugador manzanita = new Jugador("Adrian", 3);

        Partido partido = new Partido(carlos, manzanita);

        partido.insertarSet(6, 4);
        partido.insertarSet(7, 6);
    }
}
