/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proxy;

/**
 *
 * @author yslai
 */
package Proxy;

public class Cliente {

    public static void main(String[] args) {

        ServicoInterface servicoBase = new ServicoReal();

        System.out.println("Tentativa com usuário comum:");
        ServicoInterface acessoUsuario = new ServicoProxy(servicoBase, "usuario");
        acessoUsuario.executar();

        System.out.println();

        System.out.println("Tentativa com admin:");
        ServicoInterface acessoAdministrador = new ServicoProxy(servicoBase, "admin");
        acessoAdministrador.executar();
    }
}

