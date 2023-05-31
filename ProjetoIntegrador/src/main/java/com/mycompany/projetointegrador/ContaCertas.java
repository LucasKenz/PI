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
    
    public static int getContador() {
        return contador;
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
    
    // Para obter o valor do contador
    //int valor = ContaCertas.getContador();

    // Para incrementar o contador
    //ContaCertas.incrementarContador();

    // Para decrementar o contador
    //ContaCertas.decrementarContador();

    // Para reiniciar o contador
    //ContaCertas.reiniciarContador();
}

