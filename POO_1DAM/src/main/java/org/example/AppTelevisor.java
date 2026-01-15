package org.example;

public class AppTelevisor {

    public static void main(String[] args) {

        Televisor tele = new Televisor(10, 60);

        tele.imprimirInfoTele();
        System.out.println();

        tele.bajarCanal();
        tele.imprimirInfoTele();
        System.out.println();

        tele.setCanal(99);
        tele.imprimirInfoTele();
        System.out.println();
        tele.subirCanal();
        tele.imprimirInfoTele();
        System.out.println();

        Televisor vacio = new Televisor();

        vacio.imprimirInfoTele();
    }
}
