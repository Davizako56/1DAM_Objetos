package org.example.PistasDeportivas;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class AppReservas {
    static HashMap<Usuario, HashSet<Reserva>> mapa = new HashMap<>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void eliminar(HashSet<Reserva> listaReservas) {

        System.out.println("Que tipo de pista quieres eliminar?");
        String pista = entrada.next();

        Iterator<Reserva> it = listaReservas.iterator();

        while(it.hasNext()) {

            Reserva reserva = it.next();

            if(reserva.getPista() instanceof Tenis && pista.equalsIgnoreCase("tenis")) {
                it.remove();
            }else if(reserva.getPista() instanceof Padel && pista.equalsIgnoreCase("padel")) {
                it.remove();
            }
        }
    }

    public static HashSet<Reserva> listaReserva(Usuario usuario) {

        return mapa.get(usuario);
    }

    public static void crearReserva(Usuario usuario, Pista pista) {
        
        Reserva reserva = new Reserva(usuario, pista);

        HashSet<Reserva> listaReserva = listaReserva(usuario);

        if(listaReserva.contains(reserva)) {
            throw new ReservaDuplicada("Ya hay una pista reservada");
        }else{
            listaReserva.add(reserva);
            mapa.put(usuario, listaReserva);
        }
    }
}
