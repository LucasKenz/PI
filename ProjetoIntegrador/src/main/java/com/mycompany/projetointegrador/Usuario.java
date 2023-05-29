
package com.mycompany.projetointegrador;

public class Usuario {
    private String email;
    private String senha;
    private String RA;
    private String nome;

    public Usuario() {
    }
    public Usuario(String email, String senha){
        this.email = email;
        this.senha = senha;
    }
    
    public Usuario(String nome, String RA, String email, String senha) {
        this.nome = nome;
        this.RA = RA;
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
