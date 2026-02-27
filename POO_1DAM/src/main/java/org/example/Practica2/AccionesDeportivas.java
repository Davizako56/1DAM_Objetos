package org.example.Practica2;

/**
 * Interfaz para que las clases Jugador y Entrenador tengan acciones
 * @author David Giner
 */
public interface AccionesDeportivas {

    /**
     * Metodo abstracto que derivarán las clases Jugador y Entrenador
     */
    void entrenar();

    /**
     * Metodo abstracto que derivarán las clases Jugador y Entrenador
     */
    void jugarPartido(String rival);
}
