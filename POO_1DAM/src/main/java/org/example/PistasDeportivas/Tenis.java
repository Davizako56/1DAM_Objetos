package org.example.PistasDeportivas;

public class Tenis extends Pista{

    private String superficie;

    public Tenis(int id, String techado, String superficie) {

        super(id, techado);
        this.superficie = superficie;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    @Override

    public String toString() {

        return "[id = " + getId() + ", techado = " + getTechado() + ", superficie = " + superficie + "]";
    }
}
