package org.example;

public class AppBocadillo {

    public static void main(String[] args) {

        Bocadillo pepito = new Bocadillo("Pepito","normal","bacon","bigmac",10);
        Bocadillo vacio = new Bocadillo();

        pepito.imprimirInfoBocata();
        System.out.println();
        vacio.imprimirInfoBocata();
        System.out.println();

        vacio.setNombre("Chivito");
        vacio.imprimirInfoBocata();
    }
}
