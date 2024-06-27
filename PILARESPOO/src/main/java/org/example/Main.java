package org.example;

public class Main {
    public static void main(String[] args) {

    Carro bmw = new Carro("JUAN", "BMW", "BMW X5 M", 2024);
    bmw.getDeunio();
    /*System.out.println(bmw);
    System.out.println(bmw.getDeunio());
    System.out.println(bmw.getMarca());*/

    Moto motoRivaldo = new Moto(true,"Pulsar", "Pulsar ABC", 2023);
    //System.out.println(motoRivaldo.getModelo());
        motoRivaldo.mostrarInfo();
        motoRivaldo.arrancar("Moto Rivaldo");

    Bicicleta bicicletaManuel = new Bicicleta ( 3, "honda", "casd", 2023);
       // System.out.println(bicicletaManuel.getMarca());
       // System.out.println(bicicletaManuel.getModelo());
        bicicletaManuel.mostrarInfo();
        bicicletaManuel.arrancar("Bicicleta Manuel");

    }
}




