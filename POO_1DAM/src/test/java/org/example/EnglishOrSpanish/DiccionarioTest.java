package org.example.EnglishOrSpanish;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



class DiccionarioTest {

    static Diccionario diccionario = new Diccionario();
    static final String español = "Lampara";
    static final String ingles = "Lamp";

    @BeforeEach

    public void insertarPalabras() {

        diccionario.nuevoPar(español, ingles);

        assertTrue(diccionario.getMapita().containsKey(español));
        assertTrue(diccionario.getMapita().containsValue(ingles));
    }

    @Test

    public void nuevoParTest() {

        String palabra1 = "Coche";
        String palabra2 = "Car";

        diccionario.nuevoPar(palabra1, palabra2);

        assertEquals(palabra2, diccionario.getMapita().get(palabra1));
    }

    @Test

    public void palabraAleatoriaTest() {

        assertTrue(diccionario.getMapita().containsKey(diccionario.palabraAleatoria()));
    }

    @Test

    public void traduceTest() {

        String palabra1 = "Avion";
        String palabra2 = "Airplane";

        diccionario.nuevoPar(palabra1, palabra2);

        assertEquals(palabra2, diccionario.traduce(palabra1));
    }

    @Test

    public void primeraLetraTraduccionTest() {

        String palabra = "Constructor";
        String traducido = "Builder";

        diccionario.nuevoPar(palabra, traducido);

        assertEquals("B", diccionario.primeraLetraTraduccion(palabra));
    }

}