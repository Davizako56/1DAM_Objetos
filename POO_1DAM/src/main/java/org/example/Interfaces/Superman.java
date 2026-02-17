package org.example.Interfaces;

public class Superman extends Superheroe implements Volador, Ataques {

    @Override
    public void volar() {
        System.out.println("Sobrevolando la ciudad vigilando a los malos...");
    }

    @Override

    public void rayoLaser() {
        System.out.println("Disparando laser por los ojos!!");
    }

    @Override

    public void alientoDeHielo() {
        System.out.println("Escupiendo hielos!!");
    }
}
