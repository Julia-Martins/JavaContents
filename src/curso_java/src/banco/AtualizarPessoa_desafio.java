package banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AtualizarPessoa_desafio {
	public static void main(String[] args) throws SQLException {
		Scanner read = new Scanner(System.in);
		boolean end = false;
		String nomeSubstituto = "";
		int cod = 0;
		
		while(end != true) {
			
			try {
				System.out.println("Digite o Valor 0 para que o programa seja encerrado!!!");
				
				System.out.print("Digite o código de acesso ao usuário ");

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
						
						System.out.println("Esse é o resultado encontrado");						
						System.out.println("Nome Atual: " + pessoas.getName());
						
						
						do {
							System.out.print("Deseja editar esse nome? ");
							answer = read.next().charAt(0);
							
							if(answer == 'Y' || answer == 'y') {
								nomeSubstituto = "";
								
								System.out.print("Digite seu novo nome: ");

								while(nomeSubstituto.isEmpty()) {
									nomeSubstituto = read.nextLine();
									
									if(!nomeSubstituto.isEmpty()) {
										sql = "";
										sql = "UPDATE pessoas set name = ? WHERE id = ?;";
										
										stmt.close();
										stmt = connection.prepareStatement(sql);
										
										stmt.setString(1, nomeSubstituto);
										stmt.setInt(2, cod);
										stmt.executeUpdate();
										
										System.out.println("Nome editado com Sucesso!");
									}
								}
								
							}else if(answer == 'N' || answer == 'n') {
								cod = 0;
								sql = "";
								break;
							}else {
								System.out.println("Resposta inválida.");
								System.out.println("Por favor, digite Y para continuar ou N para encerrar.");
							}
							
						}while(answer != 'N' && answer != 'n');
						
					}else {
						System.out.println("\nNenhum resultado foi encontrado");
					}
					
					stmt.close();
					connection.close();
					
				}else {
					System.out.println("Valor inválido");
					System.out.println("Digite um valor numérico válido \n");
					read.next();
				}
			}catch(InputMismatchException e) {
				System.out.println("Erro ao ler entrada: " + e.getMessage());
			}
		}
		read.close();
	}
}
