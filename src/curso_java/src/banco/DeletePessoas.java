package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletePessoas {
	public static void main(String[] args) throws SQLException{
		Scanner read = new Scanner(System.in);
		int cod;
		boolean end = false;
		
		
		while(end != true) {
			
			try {
				System.out.println("Digite o Valor 0 para que o programa seja encerrado!!!");
				System.out.print("Digite o c�digo de usu�rio, o qual deseja excluir: ");

				if(read.hasNextInt()) {
					cod = read.nextInt();
					
					if(cod == 0) {
						end = true;
						System.out.println("\nPrograma encerrado com sucesso!!!!!");
						
						break;
					}
					
					Connection connection = Conexao.getConexao();
					
					String sql = "SELECT * FROM pessoas WHERE id = ?";
					PreparedStatement stmt = connection.prepareStatement(sql);
					stmt.setInt(1, cod);
					
					ResultSet result = stmt.executeQuery();
							
					if(result.next()) {
						int codId = result.getInt("id");
						String nome = result.getString("name");
						
						Pessoa pessoas = new Pessoa(codId, nome);
						
						char answer;
						
						System.out.println("Esse � o resultado encontrado");						
						System.out.println("Usu�rio atual: " + pessoas.getName());
						
						
						System.out.print("Deseja excluir esse usu�rio? ");
						answer = read.next().charAt(0);
						
						if(answer == 'Y' || answer == 'y') {
							String delete = "DELETE FROM pessoas WHERE id = ?";
							stmt = connection.prepareStatement(delete);
							stmt.setInt(1, cod);
							
							if(stmt.executeUpdate() > 0) {
								System.out.println("\nUsu�rio deletado com sucesso");
							}else {
								System.out.println("\nUsu�rio n�o pode ser deletado com sucesso");
							}
							
						}else if(answer == 'N' || answer == 'n') {
							cod = 0;
							sql = "";
						}else {
							System.out.println("Resposta inv�lida.");
							System.out.println("Por favor, digite Y para continuar ou N para encerrar.");
						}
						
					}else {
						System.out.println("\nNenhum resultado foi encontrado");
					}
					
					stmt.close();
					connection.close();
					
				}else {
					System.out.println("Valor inv�lido");
					System.out.println("Digite um valor num�rico v�lido \n");
					read.next();
				}
			}catch(InstantiationError e) {
				System.out.println("Erro ao ler entrada: " + e.getMessage());
			}
		
		}
		read.close();
	}
}
