package org.example;

public class AppLibro {

    public static void main(String[] args) {

        Libro libro1 = new Libro("Luna de Plutón","Ángel David Revilla");
        Libro libro2 = new Libro("Don Quijote de la Manxa", "Miguel de Cervantes");

        System.out.println("Total de libros creados: " + Libro.getTotalLibros());
        System.out.println("Libros disponibles: " + Libro.getLibrosDisponibles());
        libro1.prestar();
        System.out.println("El libro " + libro1.getTitulo() + " ha sido prestado.");
        System.out.println("Libros disponibles después del préstamo: " + Libro.getLibrosDisponibles());
        libro1.devolver();
        System.out.println("El libro " + libro1.getTitulo() + " ha sido devuelto.");
        System.out.println("Libros disponibles después de la devolución: " + Libro.getLibrosDisponibles());
    }


}
