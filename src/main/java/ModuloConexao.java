import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ModuloConexao {

    // Método responsável por estabelecer a conexão com o banco de dados
    public static Connection conector() {
        Connection conexao = null;

        try {
            // Carregar o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelecer a conexão com o banco de dados
            String url = "jdbc:mysql://localhost:3306/Biblioteca";
            String user = "root";
            String password = "ribeiro";
            conexao = DriverManager.getConnection(url, user, password);

            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            // Tratar exceções, imprimir mensagem ou log, se necessário
            e.printStackTrace();
            return null; // Retorna null em caso de falha na conexão
        }
    }
}