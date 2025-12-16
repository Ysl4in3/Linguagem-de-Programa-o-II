/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.constructor;

/**
 *
 * @author yslai
 */
package construtor_atv3;

class DiretorDeConstrucao {

    public void construirModeloUrbano(Montador montador) {
        montador.iniciar();
        montador.definirAssentos(4);
        montador.definirMotor("1.0 Flex");
    }

    public void construirModeloEsportivo(Montador montador) {
        montador.iniciar();
        montador.definirAssentos(2);
        montador.definirMotor("2.4 Turbo");
    }

    public void construirModeloSUV(Montador montador) {
        montador.iniciar();
        montador.definirAssentos(7);
        montador.definirMotor("3.0 V6");
    }

    public void construirModeloExecutivo(Montador montador) {
        montador.iniciar();
        montador.definirAssentos(4);
        montador.definirMotor("2.0 Premium");
        montador.definirGPS("GPS Integrado");
        montador.definirPainel("Painel Executivo");
    }
}
