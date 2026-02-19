package org.example.Excepciones;
import java.util.Scanner;

public class Banco {
    static Scanner entrada = new Scanner(System.in);
    static CuentaBancaria cuenta = new CuentaBancaria(1000);

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        System.out.println("=== Cajero automático ===");
        System.out.println();
        System.out.println("[1]. Consultar saldo");
        System.out.println("[2]. Ingresar dinero");
        System.out.println("[3]. Retirar dinero");
        System.out.println("[X]. Salir");
        System.out.println();
        System.out.println("Seleccione una opción:");
        String opcion = entrada.next().toUpperCase();
        opciones(opcion);

    }

    public static void opciones(String opcion) {

        switch(opcion){

            case "1":
                cuenta.consultarSaldo();
                break;

            case "2":
                System.out.println("Dinero a ingresar a la cuenta:");
                double ingreso = entrada.nextDouble();

                if(ingreso > 3000) {
                    throw new DepositoMaximoException();
                }else if(ingreso <= 0) {
                    throw new MenorOIgualA0Exception(ingreso);
                }else{
                    cuenta.ingresarDinero(ingreso);
                }
                break;

            case "3":
                System.out.println("Inserta el dinero a retirar:");
                double retiro = entrada.nextDouble();

                if(retiro > 600) {
                    throw new LimiteDiarioException();
                }else if (retiro > cuenta.getSaldo()) {
                    throw new SaldoInsuficienteException();
                }else if (retiro <= 0) {
                    throw new MenorOIgualA0Exception(retiro);
                }else{
                    cuenta.retirarDinero(retiro);
                }
                break;

            case "X":
                System.exit(0);

            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}
