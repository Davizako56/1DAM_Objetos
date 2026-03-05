package org.example.Colecciones;
import java.util.Scanner;
import java.util.Stack;

public class BateriaPilas {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        ejercicio3();
    }

    public static void ejercicio1() {

        Stack<Character> pila = new Stack<>();

        pila.push('D');
        pila.push('A');
        pila.push('V');
        pila.push('I');
        pila.push('D');

        System.out.println("Pila vacía? -> " + pila.isEmpty());
        System.out.println("Tamaño de la pila: " + pila.size());
        System.out.println("Último elemento de la pila: " + pila.peek());

        while(!pila.isEmpty()) {

            System.out.println(pila.toString());
            pila.pop();
        }

    }

    public static void ejercicio2(){

        Stack<Integer> numeros = new Stack<>();

        for(int i = 1; i <= 3; i++) {

            System.out.println("Inserta el número " + i + ":");
            int num = entrada.nextInt();
            numeros.push(num);
        }

        System.out.print("Números en orden inverso: ");

        while(!numeros.isEmpty()) {

            System.out.print(numeros.pop() + ", ");
        }

    }

    public static void ejercicio3() {

        String expresion = "((2+3)*(5-1)(";

        if(esBalanceado(expresion)) {
            System.out.println("Correcto.");
        }else{
            System.out.println("Incorrecto.");
        }
    }

    public static boolean esBalanceado(String cadena) {

        Stack<Character> pila = new Stack<>();

        for(int i = 0; i < cadena.length(); i++) {

            if(cadena.charAt(i) == '(') {
                pila.push(cadena.charAt(i));
            }else if(cadena.charAt(i) == ')') {

                if(pila.contains('(')) {
                    pila.pop();
                }else{
                    return false;
                }
            }
        }

        if(pila.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }
}
