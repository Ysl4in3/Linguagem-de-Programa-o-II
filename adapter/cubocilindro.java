/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author yslai
 */
package adapter;

public class AdaptadorCuboCilindrico extends Cilindro {

    private Cubo cuboAdaptado;

    public AdaptadorCuboCilindrico(Cubo cubo) {
        this.cuboAdaptado = cubo;
    }

    @Override
    public int obterRaio() {
        // raio equivalente calculado a partir da diagonal do cubo
        double diagonalCubo = cuboAdaptado.obterLado() * Math.sqrt(2);
        return (int) (diagonalCubo / 2);
    }
}

