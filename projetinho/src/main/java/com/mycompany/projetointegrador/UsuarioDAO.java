
package com.mycompany.projetointegrador;

import java.sql.SQLException;


public class UsuarioDAO {
    public boolean existe(Usuario u)throws SQLException, Exception{
        String sql = "SELECT email, senha from Usuario WHERE email=? AND senha=?";
        try(var conexao = ConnectionFactory.obterConexao();
                var ps = conexao.prepareStatement(sql)){
                ps.setString(1, u.getEmail());
                ps.setString(2, u.getSenha());
                try(var rs = ps.executeQuery()){
                    return rs.next();
            }
        }
    }
    void cadastrar(Usuario u) throws Exception{
        String sql = "INSERT into Usuario(nome, RA, email, senha) VALUES (?, ?, ?, ?)";
        try(var conexao = ConnectionFactory.obterConexao();
                var ps = conexao.prepareStatement(sql)){
                ps.setString(1, u.getNome());
                ps.setString(2, u.getRA());
                ps.setString(3, u.getEmail());
                ps.setString(4, u.getSenha());
                ps.executeUpdate(); // Usa-se ao inves do updateQuery pois trata-se de um comando insert
            }
        }
    }

