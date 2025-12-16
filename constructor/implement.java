/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constructor;

/**
 *
 * @author yslai
 */

package construtor_atv3;

class MontadorSUVFamiliar implements Montador {

    private Veiculo veiculo;

    public MontadorSUVFamiliar() {
        preparar();
    }

    @Override
    public void iniciar() {
        preparar();
    }

    private void preparar() {
        veiculo = new Veiculo();
        veiculo.setCategoria("Familiar SUV");
    }

    @Override
    public void definirMotor(String tipoMotor) {
        veiculo.setMotor(tipoMotor);
    }

    @Override
    public void definirGPS(String sistemaGPS) {
        veiculo.setGPS(sistemaGPS);
    }

    @Override
    public void definirPainel(String tipoPainel) {
        veiculo.setPainelDigital(tipoPainel);
    }

    @Override
    public void definirAssentos(int quantidade) {
        veiculo.setAssentos(quantidade);
    }

    @Override
    public Veiculo resultado() {
        return veiculo;
    }
}

