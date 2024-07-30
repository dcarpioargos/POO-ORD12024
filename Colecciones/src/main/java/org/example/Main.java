package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*HashMap<Integer, String> nombres = new HashMap<>();
        nombres.put(1, "Pedro");
        nombres.put(11, "20");

        nombres.put(2, "Maria");
        nombres.put(22, "32");

        nombres.add("Pedro edad: 20; genero: H; fecha de nacimiento: 01/01/2000");
        nombres.add("Maria");



        List<Persona> alumnos = new ArrayList<>();

        Persona alumno_1 = new Persona("Pedro", 25);
        Persona alumno_2 = new Persona("Maria", 32);
        alumnos.add(alumno_1);
        alumnos.add(alumno_2);


        List<String> nombres = new ArrayList<>();
        nombres.add("Maria");
        nombres.add("Juan");
        nombres.add("9799");*/



        List<Persona> profesor = new ArrayList<>();

        Persona daniel = new Persona("Daniel", 25);
       // System.out.println(daniel.getNombre());
        daniel.setEdad(30);
        Persona pedro = new Persona("Pedro", 50);
        Persona carlos = new Persona("Carlos", 40);

        profesor.add(daniel);
        profesor.add(pedro);
        profesor.add(carlos);

        for (Persona prof : profesor) {
            if( prof.getEdad() == 50) {
                System.out.println(prof.getNombre() + " - " + prof.getEdad());
            }
        }


    }
}