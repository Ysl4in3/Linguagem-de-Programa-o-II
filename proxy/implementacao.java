/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proxy;

/**
 *
 * @author yslai
 */
package Proxy;

public class ServicoProxy implements ServicoInterface {

    private ServicoReal servicoOriginal;

    public ServicoProxy(ServicoReal servicoOriginal) {
        this.servicoOriginal = servicoOriginal;
    }

    private boolean checarPermissao() {
        System.out.println("Proxy: conferindo autorização de acesso...");
        return true;
    }

    @Override
    public void executar() {
        if (checarPermissao()) {
            System.out.println("Proxy: permissão concedida. Executando serviço real...");
            servicoOriginal.executar();
        } else {
            System.out.println("Proxy: permissão recusada!");
        }
    }
}

