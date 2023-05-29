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
}
