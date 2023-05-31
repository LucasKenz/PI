package com.mycompany.projetointegrador;

import java.sql.ResultSet;

public class QuestaoDAO {
    public ResultSet existe(Questao q) throws Exception{
        //1, especificar o comando sql (select)
        String sql = "SELECT Pergunta FROM Questao";
        //2. abrir uma conexão com o banco
        //try-with-resources
        //3. preparar o comando
        try(var conexao = ConnectionFactory.obterConexao(); var ps = conexao.prepareStatement(sql)){
            //4. substituir os eventuais placeholders
            ps.setString(1, q.getPergunta());
            //5. executar o comando
            //try-with-resources
            try(var rs = ps.executeQuery()){
                //6. manipular os dados resultantes
                return rs;
            }
        }
        //7. fechar os recursos (try-with-resources já fez pra gente)
    }
    public ResultSet obterPerguntas()throws Exception{
        String sql = "select * from Questao";
        var conexao = ConnectionFactory.obterConexao();
        var ps = conexao.prepareStatement(sql);
        return ps.executeQuery();
    }
    
    public ResultSet obterQuestao(Questao p)throws Exception{
        String sql = "select * from Questao where id = ?";
        var conexao = ConnectionFactory.obterConexao();
        var ps = conexao.prepareStatement(sql);
        ps.setInt(1,p.getId());
        return ps.executeQuery();
    }
    
    void adicionarPergunta(Questao p) throws Exception{
        
        
        String sql = "insert into Questao (id, Pergunta, alternativa1, alternativa2, alternativa3, alternativa4, Resposta, Pontos) "
                + "values(?,?,?,?,?,?,?,?);";
        
        try(var conexao = ConnectionFactory.obterConexao();
                var ps = conexao.prepareStatement(sql)){
            ps.setInt(1, p.getId());
            ps.setString(2, p.getPergunta());
            ps.setString(3,p.getAlternativa1());
            ps.setString(4,p.getAlternativa2());
            ps.setString(5,p.getAlternativa3());
            ps.setString(6,p.getAlternativa4());
            ps.setString(7,p.getResposta());
            ps.setInt(8,p.getPontos());
            ps.execute();
        }
    }
        
    public void atualizarPergunta(Questao p){
        String sql = "update Questao set Pergunta = ?, alternativa1 = ?, alternativa2 = ?, alternativa3 = ?, alternativa4 = ?, Resposta = ?,"
                + "Pontos = ? where id = ?;";
        try(var conexao = ConnectionFactory.obterConexao();
                var ps = conexao.prepareStatement(sql)){
            ps.setString(1, p.getPergunta());
            ps.setString(2,p.getAlternativa1());
            ps.setString(3,p.getAlternativa2());
            ps.setString(4,p.getAlternativa3());
            ps.setString(5,p.getAlternativa4());
            ps.setString(6,p.getResposta());
            ps.setInt(7,p.getPontos());
            ps.setInt(8, p.getId());
            ps.execute();
        }catch(Exception e){
            
        }
    }
    
    public void removerPergunta(Questao p){
        String sql = "delete from Questao where id = ?";
        
        try(var conexao = ConnectionFactory.obterConexao();
                var ps = conexao.prepareStatement(sql)){
            ps.setInt(1, p.getId());
            ps.execute();
        }catch(Exception e){
            
        }
    }
}