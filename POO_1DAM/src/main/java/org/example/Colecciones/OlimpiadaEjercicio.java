package org.example.Colecciones;
import java.util.Scanner;
import java.util.Stack;

public class OlimpiadaEjercicio {
    static Scanner entrada = new Scanner(System.in);

    public static boolean casoDePrueba() {

        if(!entrada.hasNext()) {
            return false;
        }else{

            String expresion = entrada.nextLine();

            if(validarExpresion(expresion)) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }

        return true;
    }

    public static void main(String[] args) {

        while(casoDePrueba()){

        }
    }

    public static boolean validarExpresion(String cadena) {

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
            }else if(cadena.charAt(i) == '{') {
                pila.push(cadena.charAt(i));
            }else if(cadena.charAt(i) == '}') {

                if(pila.contains('{')) {
                    pila.pop();
                }else{
                    return false;
                }
            }else if(cadena.charAt(i) == '[') {
                pila.push(cadena.charAt(i));
            }else if(cadena.charAt(i) == ']') {

                if(pila.contains('[')) {
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
