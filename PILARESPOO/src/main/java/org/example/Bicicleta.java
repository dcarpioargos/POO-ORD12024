package org.example;

public class Bicicleta {
    private int numeroVelocidades;

    public Bicicleta(int numeroVelocidades){
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
