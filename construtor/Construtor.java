/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.construtor;

/**
 *
 * @author yslai
 */
package construtor;

import java.util.ArrayList;
import java.util.List;

public class CadastroFesta {

    private static CadastroFesta instancia;

    private List<Pessoa> listaConvidados;

    private CadastroFesta() {
        listaConvidados = new ArrayList<>();
        carregarConvidados();
    }

    public static CadastroFesta obterInstancia() {
        if (instancia == null) {
            instancia = new CadastroFesta();
        }
        return instancia;
    }

    private void carregarConvidados() {
        listaConvidados.add(new Pessoa("Luiz"));
        listaConvidados.add(new Pessoa("José"));
        listaConvidados.add(new Pessoa("Maria"));
        listaConvidados.add(new Pessoa("João"));
    }

    public void mostrarConvidados() {
        System.out.println("== CONVIDADOS DA FESTA ==");
        for (Pessoa pessoa : listaConvidados) {
            System.out.println("- " + pessoa.getNome());
        }
    }
}
