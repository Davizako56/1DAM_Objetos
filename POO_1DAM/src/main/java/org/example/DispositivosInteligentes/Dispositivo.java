package org.example.DispositivosInteligentes;

public abstract class Dispositivo {

    private String nombre;
    private boolean estado;

    public Dispositivo(String nombre, boolean estado) {

        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public abstract void encender();

    public void apagar() {

        if(mostrarEstado()) {
            setEstado(false);
            System.out.println(getNombre() + " apagado.");
        }else{
            System.out.println(getNombre() + " ya está apagado.");
        }
    }

    public boolean mostrarEstado() {

        return isEstado();
    }

    @Override

    public String toString() {

        return "[Nombre = " + nombre + ", estado = " + estado + "]";
    }

}