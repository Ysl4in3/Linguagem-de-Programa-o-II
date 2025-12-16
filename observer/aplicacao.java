/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer;

/**
 *
 * @author yslai
 */
package observer;

public class Aplicacao {

    public static void main(String[] args) {

        Produto produto = new Produto("Sorvete de Coco Queimado", 10.0f);

        Clientes clienteA = new Clientes();
        Clientes clienteB = new Clientes();

        produto.subscribe(clienteA);
        produto.subscribe(clienteB);

        produto.unsubscribe(clienteB);

        produto.mainBussnesLogic(true);
    }
}
