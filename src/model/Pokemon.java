package model;

public class Pokemon {

    private String tipo;
    private String habilidad;
    private int numero;
    private String nombre;

    public Pokemon(String tipo, String habilidad, int numero, String nombre) {

        this.tipo = tipo;
        this.habilidad = habilidad;
        this.numero = numero;
        this.nombre = nombre;
    }

    public String getType() {

        return tipo;

    }

    public void setType(String tipo) {
        this.tipo = tipo;

    }

    public String getHabilidad() {

        return habilidad;

    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;

    }

    public int getNumero() {

        return numero;

    }

    public void setNumero(int numero) {
        this.numero = numero;

    }

}
