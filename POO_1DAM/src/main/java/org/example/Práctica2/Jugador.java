package org.example.Práctica2;

public class Jugador extends MutxamelFC implements AccionesDeportivas{

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion){

        super(nombre, edad);
        this.categoria = categoria;
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public void calentar() {
        System.out.println(getNombre() + " está calentando.");
    }

    public void descansar() {
        System.out.println(getNombre() + " está descansando.");
    }

    public void marcarGol() {
        System.out.println(getNombre() + " marca un golazo.");
    }

    @Override

    public void concentrarse() {
        System.out.println(getNombre() + " se concentra.");
    }

    @Override

    public void viajar(String ciudad) {
        System.out.println(getNombre() + " viaja a " + ciudad + ".");
    }

    @Override

    public void celebrarGol() {
        System.out.println(getNombre() + " celebra un gol");
    }

    @Override

    public void entrenar() {
        System.out.println(getNombre() + " se pone a entrenar.");
    }

    @Override

    public void jugarPartido(String rival) {
        System.out.println(getNombre() + " juega contra " + rival + ".");
    }

    @Override

    public String toString() {
        return "[Nombe = " + getNombre() + ", edad =" + getEdad() + ", categoría = " + categoria + ", dorsal = " + dorsal + ", posición = " + posicion + "]";
    }
}
