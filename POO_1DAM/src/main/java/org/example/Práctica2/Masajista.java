package org.example.Práctica2;

public class Masajista extends MutxamelFC{

    private String titulacion;
    private int añosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int añosExperiencia) {

        super(nombre, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public void darMasaje(Jugador jugador) {
        System.out.println(getNombre() + " le da un masaje a " + jugador.getNombre() + ".");
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

    public String toString() {
        return "[Nombre = " + getNombre() + ", edad = " + getEdad() +", titulación = " + titulacion + ", años de experiencia = " + añosExperiencia + "]";
    }
}
