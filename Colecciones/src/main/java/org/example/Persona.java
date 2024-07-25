package org.example;

public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombreC, int edadC) {
        this.nombre = nombreC;
        this.edad = edadC;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
