package org.example.Comparables;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class AppCumpleaños {

    public static void main(String[] args) {

        ArrayList<Invitado> invitados = new ArrayList<>();

        invitados.add(new Invitado(15, "Jacobo"));
        invitados.add(new Invitado(12, "David"));
        invitados.add(new Invitado(12, "Joaquín"));
        invitados.add(new Invitado(12, "Dionisio"));

        Collections.sort(invitados, new OrdenarPorEdadoNombreHora().reversed());
        System.out.println(invitados);

        TreeMap<Invitado, String> mapa = new TreeMap<>(Collections.reverseOrder());
    }
}
