package org.example.Carrefour;

public class AppEmpleados {

    public static void main(String[] args) {

        Cajero jorge = new Cajero(147,"Jorge",800);
        jorge.mostrarInfo();
        System.out.println();

        Reponedor raul = new Reponedor(143, "Raul", 600);
        raul.mostrarInfo();
        System.out.println();

        Seguridad carlos = new Seguridad(144, "Carlos", 1300, "PalladasSL");
        carlos.añadirArma("Navaja");
        carlos.añadirArma("nunchacus");
        carlos.borrarArma("Nunchacus");
        System.out.println();
        carlos.añadirArma("navaja");
        System.out.println();
        carlos.mostrarInfo();
        System.out.println();
        carlos.mostrarArmas();
        carlos.añadirArma("Raygun");
        System.out.println();
        carlos.mostrarArmas();
        carlos.añadirArma("Guantelete del infinito");
        System.out.println();
        carlos.mostrarArmas();
    }
}
