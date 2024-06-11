package org.example;

public class Libro {
    private String titulo;
    private String autor;
    private int cantidadDeLibros;
    private int cantidadDeLibrosPrestados;

    public Libro(String tituloC, String autorC, int cantidadDeLibrosC, int cantidadDeLibrosPrestadosC){
        this.titulo=tituloC;
        this.autor=autorC;
        this.cantidadDeLibros=cantidadDeLibrosC;
        this.cantidadDeLibrosPrestados=cantidadDeLibrosPrestadosC;
    }

    public boolean prestamo(){
        if(this.cantidadDeLibrosPrestados < this.cantidadDeLibros){
            cantidadDeLibrosPrestados ++;
            return  true;
        }

        return false;

    }

    public void Devolucion(){
        this.autor = "Devolviendo";
        System.out.println("Se ha devuelto el libro del autor");




    }


















    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
         this.titulo=titulo;
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidadDeLibros() {
        return cantidadDeLibros;
    }

    public void setCantidadDeLibros(int cantidadDeLibros) {
        this.cantidadDeLibros = cantidadDeLibros;
    }

    public int getCantidadDeLibrosPrestados() {
        return cantidadDeLibrosPrestados;
    }

    public void setCantidadDeLibrosPrestados(int cantidadDeLibrosPrestados) {
        this.cantidadDeLibrosPrestados = cantidadDeLibrosPrestados;
    }
}
