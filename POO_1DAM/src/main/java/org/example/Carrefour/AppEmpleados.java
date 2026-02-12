package org.example.Carrefour;
import java.util.ArrayList;

public class AppEmpleados {

    static ArrayList<Persona> listaEmpleados = new ArrayList<>();

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
        System.out.println();

        Persona manuel = new Cajero(1232,"Manuel",2000);

        listaEmpleados.add(manuel);
        listaEmpleados.add(carlos);

        fichar(manuel);
        fichar(carlos);
        System.out.println();

        jorge.trabajar();
        raul.trabajar();
        carlos.trabajar();

    }

    public static void fichar(Persona persona) {
        System.out.println("Fichando...");
        listaEmpleados.add(persona);

    }
}
