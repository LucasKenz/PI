
package com.mycompany.projetointegrador;

import java.sql.ResultSet;


public class TentativasDAO {
    public void adicionarTentativa(Tentativas t)throws Exception{
        String sql = "insert into Tentativas (nome, pontos_total) values (?,?);";
        
        try(var conexao = ConnectionFactory.obterConexao();
                var ps = conexao.prepareStatement(sql)){
            ps.setString(1, t.getNome());
            ps.setInt(2, t.getPontos());
            ps.execute();
        }
    }
    public ResultSet obterTentativas()throws Exception{
        String sql = "select * from Tentativas;";
        var conexao = ConnectionFactory.obterConexao();
        var ps = conexao.prepareStatement(sql);
        
        return ps.executeQuery();
    }
}
