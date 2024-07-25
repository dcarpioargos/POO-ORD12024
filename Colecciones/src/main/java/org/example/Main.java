package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> alumnos = new ArrayList<>();

        Persona alumno_1 = new Persona("Pedro", 25);
        Persona alumno_2 = new Persona("Maria", 32);
        alumnos.add(alumno_1);
        alumnos.add(alumno_2);
        for (Persona persona : alumnos) {
            System.out.println(persona.getNombre());
            System.out.println(persona.getEdad());
        }

    }
}