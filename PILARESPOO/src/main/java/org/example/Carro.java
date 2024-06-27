package org.example;

public class Carro extends Vehiculo {
    private String deunio;
// Constructor
    public Carro(String deunio, String marca, String modelo, Integer anio){
        super(marca, modelo, anio);
        this.deunio = deunio;
    }
    public void encenderAireAcondicionado(){
        System.out.println("Encender Aire Acondicionado");
    }

    //GETTER Y SETTER

    public String getDeunio() {
        return deunio;
    }

    public void setDeunio(String deunio) {
        this.deunio = deunio;
    }
}
