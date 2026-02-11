package org.example.RedSocial;

public class Streamer extends Usuario{

    private int numero_retransmisiones;
    private int horas_directo;

    public Streamer(String nombre, int edad, String nombreDeUsuario, int seguidores, int numero_retransmisiones, int horas_directo) {
        super(nombre, edad, nombreDeUsuario, seguidores);
        this.numero_retransmisiones = numero_retransmisiones;
        this.horas_directo = horas_directo;
    }

    public int getNumero_retransmisiones() {
        return numero_retransmisiones;
    }

    public void setNumero_retransmisiones(int numero_retransmisiones) {
        this.numero_retransmisiones = numero_retransmisiones;
    }

    public int getHoras_directo() {
        return horas_directo;
    }

    public void setHoras_directo(int horas_directo) {
        this.horas_directo = horas_directo;
    }

    @Override

    public void mostrarInfo() {

        System.out.println("Información del streamer:");
        super.mostrarInfo();
        System.out.println("Número de retransmisiones: " + numero_retransmisiones);
        System.out.println("Horas en directo: " + horas_directo);
    }

    @Override

    public String toString() {

        return "[Número de retransmisiones = " + numero_retransmisiones + ", horas en directo = " + horas_directo + "]";
    }
}
