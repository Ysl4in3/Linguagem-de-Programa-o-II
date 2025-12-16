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

public class ImplementacaoServico implements ServicoInterface {

    @Override
    public void executar() {
        System.out.println("Serviço Real: operação em execução...");
    }
}

