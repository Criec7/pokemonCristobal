package model;

public class Pokemon {

    private String tipo;
    private String habilidad;
    private int numero;

    public Pokemon(String tipo, String habilidad, int numero) {

        this.tipo = tipo;
        this.habilidad = habilidad;
        this.numero = numero;

    }

    public String getType() {

        return tipo;

    }

    public void setType(String tipo) {
        this.tipo = tipo;

    }

}
