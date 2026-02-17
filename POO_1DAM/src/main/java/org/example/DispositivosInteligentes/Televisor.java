package org.example.DispositivosInteligentes;

public class Televisor extends Dispositivo implements ControlRemoto {

    public Televisor(String nombre, boolean estado) {
        super(nombre, estado);
    }

    @Override

    public void encender() {

        if (mostrarEstado()) {
            System.out.println("El televisor ya está encendido.");
        } else {
            System.out.println("Encendiendo televisor...");
            setEstado(true);
        }
    }

    @Override

    public void sincronizar() {
        System.out.println("Sincronizando televisor con control remoto...");
    }

}

