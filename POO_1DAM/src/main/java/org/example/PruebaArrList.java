package org.example;
import java.util.ArrayList;
import java.util.Arrays;

public class PruebaArrList {

    public static void main(String[] args) {

        ArrayList<Integer> listaNotas = new ArrayList<>();

        listaNotas.add(5);
        listaNotas.add(10);
        listaNotas.add(6);

        System.out.println("Elementos en la lista: " + listaNotas.size());

        listaNotas.add(1,4);

        System.out.println("Elementos en la lista: " + listaNotas.size());

        System.out.println("Nota en la posición 2: " + listaNotas.get(2));

        listaNotas.remove(1);
        System.out.println("Elementos en la lista: " + listaNotas.size());
        System.out.println(listaNotas);
        System.out.println(listaNotas.indexOf(10));
        System.out.println();

        System.out.println("Las notas de Raul: ");

        for (Integer nota : listaNotas) {

            System.out.println("Nota de la asignatura: " + nota);
        }

        System.out.println();

        for (int i = 0; i < listaNotas.size(); i++) {

            System.out.println("Nota de la asignatura " + (i + 1) + ": " + listaNotas.get(i));
        }

        listaNotas.set(0,10);
        System.out.println(listaNotas);

        Object copia_mala = listaNotas.clone();
        ArrayList<Integer> copia = new ArrayList<>(listaNotas);

        System.out.println(listaNotas.contains(6));

        System.out.println("Lista vacia? " + listaNotas.isEmpty());
        listaNotas.clear();
        System.out.println("Lista vacia? " + listaNotas.isEmpty());

        listaNotas.addAll(Arrays.asList(2,5,6,3));

        System.out.println(listaNotas);
    }
}
