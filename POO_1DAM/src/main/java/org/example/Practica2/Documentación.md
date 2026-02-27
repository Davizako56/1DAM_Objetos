# Práctica 2: Sistema de modernazación para el MUTXAMEL FC vs Real Madrid

## Índice
- Introducción
- Código

### Introducción

Esta práctica se trata de crear una aplicación para poder gestionar equipos de futbol incluyendo agentes externos como acompañantes, aparte de trabajadores internos como los propios jugadores y entrenadores o masajistas.

### Código

- Acciones deportivas:

````
package org.example.Practica2;

/**
 * Interfaz para que las clases Jugador y Entrenador tengan acciones
 * @author David Giner
 */
public interface AccionesDeportivas {

    /**
     * Metodo abstracto que derivarán las clases Jugador y Entrenador
     */
    void entrenar();

    /**
     * Metodo abstracto que derivarán las clases Jugador y Entrenador
     */
    void jugarPartido(String rival);
}

````
- Acompañante
````
package org.example.Practica2;

/**
 * Clase para crear objetos de tipo acompañante
 * @Author David Giner
 */
public class Acompañante extends MutxamelFC{

    /**
     * @param integrante Es una variable de tipo jugador el cual guarda al jugador que acompaña.
     * @param parentesco Es una variable que determina el parentesco entre el acompañante y el jugador que acompaña.
     */
    private Jugador integrante;
    private String parentesco;

    public Acompañante(String nombre, int edad, Jugador integrante, String parentesco){

        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    /**
     * Este método imprime un mensaje que indica que el acompañante esta animando al equipo
     */
    public void animarEquipo() {
        System.out.println(getNombre() + " anima al equipo.");
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

    public String toString() {
        return "[Nombre = " + getNombre() + ", edad = " + getEdad() + ", integrante = " + integrante + ", parentesco = " + parentesco + "]";
    }
}
````
- AppMantenimiento
````

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
````
- AppMutxamelFC

````

package org.example.Practica2;

/**
 * Clase que tiene el rol de aplicación principal
 * @autho David Giner
 */
public class AppMutxamelFC {

    public static void main(String[] args) {

        Jugador carlos = new Jugador("Carlos",20, Equipos.SENIOR, Posiciones.PORTERO);
        Jugador raul = new Jugador("Raul",22, Equipos.SENIOR, Posiciones.CENTROCAMPOSTA);
        Jugador mahmoud = new Jugador("Mahmoud",19, Equipos.SENIOR, Posiciones.DELANTERO);

        Entrenador manzanita = new Entrenador("Adrian",26, Equipos.SENIOR);

        Masajista joaquin = new Masajista("Joaquin", 20, "masajista deportivo", 3);
        Masajista jacobo = new Masajista("Jacobo", 20, "masajista descontracturante", 4);

        Acompañante jorge = new Acompañante("Jorge", 21, raul, "Hermano");
        Acompañante cristian = new Acompañante("Cristian", 21, mahmoud, "Amigo");

        manzanita.concentrarse();
        raul.entrenar();
        joaquin.darMasaje(raul);
        carlos.viajar("Madrid");
        manzanita.planificarEntrenamiento();
        manzanita.entrenar();
        raul.descansar();
        mahmoud.calentar();
        mahmoud.jugarPartido("Manu");
        jorge.animarEquipo();
        manzanita.hacerCambios();
        mahmoud.marcarGol();
        jorge.celebrarGol();
        jacobo.darMasaje(mahmoud);
        jacobo.darMasaje(raul);
        carlos.viajar("Mutxamel");
        carlos.descansar();
        AppMantenimiento.listasEntrenadores.add(manzanita);

    }
}
````
- DorsalRepetidoException
````

package org.example.Practica2;

/**
 * Esta excepción sirve para asegurarse de que no haya dorsales repetidos dentro de un mismo equipo.
 * @author David Giner
 */
public class DorsalRepetidoException extends RuntimeException {

    public DorsalRepetidoException(String message) {
        super(message);
    }
}
````

- Entrenador

````

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

````

- Equipos

````
package org.example.Practica2;

/**
 * Enum creado para listar los diferentes tipos de equipos que hay
 * @author David Giner
 */
public enum Equipos {

    BENJAMIN, ALEVIN, INFANTIL, CADETE, JUVENIL, SENIOR
}
````

- FormatoIncorrectoException

````
package org.example.Practica2;

/**
 * Excepción creada para controlar que los formatos de algunas variables sean correctos
 * @author David Giner
 */
public class FormatoIncorrectoException extends RuntimeException {

    public FormatoIncorrectoException(String message) {
        super(message);
    }
}
````

- FuncionesIntegrantes
````
package org.example.Practica2;

/**
 * Interfaz que contiene diferentes métodos que heredarán varias clases del paquete.
 * @author David Giner
 */
public interface FuncionesIntegrantes {

    /**
     * Método para poder concentrarse.
     */
    void concentrarse();

    /**
     * Método para viajar .
     * @param ciudad Este parámetro indica a donde se viaja.
     */
    void viajar(String ciudad);

    /**
     * Método para que se pueda celebrar un gol.
     */
    void celebrarGol();
}
````

- Jugador
````
package org.example.Practica2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que guarda todas las funcionalidades que puede utilizar un objeto de este tipo.
 * @author David Giner
 */
public class Jugador extends MutxamelFC implements AccionesDeportivas{
    static Scanner entrada = new Scanner(System.in);

    /**
     * @param categoria Esta variable guarda el equipo en el que pertenece el jugador.
     * @param dorsal Esta variable guarda el dorsal que tiene.
     * @param posicion Esta variable guarda la posición del jugador en los partidos.
     * @param listaJugadores Esta variable es una lista que guarda la cantidad de jugadores creados en la aplicación.
     */
    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;
    private static ArrayList<Jugador> listaJugadores = new ArrayList<>();


    public Jugador(String nombre, int edad, Equipos categoria, Posiciones posicion){

        super(nombre, edad);
        this.categoria = categoria;
        setDorsal();
        this.posicion = posicion;
        listaJugadores.add(this);
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    /**
     * Este método sirve para introducir el dorsal del jugador
     */
    public void setDorsal() {
        System.out.println("Introduce el dorsal:");
        int dorsal = entrada.nextInt();

        if(validarDorsal(dorsal)) {
            this.dorsal = dorsal;
        }else{
            throw new DorsalRepetidoException("No pueden haber más de un jugador con el mismo dorsal en el mismo equipo");
        }
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public void calentar() {
        System.out.println(getNombre() + " está calentando.");
    }

    public void descansar() {
        System.out.println(getNombre() + " está descansando.");
    }

    public void marcarGol() {
        System.out.println(getNombre() + " marca un golazo.");
    }


    /**
     * Este método sirve para asegurarse de que el dorsal es válido, es decir, que no esté repetido dentro del mismo equipo.
     * @param dorsal Es el parámetro que recibe el número del dorsal a comprobar si es válido.
     * @return El método devuelve true si el dorsal es válido y false si no lo es.
     */
    public boolean validarDorsal(int dorsal) {

        if (listaJugadores == null) {
            return true;
        }else{
            for(Jugador jugador : listaJugadores) {

                if(dorsal == jugador.getDorsal() && getCategoria() == jugador.getCategoria()) {
                    return false;
                }
            }
        }

        return true;
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
        return "[Nombe = " + getNombre() + ", edad =" + getEdad() + ", categoría = " + categoria + ", dorsal = " + dorsal + ", posición = " + posicion + "]";
    }
}

````

- Masajista
````
package org.example.Practica2;

/**
 * Clase que le da diferentes funcionalidades a objetos de este tipo.
 * @author David Giner
 */
public class Masajista extends MutxamelFC{

    /**
     * @param titulacion Es la variable que indica la titulación de masajista que tiene el masajista.
     * @param añosExperiencia Es la variable que indica los años de experiencia que tiene el masajista.
     */
    private String titulacion;
    private int añosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int añosExperiencia) {

        super(nombre, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    /**
     * Método para dar masajes a jugadores.
     * @param jugador Este parámetro guarda el jugador al cual se le va a dar el masaje.
     */
    public void darMasaje(Jugador jugador) {
        System.out.println(getNombre() + " le da un masaje a " + jugador.getNombre() + ".");
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

    public String toString() {
        return "[Nombre = " + getNombre() + ", edad = " + getEdad() +", titulación = " + titulacion + ", años de experiencia = " + añosExperiencia + "]";
    }
}
````

- MutxamelFC
````
package org.example.Practica2;

/**
 * Esta clase abstracta actua como una super clase para varias clases del paquete
 * @author David Giner
 */
public abstract class MutxamelFC implements FuncionesIntegrantes{

    /**
     * @param nombre Es una variable que guarda el nombre del objeto.
     * @param edad Es una variable que guarda la edad del objeto.
     */
    private String nombre;
    private int edad;

    public MutxamelFC(String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override

    public void concentrarse() {
        System.out.println(nombre + " se concentra.");
    }

    @Override

    public void viajar(String ciudad) {
        System.out.println(nombre + " viaja a " + ciudad + ".");
    }

    @Override

    public void celebrarGol() {
        System.out.println(nombre + " celebra un gol.");
    }
}
````

- Posiciones
````
package org.example.Practica2;

/**
 * Enum que lista las deferentes posiciones que puede tener un jugador en un partido.
 * @author David Giner
 */
public enum Posiciones {

    PORTERO, DEFENSA, CENTROCAMPOSTA, DELANTERO
}

````
