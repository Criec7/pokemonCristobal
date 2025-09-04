package model;

public class Controller {

    private Pokemon[] pokemons;

    public Controller(int nPokemons) {
        this.pokemons = new Pokemon[nPokemons];

    }

    public void addPokemon(int index, String nombre, String tipo, String habilidades) {
        if (index >= 0 && index < pokemons.length) {
            pokemons[index] = new Pokemon(nombre, tipo, habilidades);
        }

    }

    public Pokemon getPokemon(int index) {
        if (index >= 0 && index < pokemons.length) {
            return pokemons[index];
        }
        return null;
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }
}
