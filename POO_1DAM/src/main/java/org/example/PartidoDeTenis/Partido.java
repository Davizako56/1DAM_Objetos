package org.example.PartidoDeTenis;
import java.util.ArrayList;

public class Partido {

    private Jugador jugador1;
    private Jugador jugador2;
    private ArrayList<Set> listaSets;

    public Partido (Jugador jugador1, Jugador jugador2) {

        this.jugador1 = jugador1;
        jugador1.setRival(jugador2);
        this.jugador2 = jugador2;
        jugador2.setRival(jugador1);
        listaSets = new ArrayList<>();
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public ArrayList<Set> getListaSets() {
        return listaSets;
    }

    public void setListaSets(ArrayList<Set> listaSets) {
        this.listaSets = listaSets;
    }

    public void insertarSet(int puntosJ1, int puntosJ2) {

        Set set = new Set();
        set.setPuntosJ1(puntosJ1);
        set.setPuntosJ2(puntosJ2);
        listaSets.add(set);
    }

    @Override

    public String toString() {

        return "[jugador 1 = " + jugador1 + ", jugador 2 = " + jugador2 + "]";
    }
}
