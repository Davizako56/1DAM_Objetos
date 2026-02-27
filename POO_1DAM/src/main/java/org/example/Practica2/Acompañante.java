package org.example.Practica2;

/**
 * Clase para crear objetos de tipo acompañante
 * @Author David Giner
 */
public class Acompañante extends MutxamelFC{

    /**
     * @param integrante Es una variable de tipo jugador el cual guarda al jugador que acompaña.
     * @param parentesco Es una variable que determina el parentesco entre el acompañante y el jugador que acompaña.
     */
    private Jugador integrante;
    private String parentesco;

    public Acompañante(String nombre, int edad, Jugador integrante, String parentesco){

        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    /**
     * Este método imprime un mensaje que indica que el acompañante esta animando al equipo
     */
    public void animarEquipo() {
        System.out.println(getNombre() + " anima al equipo.");
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
        return "[Nombre = " + getNombre() + ", edad = " + getEdad() + ", integrante = " + integrante + ", parentesco = " + parentesco + "]";
    }
}
