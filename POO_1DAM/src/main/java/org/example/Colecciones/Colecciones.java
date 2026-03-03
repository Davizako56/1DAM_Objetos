package org.example.Colecciones;
import java.util.ArrayList;
import java.util.Stack;

public class Colecciones {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        Stack<Integer> pila = new Stack<>();

        pila.push(2);
        pila.push(9);
        pila.push(12);

        System.out.println(pila.peek());
        pila.pop();
        System.out.println(pila.peek());



    }
}
