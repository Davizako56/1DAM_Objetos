package org.example.Practica2;
import java.util.ArrayList;
import java.util.Scanner;

public class Jugador extends MutxamelFC implements AccionesDeportivas{
    static Scanner entrada = new Scanner(System.in);

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;
    ArrayList<Jugador> listaJugadores;


    public Jugador(String nombre, int edad, Equipos categoria, Posiciones posicion){

        super(nombre, edad);
        this.categoria = categoria;
        setDorsal();
        this.posicion = posicion;
        listaJugadores = new ArrayList<>();
        listaJugadores.add(this);
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

    public void setDorsal() {
        System.out.println("Introduce el dorsal:");
        int dorsal = entrada.nextInt();

        if(validarDorsal(dorsal)) {
            this.dorsal = dorsal;
        }else{
            throw new DorsalRepetidoException("No pueden haber más de un jugador con el mismo dorsal en el mismo equipo");
        }
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
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

    public boolean validarDorsal(int dorsal) {

        for(Jugador jugador : listaJugadores) {

            if(dorsal == jugador.getDorsal() && getCategoria() == jugador.getCategoria()) {
                return false;
            }
        }

        return true;
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
