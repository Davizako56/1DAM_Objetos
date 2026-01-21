package org.example;

public class AppEstudiante {
    public static void main(String[] args) {

        Estudiante jorge = new Estudiante("Jorge","1DAM","Jorge@alu.edu.gva.es");

        System.out.println(jorge.getNia());

        Estudiante raul = new Estudiante("Raul");

        System.out.println(raul.getNia());
        System.out.println();

        System.out.println("Hay " + Estudiante.obtenerTotalEstudiantes() + " estudiantes");

        System.out.println(Estudiante.validarCorreo("patri@mutxamel.com"));
        System.out.println(Estudiante.validarCorreo("patri@alu.edu.gva.es"));
    }
}
