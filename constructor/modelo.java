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

class MontadorUrbanoBasico implements Montador {

    private Veiculo carro;

    public MontadorUrbanoBasico() {
        inicializarVeiculo();
    }

    @Override
    public void iniciar() {
        inicializarVeiculo();
    }

    private void inicializarVeiculo() {
        carro = new Veiculo();
        carro.setCategoria("Urbano");
    }

    @Override
    public void definirMotor(String motor) {
        carro.setMotor(motor);
    }

    @Override
    public void definirGPS(String gps) {
        carro.setGPS(gps);
    }

    @Override
    public void definirPainel(String painel) {
        carro.setPainelDigital(painel);
    }

    @Override
    public void definirAssentos(int assentos) {
        carro.setAssentos(assentos);
    }

    @Override
    public Veiculo resultado() {
        return carro;
    }
}

