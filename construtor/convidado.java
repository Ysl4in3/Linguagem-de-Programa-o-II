/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.construtor;

/**
 *
 * @author yslai
 */
package construtor;

public class Convidado {

    private String nomeCompleto;

    public Convidado(String nome) {
        this.nomeCompleto = nome;
    }

    public String obterNome() {
        return nomeCompleto;
    }
}
