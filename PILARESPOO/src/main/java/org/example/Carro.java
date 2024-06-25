package org.example;

public class Carro {
    private String deunio;
// Constructor
    public Carro(String deunio){
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
