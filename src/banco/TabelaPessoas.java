package banco;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TabelaPessoas {
	public static void main(String[] args) throws SQLException {
		Connection connection = Conexao.getConexao();
		
		String sql = "CREATE TABLE IF NOT EXISTS pessoas ("
				+ "id INT AUTO_INCREMENT PRIMARY KEY, "
				+ "name VARCHAR(80) NOT NULL"
				+ ");";
		
		Statement stmt = connection.createStatement();
		
		stmt.execute(sql);
		System.out.println("Tabela criada com sucesso");
		connection.close();
	}
}
