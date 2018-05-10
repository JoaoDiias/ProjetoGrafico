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
public class Nota {
  private String nome; 
  private String disciplina;
  private TipoAvalicao tipoAvaliacao; 

    public Nota(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public TipoAvalicao getTipoAvaliacao() {
        return tipoAvaliacao;
    }

    public void setTipoAvaliacao(TipoAvalicao tipoAvaliacao) {
        this.tipoAvaliacao = tipoAvaliacao;
    }

    private static class TipoAvalicao {

        public TipoAvalicao() {
        }
    }

    @Override
    public String toString() {
        return "Nota" + " \nNome = " + nome + " \nDisciplina= " + disciplina + " \nTipo de Avaliacao = " + tipoAvaliacao;
    }

      
  
}
