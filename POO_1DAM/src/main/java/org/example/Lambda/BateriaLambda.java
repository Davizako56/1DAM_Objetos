package org.example.Lambda;
import java.util.ArrayList;
import java.util.List;

public class BateriaLambda {

    public static void main(String[] args) {

        ejercicio3();
    }

    public static void ejercicio1() {

        Ejecutor ej = (num) -> {

            System.out.println("Es mayor que 10?");

            if(num > 10) {
                return true;
            }else{
                return false;
            }
        };

        System.out.println(ej.ejecutar(11));
    }

    public static void ejercicio2() {

        Persona manzanita = new Persona("Adrian", 27);

        VerificarVoto voto = (persona) -> {

            System.out.println("Puede " + persona.getNombre() + " votar?");

            if(persona.getEdad() >= 18) {
                System.out.println("Si");
                return true;
            }else{
                System.out.println("No");
                return false;
            }
        };

        voto.puedeVotar(manzanita);
    }

    public static void ejercicio3() {

        List<Producto> lista = new ArrayList<>();
        lista.add(new Producto("SmartPhone", 150, "Electrónica"));
        lista.add(new Producto("LapTop", 900, "Electrónica"));
        lista.add(new Producto("Tablet", 200, "Electrónica"));

        FiltroProducto verificarPrecio = producto -> producto.getPrecio() > 200;
        FiltroProducto verificarCategoria = producto -> producto.getCategoria().equals("Electrónica");

        List<Producto> verificados = new ArrayList<>();

        for(Producto producto : lista) {

            if(verificarPrecio.filtrar(producto) && verificarCategoria.filtrar(producto)) {
                verificados.add(producto);
            }
        }

        System.out.println("Productos de la categoria electrónica que valen más de 200€");

        for(Producto producto : verificados) {
            System.out.println("- " + producto.getNombre());
        }
    }
}
