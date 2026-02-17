package org.example.Interfaces;

import java.util.ArrayList;

public class AppVoladores {

    public static void main(String[] args) {

        Superman clark_ken = new Superman();
        Pajaro piolin = new Pajaro();
        Spiderman peter_parker = new Spiderman();

        clark_ken.volar();
        piolin.volar();
        clark_ken.rayoLaser();
        clark_ken.alientoDeHielo();

        ArrayList<Superheroe> listaHeroes = new ArrayList<>();

        listaHeroes.add(clark_ken);
        listaHeroes.add(peter_parker);

        for (Superheroe superheroe : listaHeroes) {

            if(superheroe instanceof Superman) {
                ((Superman) superheroe).alientoDeHielo();
            }
        }
    }
}
