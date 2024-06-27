package org.example;

import java.util.Date;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;

    //constructor
    public Vehiculo (String marca, String modelo, Integer anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    public void arrancar(String tipoVehiculo){
        System.out.println(tipoVehiculo + ": Arrancando");
    }

    public void detener (){
        System.out.println("el vehiculo se detuvo");
    }

    public void mostrarInfo(){
        System.out.println("MARCA: "+ this.marca + " MODELO: "+ this.modelo + " AÑO: "+ this.anio);
    }
    //GETTER Y SETTER

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
