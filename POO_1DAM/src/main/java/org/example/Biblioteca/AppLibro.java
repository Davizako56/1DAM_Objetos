package org.example.Biblioteca;

public class AppLibro {

    public static void main(String[] args) {

        Editorial espasa = new Editorial("Espasa","España");

        Libro libro1 = new Libro("Luna de Plutón","Ángel David Revilla", espasa);
        Libro libro2 = new Libro("Don Quijote de la Manxa", "Miguel de Cervantes", espasa);

        System.out.println("Total de libros creados: " + Libro.getTotalLibros());
        System.out.println("Libros disponibles: " + Libro.getLibrosDisponibles());
        System.out.println("El libro " + libro1.getTitulo() + " ha sido prestado.");
        System.out.println("Libros disponibles después del préstamo: " + Libro.getLibrosDisponibles());
        System.out.println("El libro " + libro1.getTitulo() + " ha sido devuelto.");
        System.out.println("Libros disponibles después de la devolución: " + Libro.getLibrosDisponibles());
        System.out.println();
        System.out.println(libro1.getId());
        System.out.println(libro2.getId());

    }


}
