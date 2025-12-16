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

interface ConstrutorVeiculo {

    void iniciar();
    void definirMotor(String tipoMotor);
    void definirGPS(String sistemaGPS);
    void definirPainel(String tipoPainel);
    void definirAssentos(int quantidadeAssentos);
    Veiculo obterResultado();
}

