/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adapter;

/**
 *
 * @author yslai
 */
package adapter;

public class AberturaCircular {

    private int raio;

    public AberturaCircular(int raio) {
        this.raio = raio;
    }

    public int getRaio() {
        return raio;
    }

    public boolean podeEncaixar(Cilindro cilindro) {
        return cilindro.obterRaio() <= this.raio;
    }
}
