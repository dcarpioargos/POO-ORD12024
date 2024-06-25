package org.example;

import java.util.Date;

public class Vehiculo {
    private String marca;
    private int modelo;
    private Date anio;

    //constructor
    public Vehiculo (String marca, int modelo, Date anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    public void arrancar(){
        System.out.println("El vehiculo arranco");
    }

    public void detener (){
        System.out.println("el vehiculo se detuvo");
    }

    public void mostrarInfo(){
        System.out.println("marca: "+ this.marca + "modelo:"+ this.modelo + "anio: "+ this.anio);
    }
    //GETTER Y SETTER

    public String getMarca(){
        return marca;
    }

    public int getModelo(){
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }

    public Date getAnio(){
        return anio;
    }
}
