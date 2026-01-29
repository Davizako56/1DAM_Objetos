package org.example.Inmobiliaria;

public class AppInmoviliaria {

    public static void main(String[] args) {

        Casa pisito = new Casa("Calle falsa 123");

        pisito.crearHabitacion("cocina",20);
        pisito.crearHabitacion("baño", 7);
        pisito.crearHabitacion("dormitorio", 21);
        pisito.crearHabitacion("Dormitorio", 12);

        System.out.println(pisito.getListaHabitaciones());
        System.out.println();

        pisito.mostrarHabitaciones();
        System.out.println();

        System.out.println("La habitacion más grande es " + pisito.habitacionMasGrande());
        System.out.println();
        System.out.println();

        pisito.mostrarHabitaciones();
        System.out.println();

        System.out.println(pisito);
        System.out.println();

        pisito.getListaHabitaciones().getFirst().crearElectrodomestico("microondas", 0.2);
        pisito.getListaHabitaciones().getFirst().crearElectrodomestico("nevera", 2);
        pisito.getListaHabitaciones().getFirst().crearElectrodomestico("microondas", 0.1);

        pisito.getListaHabitaciones().getFirst().mostrarElectrodomesticos();
        System.out.println();

        System.out.println("El consumo total de la habitación " + pisito.getListaHabitaciones().getFirst().getNombre() + " es " + pisito.getListaHabitaciones().getFirst().calcularConsumo());
        System.out.println();

        System.out.println("La habitación que más consume es " + pisito.habitacionMasCostosa());

        pisito.getListaHabitaciones().get(1).crearElectrodomestico("televisior", 5);
        System.out.println();

        System.out.println("La habitación que más consume es " + pisito.habitacionMasCostosa());
    }

}
