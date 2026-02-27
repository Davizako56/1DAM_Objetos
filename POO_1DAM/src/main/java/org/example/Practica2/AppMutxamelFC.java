package org.example.Practica2;

/**
 * Clase que tiene el rol de aplicación principal
 * @autho David Giner
 */
public class AppMutxamelFC {

    public static void main(String[] args) {

        Jugador carlos = new Jugador("Carlos",20, Equipos.SENIOR, Posiciones.PORTERO);
        Jugador raul = new Jugador("Raul",22, Equipos.SENIOR, Posiciones.CENTROCAMPOSTA);
        Jugador mahmoud = new Jugador("Mahmoud",19, Equipos.SENIOR, Posiciones.DELANTERO);

        Entrenador manzanita = new Entrenador("Adrian",26, Equipos.SENIOR);

        Masajista joaquin = new Masajista("Joaquin", 20, "masajista deportivo", 3);
        Masajista jacobo = new Masajista("Jacobo", 20, "masajista descontracturante", 4);

        Acompañante jorge = new Acompañante("Jorge", 21, raul, "Hermano");
        Acompañante cristian = new Acompañante("Cristian", 21, mahmoud, "Amigo");

        manzanita.concentrarse();
        raul.entrenar();
        joaquin.darMasaje(raul);
        carlos.viajar("Madrid");
        manzanita.planificarEntrenamiento();
        manzanita.entrenar();
        raul.descansar();
        mahmoud.calentar();
        mahmoud.jugarPartido("Manu");
        jorge.animarEquipo();
        manzanita.hacerCambios();
        mahmoud.marcarGol();
        jorge.celebrarGol();
        jacobo.darMasaje(mahmoud);
        jacobo.darMasaje(raul);
        carlos.viajar("Mutxamel");
        carlos.descansar();
        AppMantenimiento.listasEntrenadores.add(manzanita);

    }
}
