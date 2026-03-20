package org.example.StringBuilder;

public class Prueba {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("Calleu ");
        sb.append("mantecao ").append("Joaquín!! ").append("adios ");

        sb.insert(16, "de limón ");
        sb.replace(25, 35, "Jacobo ");

        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}
