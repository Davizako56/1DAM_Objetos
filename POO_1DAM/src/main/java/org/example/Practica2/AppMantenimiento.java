package org.example.Practica2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase funciona como la aplicación de amntenimiento
 * @author David Giner
 */
public class AppMantenimiento {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Entrenador> listasEntrenadores = new ArrayList<>();

    public static void main(String[] args) {

        menu();
    }

    /**
     * Este método sirve para imprimir un menú funcional que indica las diferentes opciones que tiene el usuario.
     */
    public static void menu() {

        System.out.println("=== App de mantenimiento del MUTXAMEL FC ===");
        System.out.println();
        System.out.println("[1]. Mantenimiento de jugadores");
        System.out.println("    Dentro podremos añadir jugadores, modificar datos y añadir acompañantes (solo seniors).");
        System.out.println("[2]. Mantenimiento de entrenadores (añadir-modificar-salir)");
        System.out.println("    Dentro podremos añadir entrenadores y modificar sus datos.");
        System.out.println("[3]. Mantenimiento masajistas (añadir-modificar datos-salir)");
        System.out.println("    Dentro podremos añadir masajistas y modificar sus datos.");
        System.out.println("[4]. Consultar equipos");
        System.out.println("    Dentro se deben listar los tipos de equipos del club y elegir uno.");
        System.out.println("[X]. Salir");
        System.out.println();
        System.out.println("=============================================");
        System.out.println();
        System.out.println("Selecciona una opción:");

        /**
         * @param opcion Es la variable que indicara que opción del menú se ha escogido.
         */
        char opcion = entrada.next().toUpperCase().charAt(0);
        opciones(opcion);



    }

    /**
     * Método que contiene las diferentes opciones funcionales del menú
     * @param opcion Parámetro que obtiene la opcion del menú a ejecutar dentro del método.
     */
    public static void opciones(char opcion) {

        switch(opcion) {

            case '2':
                mantenimientoEntrenador();
                menu();

            case '4':
                consultarEquipos();

            case 'X':
                System.exit(0);

            default:
                System.out.println("La opción no es válida.");
                menu();
        }
    }

    /**
     * Método específicamente hecho para el mantenimiento de los entrenadores.
     */
    public static void mantenimientoEntrenador() {

        /**
         * @param nombre Esta variable se queda con el nombre del entrenador que queramos modificar o añadir.
         * @param edad Su propósito es el mismo que el de la variable nombre solo que esta guarda la edad.
         */
        String nombre;
        int edad;

        System.out.println("=== Mantenimiento de entrenadores ===");
        System.out.println();
        System.out.println("[1]. Añadir nuevo entrenador");
        System.out.println("[2]. Modificar entrenador existente");
        System.out.println("[X]. Salir");
        char opcion = entrada.next().toUpperCase().charAt(0);

        switch(opcion) {

            case '1':
                System.out.println("Introduce el nombre del entrenador:");
                nombre = entrada.next();
                System.out.println("Introduce la edad del entrenador:");
                edad = entrada.nextInt();
                listasEntrenadores.add(new Entrenador(nombre, edad, Equipos.SENIOR));
                mantenimientoEntrenador();

            case '2':
                System.out.println("Introduce el nombre del entrenador a modificar:");
                nombre = entrada.next();
                System.out.println("Introduce su edad:");
                edad = entrada.nextInt();

                System.out.println("Que quieres modificar del entrenador " + nombre + " de " + edad + " años?");
                System.out.println();
                System.out.println("[1]. Nombre");
                System.out.println("[2]. Edad");
                System.out.println("[X]. Salir");
                System.out.println();
                System.out.println("Selecciona una opción:");
                char modificar = entrada.next().toUpperCase().charAt(0);

                switch(modificar) {

                    case '1':
                        System.out.println("Introduce el nombre nuevo:");
                        String nombre_nuevo = entrada.next();

                        for(Entrenador entrenador : listasEntrenadores) {

                            if(entrenador.getNombre().equals(nombre) && entrenador.getEdad() == edad) {
                                entrenador.setNombre(nombre_nuevo);
                            }
                        }
                        mantenimientoEntrenador();

                    case '2':
                        System.out.println("Introduce la edad nueva:");
                        int edad_nueva = entrada.nextInt();

                        for(Entrenador entrenador : listasEntrenadores) {

                            if(entrenador.getNombre().equals(nombre) && entrenador.getEdad() == edad) {
                                entrenador.setEdad(edad_nueva);
                            }
                        }
                        mantenimientoEntrenador();

                    case 'X':
                        menu();
                }
        }
    }

    /**
     * Método para poder consultar los diferentes equipos disponibles.
     */
    public static void consultarEquipos() {

        System.out.println("Equipos disponibles:");

        for (Equipos equipo : Equipos.values()) {
            System.out.println("- " + equipo.name());
        }
    }
}
