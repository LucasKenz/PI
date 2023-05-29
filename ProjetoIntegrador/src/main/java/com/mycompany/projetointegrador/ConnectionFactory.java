
package com.mycompany.projetointegrador;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "db_teste123";
    private static String usuario = "root";
    private static String senha = "MySQLGabs@IMT";
    
    public static Connection obterConexao()throws Exception{
        String s = String.format(
                "jdbc:mysql://%s:%s/%s",
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
