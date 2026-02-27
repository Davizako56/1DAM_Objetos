package org.example.Practica2;

/**
 * Esta clase abstracta actua como una super clase para varias clases del paquete
 * @author David Giner
 */
public abstract class MutxamelFC implements FuncionesIntegrantes{

    /**
     * @param nombre Es una variable que guarda el nombre del objeto.
     * @param edad Es una variable que guarda la edad del objeto.
     */
    private String nombre;
    private int edad;

    public MutxamelFC(String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override

    public void concentrarse() {
        System.out.println(nombre + " se concentra.");
    }

    @Override

    public void viajar(String ciudad) {
        System.out.println(nombre + " viaja a " + ciudad + ".");
    }

    @Override

    public void celebrarGol() {
        System.out.println(nombre + " celebra un gol.");
    }
}
