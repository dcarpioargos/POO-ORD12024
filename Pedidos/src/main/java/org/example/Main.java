package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(25, new Date(),10.5,"Prueba");
        System.out.println(pedido);

        Cliente cliente = new Cliente();
        cliente.agregarPedido(pedido);
        /*pedido.solicitar();
        pedido.cancelarPedido();
        pedido.cancelarPedido();*/


    }
}