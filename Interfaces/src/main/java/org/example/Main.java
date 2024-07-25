package org.example;

public class Main {
    public static void main(String[] args) {
        Perro tobby = new Perro();
        tobby.hacerRuido();
        tobby.caminar();
        System.out.println(tobby.tipoAnimal("Perro Adulto"));

        Perro firulais = new Perro();
        firulais.caminar();
        System.out.println(firulais.tipoAnimal("Perro cachorro"));


        Gato garfield = new Gato();
        garfield.hacerRuido();
        garfield.caminar();
        System.out.println(garfield.tipoAnimal("Persa"));

    }
}