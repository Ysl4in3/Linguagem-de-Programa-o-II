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

public class ClienteObserver implements Assinantes {

    @Override
    public void update(Produto produto) {
        if (produto.getPromocao() == 1) {
            System.out.println(
                "Produto em promoção! Novo preço: R$ " + produto.getPreco()
            );
        } else {
            System.out.println(
                "Preço atual do produto: R$ " + produto.getPreco()
            );
        }
    }
}
