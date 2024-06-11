package org.example;

import java.util.List;

public class Estudiante {
    //atributos
    //visibilidad  tipo_dato  nombre_variable;
    private int cedula = 15;
    private String nombres;
    private String apellidos;
    private int edad;
    private List<Integer> notas;

    //constructor
    public Estudiante(int dni){
        this.cedula = dni;
    }
    //url

    //public List<Horario> horario;
    //private List<List<Estudiante>> estudiante;
    // Estudiante estudiantex;

    //métodos = funcionalidad o acciones
    //cargar archivo
    //ver curso o materia al que pertenece
    //
    //

    public void obtenerDatos(){
        System.out.println("Cedula: " + getCedula() + " Nombre: " + getNombres());
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}







/*

public class Documents{

    private String[] authors;
    private Date date;


    public String[] getAuthors() {
        return authors;
    }
    public void addAuthor(String name){
        System.out.println(name);

    }
}
*/











