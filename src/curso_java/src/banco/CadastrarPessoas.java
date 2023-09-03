package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CadastrarPessoas {
	public static void main(String[] args) throws SQLException {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Informe o seu nome: ");
		String nome = read.nextLine();
		
		Connection connection = Conexao.getConexao();
		
		String sql = "INSERT INTO pessoas ("
				+ "name"
				+ ") "
				+ "VALUES (?);";
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, nome);
		
		stmt.execute();
		
		System.out.println("Pessoa incluida com sucesso!");
		
		read.close();
	}
}
