package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas_desafio {
	public static void main(String[] args) throws SQLException{
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite letra para diminuir a lista de nomes: ");
		String letra = read.nextLine();
		
		Connection connection = Conexao.getConexao();
		
		String sql = "SELECT * FROM pessoas WHERE name LIKE ?";
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, "%" + letra + "%");		

		ResultSet result = stmt.executeQuery();		
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(result.next()) {
			int cod = result.getInt("id");
			String nome = result.getString("name");
			
			pessoas.add(new Pessoa(cod, nome));
		}
		
		if(!pessoas.isEmpty()) {
			System.out.println("Esses são os resultados encontrados");
			
			for(Pessoa p: pessoas) {
				System.out.println(p.getCod() + ": " + p.getName());
			}
		}else {
			System.out.println("Nenhum resultado foi encontrado");
		}
		
		stmt.close();
		connection.close();
		
		read.close();
		
	}
}
