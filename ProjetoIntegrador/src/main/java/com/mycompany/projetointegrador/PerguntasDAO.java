
package com.mycompany.projetointegrador;



import java.sql.ResultSet;


public class PerguntasDAO {
    void adicionarPergunta(Perguntas p) throws Exception{
        
        
        String sql = "insert into Questao (Pergunta, alternativa1, alternativa2, alternativa3, alternativa4, Resposta, Pontos) "
                + "values(?,?,?,?,?,?,?);";
        
        try(var conexao = ConnectionFactory.obterConexao();
                var ps = conexao.prepareStatement(sql)){
            ps.setString(1, p.getEnunciado());
            ps.setString(2,p.getAlternativa1());
            ps.setString(3,p.getAlternativa2());
            ps.setString(4,p.getAlternativa3());
            ps.setString(5,p.getAlternativa4());
            ps.setString(6,p.getRespostaCorreta());
            ps.setString(7,p.getPontos());
            ps.execute();
        }
        
    }
    
    public ResultSet obterPerguntas(){
        String sql = "select * from Questao";
        try{
            var conexao = ConnectionFactory.obterConexao();
            var ps = conexao.prepareStatement(sql);
            var rs = ps.executeQuery();
            conexao.close();
            return rs;
        }catch(Exception e){
        }
        return null;
    }
    public void atualizarPergunta(Perguntas p){
        String sql = "update Questao set Pergunta = ?, alternativa1 = ?, alternativa2 = ?, alternativa3 = ?, alternativa4 = ?, Resposta = ?,"
                + "Pontos = ? where id = ?;";
        try(var conexao = ConnectionFactory.obterConexao();
                var ps = conexao.prepareStatement(sql)){
            ps.setString(1, p.getEnunciado());
            ps.setString(2,p.getAlternativa1());
            ps.setString(3,p.getAlternativa2());
            ps.setString(4,p.getAlternativa3());
            ps.setString(5,p.getAlternativa4());
            ps.setString(6,p.getRespostaCorreta());
            ps.setString(7,p.getPontos());
            ps.setString(8, p.getIdPergunta());
            ps.execute();
        }catch(Exception e){
            
        }
    }
    
    public void removerPergunta(Perguntas p){
        String sql = "delete from Questao where id = ?";
        
        try(var conexao = ConnectionFactory.obterConexao();
                var ps = conexao.prepareStatement(sql)){
            ps.setString(1, p.getIdPergunta());
            ps.execute();
        }catch(Exception e){
            
        }
    }
    
}
