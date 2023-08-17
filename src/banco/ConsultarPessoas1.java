package banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {
	public static void main(String[] args) throws SQLException {
		Connection connection = Conexao.getConexao();
		
		String sql = "SELECT * FROM pessoas";
		Statement stmt = connection.createStatement();
		ResultSet result = stmt.executeQuery(sql);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(result.next()) {
			int cod = result.getInt("id");
			String name = result.getString("name");
			
			pessoas.add(new Pessoa(cod, name));
		}
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getCod() + ": " + p.getName());
		}
		
		stmt.close();
		connection.close();
	}
}
