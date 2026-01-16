package org.example;

public class AppTelevisor {

    public static void main(String[] args) {

        Televisor tele = new Televisor(5, 50);

        tele.subirCanal();
        tele.subirCanal();
        tele.subirCanal();
        tele.bajarVolumen();
        tele.bajarVolumen();
        tele.bajarCanal();
        tele.subirVolumen();

        System.out.println(tele.getCanal() + " " + tele.getVolumen());
        System.out.println();

        Televisor vacio = new Televisor();

        vacio.imprimirInfoTele();
    }
}
