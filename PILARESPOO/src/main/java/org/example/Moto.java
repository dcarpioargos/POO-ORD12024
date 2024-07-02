package org.example;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;
    private int valorMoto;

    public Moto(boolean tieneSidecar,String marca, String modelo, Integer anio){
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
        this.valorMoto = 10000;
    }
    public boolean tieneSideCar(){
        //IF - VALIDAR SI TIENE SIDE CAR // SI ES VERDADERO EL VALOR DEBE SER 10.000 + 1500(15% DE 10000)
           // DEBE RTORNAR UN TRUE
        //ELSE O CASO CONTRARIO
          // DEVULVE O NO HACE NADA //DEBE RETORNAR UN FALSE
       //if(this.tieneSidecar == true){
       if(this.tieneSidecar){
           //this.valorMoto = (int)((this.valorMoto * 0.15) + this.valorMoto);
           // this.valorMoto = ((int)((this.valorMoto * 15) / 100) + this.valorMoto);
           this.valorMoto = (int)(this.valorMoto * 1.15);
           System.out.println("Valor moto con Sidecar: " +this.valorMoto);
           return true;
       }else{
           System.out.println("Valor moto sin Sidecar: " +this.valorMoto);
           return false;
       }
    }
    public void arrancar(String tipoVehiculo){
        System.out.println(tipoVehiculo + ": Arrancando");
    }
    public void hacerCaballito(){
        System.out.println("hizo un caballito");
    }

    // Método para calcular el precio


    //GETTER Y SETTER
    public boolean getTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }
}
