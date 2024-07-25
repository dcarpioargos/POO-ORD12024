package org.example;

// public class Perro extends Animal { asi se se hereda
public class Perro implements Animal {
    @Override
    public void hacerRuido(){
        System.out.println("Grrrrrrrrrr!");
    }
    @Override
    public void caminar(){
        System.out.println("El perro está caminando");
    }
    @Override
    public String tipoAnimal(String tipo){
        return "Es de tipo: " + tipo;
    }

}











