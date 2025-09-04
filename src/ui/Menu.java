package ui;

import java.util.Scanner;
import model.Controller;

public class Menu {

    private Controller controller;
    private Scanner sc;

    public Menu() {
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {

        Menu main = new Menu();
        main.iterationn();

    }

    public void iterationn() {
        System.out.println("ingrese la cantidad de pokemones");
        int in = Integer.parseInt(sc.nextLine());
        controller = new Controller(in);

        for (int i = 0; i < in; i++) {
            System.out.println("ingrese el nombre del pokemon  " + (i + 1));
            String nombre = sc.nextLine();
            System.out.println("ingrese el   tipo del pokemon  " + (i + 1));
            String tipo = sc.nextLine();

            System.out.println("ingrese la habilidad del pokemon  " + (i + 1));
            String habilidad = sc.nextLine();
            controller.addPokemon(i, tipo, habilidad, nombre);
        }

        for (int i = 0; i < controller.getPokemons().length; i++) {
            System.out.println("pokemon: " + controller.getPokemon(i).getNombre() + ", tipo: " + controller.getPokemon(i).getType() + ", habilidad: " + controller.getPokemon(i).getHabilidad());
        }
        sc.close();
    }

}
