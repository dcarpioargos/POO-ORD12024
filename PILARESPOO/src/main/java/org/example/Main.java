package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

    Carro bmw = new Carro("JUAN", "BMW", "BMW X5 M", 2024);
    //bmw.getDeunio();
    /*System.out.println(bmw);
    System.out.println(bmw.getDeunio());
    System.out.println(bmw.getMarca());*/

    Moto motoRivaldo = new Moto(true,"Pulsar", "Pulsar ABC", 2023);
    //System.out.println(motoRivaldo.getModelo());
        motoRivaldo.mostrarInfo();
        motoRivaldo.arrancar("Moto Rivaldo");
        motoRivaldo.tieneSideCar();
    Moto motoChristian = new Moto(false,"honda", "Honda 125 T", 2024);
        motoChristian.mostrarInfo();
        motoChristian.arrancar("Moto Christian");
        motoChristian.tieneSideCar();

    Bicicleta bicicletaManuel = new Bicicleta ( 2, "honda", "casd", 2023,10000);
       // System.out.println(bicicletaManuel.getMarca());
       // System.out.println(bicicletaManuel.getModelo());


        bicicletaManuel.mostrarInfo();
       // bicicletaManuel.arrancar("Bicicleta Manuel");


        List<City> CITY_INPUT = Arrays.asList(
                new City("New York City", "USA"),
                new City("Shanghai", "China"),
                new City("Hamburg", "Germany"),
                new City("Paris", "France"),
                new City("Paris", "Texas, USA"));

        for ( City city : CITY_INPUT) {
            System.out.println(city.getName() + " " + city.getCountry());
        }







    }
}




