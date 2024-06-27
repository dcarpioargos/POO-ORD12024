package org.example;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;
    public Moto(boolean tieneSidecar,String marca, String modelo, Integer anio){
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }
    public void hacerCaballito(){
        System.out.println("hizo un caballito");
    }

    //GETTER Y SETTER
    public boolean getTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }
}
