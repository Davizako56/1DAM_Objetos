package org.example.Iteradores;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Problema144 {
    static Scanner entrada = new Scanner(System.in);

    public static boolean casoDepPrueba() {

        if(!entrada.hasNext()) {
            return false;
        }else{

            ArrayList<Character> lista = new ArrayList<>();
            ListIterator<Character> it = lista.listIterator();

            String frase = entrada.nextLine();

            for(Character letra : frase.toCharArray()) {

                switch(letra) {

                    case '-':

                        while(it.hasPrevious()) {
                            it.previous();
                        }
                        break;

                    case '+':

                        while(it.hasNext()) {
                            it.next();
                        }
                        break;

                    case '*':

                        if (it.hasNext()) {
                            it.next();
                        }
                        break;

                    case '3':

                        if(it.hasNext()) {
                            it.next();
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
            System.out.println();

            return true;
        }
    }

    public static void main(String[] args) {

        while(casoDepPrueba()) {

        }
    }
}
