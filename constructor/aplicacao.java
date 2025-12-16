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

public class Aplicacao {

    public static void main(String[] args) {

        GerenteDeMontagem gerente = new GerenteDeMontagem();

        System.out.println("\n--- MODELO URBANO ---");
        MontadorUrbano montadorUrbano = new MontadorUrbano();
        gerente.montarUrbano(montadorUrbano);
        System.out.println(montadorUrbano.resultado());

        System.out.println("\n--- MODELO ESPORTIVO ---");
        MontadorEsportivo montadorEsportivo = new MontadorEsportivo();
        gerente.montarEsportivo(montadorEsportivo);
        System.out.println(montadorEsportivo.resultado());

        System.out.println("\n--- MODELO SUV ---");
        MontadorFamiliar montadorSUV = new MontadorFamiliar();
        gerente.montarSUV(montadorSUV);
        System.out.println(montadorSUV.resultado());

        System.out.println("\n--- MODELO EXECUTIVO ---");
        MontadorExecutivo montadorExecutivo = new MontadorExecutivo();
        gerente.montarExecutivo(montadorExecutivo);
        System.out.println(montadorExecutivo.resultado());

        System.out.println("\n--- MODELO PERSONALIZADO ---");
        MontadorUrbano personalizado = new MontadorUrbano();
        personalizado.iniciar();
        personalizado.definirAssentos(5);
        personalizado.definirMotor("1.8 Turbo");
        personalizado.definirPainel("Painel Touch");
        personalizado.definirGPS("GPS Avançado");
        System.out.println(personalizado.resultado());
    }
}
