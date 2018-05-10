/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joao.objeto;

/**
 *
 * @author SATC
 */
public enum TipoAvaliacao {
    PROVA ("PROVA"),
    TRABALHO ("TRABALHO"),
    SEMINARIO ("SEMINARIO");
    
    private String nome;

    private TipoAvaliacao(String nome) {
        this.nome = nome;
    }
    
}
