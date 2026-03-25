package org.example.MercaDAM;
import java.util.Scanner;
import java.util.Set;

public class AppZonaClientes {
    static Scanner entrada = new Scanner(System.in);

    private static Cliente cliente;

    public static void main(String[] args) {

        Mercadam mercado = new Mercadam();
        mercado.generarClientes();
        autenticacion(mercado.getClientes());

    }

    public static void autenticacion(Set<Cliente> clientes) {

        System.out.println("=== COMPRA ONLINE EN MERCADAM ===");

        for(int i = 2; i >= 0; i--) {

            System.out.println("Usuario:");
            String usuario = entrada.next();
            System.out.println("Contraseña:");
            String contraseña = entrada.next();

            for(Cliente c : clientes) {

                if(c.getUsuario().equals(usuario) && c.getContraseña().equals(contraseña)) {
                    System.out.println("Bienvenido, " + usuario);
                    cliente = c;
                    iniciarCompra();
                }
            }

            System.out.println("Credenciales no válidas. Intentos: " + i);
        }

        System.out.println("ERROR DE AUTENTICACIÓN");


    }

    public static void iniciarCompra() {

        System.out.println("Creando nuevo pedido...");
        imprimirProductos();

    }

    public static void imprimirProductos() {

        Producto[] productos = Producto.values();
        String producto;

        while(true) {
            System.out.println("Elige un producto de la lista...");

            for (Producto pr : productos) {
                System.out.println(pr.name() + ": " + pr.getPrecio() + "€");
            }

            System.out.println("================================");
            System.out.println("Elige un producto:");
            producto = entrada.next();

            for(Producto p : productos) {

                if(p.name().equalsIgnoreCase(producto)) {
                    System.out.println("Has añadido " + p.name() + " con un precio de " + p.getPrecio() + "€");
                    System.out.println("Importe total del pedido: " + p.getPrecio() + "€");
                    cliente.insertarProducto(p);
                    return;
                }
            }

            System.out.println("Producto no reconocido. Elige otro...");
        }

    }

    public static void imprimirResumen() {

    }

    public static void imprimirDespedida() {

    }

    public static void mostrarOpciones() {

    }
}
