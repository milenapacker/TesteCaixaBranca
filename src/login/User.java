package login; // Pacote responsável por gerenciar login de usuários

import java.sql.Connection; // Conexão com o banco de dados
import java.sql.DriverManager; // Gerenciamento do driver JDBC
import java.sql.ResultSet; // Manipulação dos resultados das consultas SQL
import java.sql.Statement; // Execução de instruções SQL

/**
 * Classe responsável por realizar operações de login no sistema.
 * - Conexão com o banco de dados.
 * - Verificação de credenciais do usuário.
 */
public class User {

    /**
     * Método que estabelece a conexão com o banco de dados MySQL.
     * @return Objeto Connection para realizar operações no banco de dados.
     */
    public Connection conectarBD() {
        Connection conn = null; // Inicializa a conexão como nula
        try {
            // Carregar o driver JDBC do MySQL
            Class.forName("com.mysql.Driver").newInstance();

            // URL de conexão com credenciais
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";

            // Estabelece a conexão com o banco
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Tratamento de exceção em caso de erro na conexão
            e.printStackTrace();
        }
        return conn; // Retorna a conexão (ou null em caso de erro)
    }

    // Declaração de variáveis públicas
    public String nome = ""; // Nome do usuário
    public boolean result = false; // Resultado da verificação do login

    /**
     * Método que verifica se as credenciais do usuário são válidas.
     * @param login Login do usuário.
     * @param senha Senha do usuário.
     * @return True se o usuário for encontrado, False caso contrário.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = ""; // Query SQL inicializada como vazia
        Connection conn = conectarBD(); // Conectar ao banco de dados

        try {
            // Monta a query SQL
            sql += "select nome from usuarios ";
            sql += "where login = '" + login + "' ";
            sql += "and senha = '" + senha + "';";

            // Executa a query no banco de dados
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            // Verifica se o resultado contém algum registro
            if (rs.next()) {
                result = true; // Usuário encontrado
                nome = rs.getString("nome"); // Obtém o nome do usuário
            }
        } catch (Exception e) {
            // Tratamento de exceção em caso de erro na execução da query
            e.printStackTrace();
        }
        return result; // Retorna o resultado da verificação
    }
}
