package org.example.Iteradores;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteradoresObjetos {

    public static void main(String[] args) {

        ArrayList<Presidente> lista = new ArrayList<>(Arrays.asList(
                new Presidente("Pedro Sanchez", "España"),
                new Presidente("Donald Trump", "USA"),
                new Presidente("Benjamin Netanyahu", "Israel"),
                new Presidente("Macron", "Francia")));

        Iterator<Presidente> it = lista.iterator();

        while(it.hasNext()) {

            Presidente presi = it.next();

            if(presi.getNombre().equals("Macron")) {
                it.remove();
            }
        }

        System.out.println(lista);
    }
}
