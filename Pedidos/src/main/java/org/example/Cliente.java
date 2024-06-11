package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correo;
    private int edad;
    private List<Pedido>pedidos;
    /*private List<Integer> numeros;

    public void listarNumeros(){
        this.numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(4);
        numeros.add(6);
        System.out.println(numeros);
    }*/

    //métodos
    public void  agregarPedido(Pedido pedido){
        System.out.println("Agregar el pedido..." + pedido) ;

    }

    public void eliminarPedido(Pedido pedido){
        System.out.println("Se procede a eliminar el pedido...");

    }

    public void actualizarDatos(){
        System.out.println("Se procede a actualizar el pedido...");

    }

    public void verHistorial(){
        System.out.println("Se mostrar el Historial del pedido...");

    }


}
