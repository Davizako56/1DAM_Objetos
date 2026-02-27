package org.example.Practica2;
import java.util.Scanner;

/**
 * Esta es la clase entrenador el cual tiene las variables y métodos necesarios para poder crear un objeto de este tipo
 * @Author David Giner
 */
public class Entrenador extends MutxamelFC implements AccionesDeportivas{
    static Scanner entrada = new Scanner(System.in);

    /**
     * @param formato Es una constante que indica cual debe de ser el formato de las formaciones dadas para los entenadores creados.
     * @param equipo Es una variable que guardará el equipo en el cual pertenezca el entrenador creado.
     * @param formacionPreferida Es la variable que guardará la formación que el entrenador quiera aplicar.
     */
    private final String formato = "\\d-\\d-\\d";
    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipo){

        super(nombre, edad);
        this.equipo = equipo;
        setFormacionPreferida();
    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    /**
     * Este método sirve para que el entrenador pueda asignar una formación.
     */
    public void setFormacionPreferida() {

        /**
         * @param formacion Es la variable Que guardará la formación que se le quiera añadir al entrenador.
         */
        String formacion;

        System.out.println("Introduce la formación:");
        formacion = entrada.next();

        if(formacion.matches(formato)) {
            this.formacionPreferida = formacionPreferida;
        }else{
           throw new FormatoIncorrectoException("El formato no es correcto");
        }
    }

    /**
     * Este método imprime como planificará el entrenamiento el entrenador.
     */
    public void planificarEntrenamiento(){
        System.out.println("El entrenador " + getNombre() + " planifica el entrenamiento.");
    }

    /**
     * Este método sirve para sobreescribir la formación asignada anteriormente al entrenador.
     */
    public void hacerCambios() {
        setFormacionPreferida();
    }

    @Override

    public void concentrarse() {
        System.out.println(getNombre() + " se concentra.");
    }

    @Override

    public void viajar(String ciudad) {
        System.out.println(getNombre() + " viaja a " + ciudad + ".");
    }

    @Override

    public void celebrarGol() {
        System.out.println(getNombre() + " celebra un gol");
    }

    @Override

    public void entrenar() {
        System.out.println(getNombre() + " se pone a entrenar.");
    }

    @Override

    public void jugarPartido(String rival) {
        System.out.println(getNombre() + " juega contra " + rival + ".");
    }

    @Override

    public String toString() {
        return "[Nombre = " + getNombre() + ", edad = " + getEdad() + ", equipo = " + equipo + ", formación preferida = " + formacionPreferida + "]";
    }
}
