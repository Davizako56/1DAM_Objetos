package org.example.Practica2;

public class AppMutxamelFC {

    public static void main(String[] args) {

        Jugador carlos = new Jugador("Carlos",20, Equipos.SENIOR, 1, Posiciones.PORTERO);
        Jugador raul = new Jugador("Raul",22, Equipos.SENIOR, 6, Posiciones.CENTROCAMPOSTA);
        Jugador mahmoud = new Jugador("Mahmoud",19, Equipos.SENIOR,10,Posiciones.DELANTERO);

        Entrenador manzanita = new Entrenador("Adrian",26, Equipos.SENIOR);

        Masajista joaquin = new Masajista("Joaquin", 20, "masajista deportivo", 3);
        Masajista jacobo = new Masajista("Jacobo", 20, "masajista descontracturante", 4);
    }
}
