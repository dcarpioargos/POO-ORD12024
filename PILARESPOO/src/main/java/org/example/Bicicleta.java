package org.example;

public class Bicicleta extends Vehiculo{
    private int numeroVelocidades;

    public Bicicleta(int numeroVelocidades, String marca, String modelo, Integer anio){
        super(marca, modelo, anio);
        this.numeroVelocidades= numeroVelocidades;
    }
     public void tocarTimbre(){
        System.out.println("tocarTimbre");

    }

    //GETTER Y SETTER
    public int getNumeroVelocidades() {
        return numeroVelocidades;
    }

    public void setNumeroVelocidades(int numeroVelocidades) {
        this.numeroVelocidades = numeroVelocidades;
    }
}
