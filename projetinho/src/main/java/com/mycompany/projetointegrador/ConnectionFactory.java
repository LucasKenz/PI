
package com.mycompany.projetointegrador;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
    private static String host = "ep-holy-sky-566692.eu-central-1.aws.neon.tech";
    private static String porta = "5432";
    private static String db = "neondb";
    private static String usuario = "LucasKenz";
    private static String senha = "TmRWAohH9qe6";
    
    public static Connection obterConexao()throws Exception{
        String s = String.format(
                "jdbc:postgresql://%s:%s/%s",
                host, porta, db
        );
        //clausula catch or declare
        return DriverManager.getConnection(
                s, usuario, senha
        );
    }
    public static void main(String[] args)throws Exception{
        obterConexao();
    }
}
