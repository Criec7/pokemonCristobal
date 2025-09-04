package model;

public class Pokemon {

    private String tipo;
    private String habilidad;
    private String nombre;

    public Pokemon(String tipo, String habilidad, String nombre) {

        this.tipo = tipo;
        this.habilidad = habilidad;
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

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }
}
