package org.example;

public class Moto {
    private int tieneSidecar;
    public Moto(int tieneSidecar){
        this.tieneSidecar = tieneSidecar;

    }
    public void hacerCaballito(){
        System.out.println("hizo un caballito");
    }

    //GETTER Y SETTER
    public int getTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(int tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }
}
