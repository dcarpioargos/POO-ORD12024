package org.example;

import java.awt.image.PackedColorModel;

public class Bicicleta extends Vehiculo{
    private int numeroVelocidades;
    private double ValorBicicleta;

    private double Descuento;

    private double totalConDescuento;

    public Bicicleta(Integer numeroVelocidades, String marca, String modelo, Integer anio, Integer valorBicicleta){
        super(marca, modelo, anio);
        this.numeroVelocidades = numeroVelocidades;
        this.ValorBicicleta = valorBicicleta;

    }
     public void tocarTimbre(){
        System.out.println("tocarTimbre");

    }
public boolean numeroDeVelocidades(){
        if (this.numeroVelocidades >= 3){
            this.Descuento = this.ValorBicicleta * 0.1;
            this.totalConDescuento = this.ValorBicicleta - this.Descuento;
            this.ValorBicicleta = this.totalConDescuento;
            System.out.println("El valor de la bicicleta con descuento" + this.ValorBicicleta);
            return true;
        }else {
            return false;
        }




}
    //GETTER Y SETTER
    public int getNumeroVelocidades() {
        return numeroVelocidades;
    }

    public void setNumeroVelocidades(int numeroVelocidades) {
        this.numeroVelocidades = numeroVelocidades;
    }
}
