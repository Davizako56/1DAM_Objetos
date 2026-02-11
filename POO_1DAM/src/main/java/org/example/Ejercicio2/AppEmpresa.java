package org.example.Ejercicio2;

public class AppEmpresa {

    public static void main(String[] args) {

        Empleado[] empleados = {
                new Empleado(),
                new Desarrollador(),
                new Diseñador(),
                new Gerente()
        };

        System.out.println("=== Usando el array polimórfico ===");

        for (Empleado empleado : empleados) {
            empleado.realizarTarea();
        }
        System.out.println();

        Empleado gerente = new Gerente();
        Empleado desarrollador = new Desarrollador();

        System.out.println("=== Usando el método asignarTarea() ===");

        asignarTarea(gerente);
        asignarTarea(desarrollador);
    }

    public static void asignarTarea(Empleado empleado) {

        System.out.println("Asignando tarea al empleado...");
        empleado.realizarTarea();
    }
}
