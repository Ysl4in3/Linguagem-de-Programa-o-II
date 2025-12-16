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

// ServicoProxy.java
public class ProxyAcesso implements ServicoInterface {

    private ServicoInterface servicoProtegido;
    private String perfilUsuario;

    public ProxyAcesso(ServicoInterface servico) {
        this.servicoProtegido = servico;
        this.perfilUsuario = "convidado";
    }

    public ProxyAcesso(ServicoInterface servico, String perfil) {
        this.servicoProtegido = servico;
        this.perfilUsuario = perfil;
    }

    private boolean possuiPermissao() {
        System.out.println("Proxy: checando permissões para o usuário '" + perfilUsuario + "'...");

        return "admin".equalsIgnoreCase(perfilUsuario);
    }

    @Override
    public void executar() {
        if (possuiPermissao()) {
            System.out.println("Proxy: permissão confirmada. Executando serviço real...");
            servicoProtegido.executar();
        } else {
            System.out.println("Proxy: permissão negada. Ação cancelada.");
        }
    }
}
