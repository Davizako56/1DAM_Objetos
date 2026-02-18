package org.example.Enum;

public enum Semaforo {

    AMARILLO, ROJO, VERDE;

    public Semaforo siguiente() {

        if (ordinal() == 0) {
            return ROJO;
        }else if (ordinal() == 1) {
            return VERDE;
        }else{
            return AMARILLO;
        }
    }

    public void setColor(Semaforo sem) {

    }
}
