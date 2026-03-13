package org.example.Iteradores;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListaIterador_prueba {

    public static void main(String[] args) {

        ArrayList<String> ias = new ArrayList<>(Arrays.asList("ChatGPT","Gemeni","Copilot","DeepSeek","Perplexity"));

        ListIterator<String> it = ias.listIterator();

        while(it.hasNext()) {

            System.out.println(it.nextIndex());

            String ia = it.next();

            System.out.println(it.nextIndex());

            System.out.println(ia);
        }

        while(it.hasPrevious()) {

            System.out.println(it.previousIndex());

            String ia = it.previous();

            if(ia.equals("DeepSeek")) {
                it.add("Claude");
            }

            System.out.println(it.previousIndex());

            System.out.println(ia);
        }
    }
}
