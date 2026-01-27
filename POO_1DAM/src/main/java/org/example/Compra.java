package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Compra {
    static Scanner entrada = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        ArrayList<String> listaCompra = new ArrayList<>();

        //a
        System.out.println("Lista vacía? " + (listaCompra.isEmpty() ? "Si" : "No"));

        listaCompra.add("pan");
        System.out.println();

        System.out.println("Lista vacía? " + (listaCompra.isEmpty() ? "Si" : "No"));

        //b
        listaCompra.addAll(Arrays.asList("acuarius","arroz","jamón","aceite","cereales"));
        System.out.println();

        System.out.println(listaCompra);
        System.out.println();

        //c
        System.out.println(listaCompra.get(2));

        //d

        listaCompra.remove(1);
        listaCompra.add(1, "queso");
        System.out.println();

        System.out.println(listaCompra);
        System.out.println();

        //e
        System.out.println("Leche: " + (listaCompra.contains("leche") ? "Si" : "No"));

        //f
        System.out.println("Que producto quieres añadir al carrito de la compra?");
        String producto = entrada.next().toLowerCase();

        if (!listaCompra.contains(producto)) {
            listaCompra.add(producto);
        }else{
            System.out.println("El producto ya esta añadido en la lista de la compra.");
        }

        //g
        System.out.println();
        System.out.println("Tamaño del carrito: " + listaCompra.size());

        //h
        ArrayList<String> copia = new ArrayList<>(listaCompra);

        //i
        copia.clear();
        System.out.println();
        System.out.println("Copia vacia? " + (copia.isEmpty() ? "Si" : "No"));

        //j
        System.out.println();
        System.out.println(copia.equals(listaCompra) ? "Son iguales" : "No son iguales");

        //k
        copia.add("pan");
        copia.add("arroz");

        //l
        ArrayList<String> faltante = new ArrayList<>(listaCompra);
        faltante.removeAll(copia);
        System.out.println();
        System.out.println(faltante);

        //m
        ArrayList<Integer> precio = new ArrayList<>();

        for (int i = 0; i < listaCompra.size(); i++) {

            int num = random.nextInt(11);
            precio.add(num);
        }

        System.out.println();

        System.out.println(listaCompra);
        System.out.println(precio);
    }
}
