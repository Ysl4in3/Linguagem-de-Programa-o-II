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

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private List<Assinantes> observadores;
    private float precoBase;
    private float precoVigente;
    private int emPromocao;
    private String descricao;

    public Produto(String descricao, float precoInicial) {
        this.descricao = descricao;
        this.precoBase = precoInicial;
        this.precoVigente = precoInicial;
        this.emPromocao = 0;
        this.observadores = new ArrayList<>();
    }

    public void subscribe(Assinantes assinante) {
        observadores.add(assinante);
    }

    public void unsubscribe(Assinantes assinante) {
        observadores.remove(assinante);
    }

    private void notificar() {
        for (Assinantes obs : observadores) {
            obs.update(this);
        }
    }

    public void aplicarPromocao(boolean blackFraude) {

        if (blackFraude) {
            precoVigente = precoBase * 0.5f;
            emPromocao = 1;
        } else {
            precoVigente = precoBase;
            emPromocao = 0;
        }

        notificar();
    }

    public float getPreco() {
        return precoVigente;
    }

    public float getPromocao() {
        return emPromocao;
    }

    public String getNome() {
        return descricao;
    }
}
