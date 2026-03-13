package org.example.Iteradores;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class TecladoRoto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Character> lista = new ArrayList<>();
        ListIterator<Character> it = lista.listIterator();

        String frase = entrada.nextLine();

        for(Character letra : frase.toCharArray()) {

            switch(letra) {

                case '<':

                    if(it.hasPrevious()) {
                        it.previous();
                    }
                    break;

                case '>':

                    if(it.hasNext()) {
                        it.next();
                    }
                    break;

                case '#':

                    if(it.hasPrevious()) {
                        it.previous();
                        it.remove();
                    }
                    break;

                default:
                    it.add(letra);
            }
        }

        for(Character caracter : lista) {

            System.out.print(caracter);
        }
    }
}
