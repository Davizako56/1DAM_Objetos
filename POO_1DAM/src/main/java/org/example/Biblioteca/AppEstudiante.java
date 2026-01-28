package org.example.Biblioteca;

public class AppEstudiante {
    public static void main(String[] args) {

        Estudiante jorge = new Estudiante("Jorge","1DAM","Jorge@alu.edu.gva.es");

        System.out.println(jorge.getNia());

        Editorial millenium = new Editorial("millenium", "España");

        Estudiante raul = new Estudiante("Raul");

        System.out.println(raul.getNia());
        System.out.println();

        System.out.println("Hay " + Estudiante.obtenerTotalEstudiantes() + " estudiantes");

        System.out.println(Estudiante.validarCorreo("patri@mutxamel.com"));
        System.out.println(Estudiante.validarCorreo("patri@alu.edu.gva.es"));

        Libro libro1 = new Libro("Luna de Plutón","Angel David Revilla", millenium);

        System.out.println(libro1.estaDisponible());
        System.out.println();
        Prestamo p1 = libro1.prestar(jorge);
        System.out.println();
        System.out.println(libro1);
        System.out.println(jorge);
        System.out.println();

        System.out.println("Fecha préstamo: " + p1.getFecha());
        System.out.println();

        System.out.println(jorge.getListaLibros());
        System.out.println(libro1.estaDisponible());
        System.out.println(libro1);
        System.out.println();

        System.out.println(millenium.getListaLibros());


    }
}
