package org.example.Inserso;

public class AppInserso {

    public static void main(String[] args) {

        Abuelo manolo = new Abuelo("Manolo", 89);
        Abuelo pepe = new Abuelo("Pepe", 67);
        Abuelo marisa = new Abuelo("Marisa", 75);
        Abuelo euge = new Abuelo("Euge", 68);

        Autobus alsa = new Autobus("1234KKK", "Madrid");
        alsa.insertarAbuelo(manolo);
        alsa.insertarAbuelo(pepe);
        alsa.insertarAbuelo(marisa);
        alsa.insertarAbuelo(euge);

        System.out.println(alsa.getListaAbuelos());
        alsa.borrarAbuelo(euge);
        System.out.println(alsa.getListaAbuelos());

        alsa.mostrarPasajero();
        System.out.println();

        alsa.mostrarMayores(70);
    }
}
