/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetointegrador;

/**
 *
 * @author felip_000
 */
public class ContaCertas {
    private static int contador = 0;
    private static int pontuacao = 0;
    private static int pontos = 0;
    
    public static int getContador() {
        return contador;
    }
    
    public static int getPontuacao() {
        return pontuacao;
    }
    
    public static void incrementarContador() {
        contador++;
    }
    
    public static void decrementarContador() {
        contador--;
    }
    
    public static void reiniciarContador() {
        contador = 0;
    }
    
    public static int incrementarPontuacao(int pontos) {
        pontuacao = pontuacao + pontos;
        return pontuacao;
    }
    
    public static int decrementarPontuacao(int pontos) {
        pontuacao = pontuacao - pontos;
        return pontuacao;
    }
    
    public static void reiniciarPontuacao() {
        pontuacao = 0;
    }
    
    // Para obter o valor do contador
    //int valor = ContaCertas.getContador();
    //int valor = ContaCertas.getPontuacao();

    // Para incrementar o contador
    //ContaCertas.incrementarContador();
    //ContaCertas.incrementarPontuacao();

    // Para decrementar o contador
    //ContaCertas.decrementarContador();
    //ContaCertas.decrementarPontuacao();

    // Para reiniciar o contador
    //ContaCertas.reiniciarContador();
    //ContaCertas.reiniciarPontuacao();
}

