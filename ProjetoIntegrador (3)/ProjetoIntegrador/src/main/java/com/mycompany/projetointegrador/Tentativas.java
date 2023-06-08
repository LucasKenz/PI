
package com.mycompany.projetointegrador;


public class Tentativas {
    private String nome;
    private int pontos;

    public Tentativas() {
    }

    public Tentativas(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }   
}
