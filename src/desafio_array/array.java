package desafio_array;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		String nome = "";
		int val = 0;
		double result = 0;
		double notaTotal = 0;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Qual � o nome do Aluno ");
		nome = read.next();
		
		if(nome == null || nome == "") {
			System.out.println("Por favor difite um nome v�lido!");
			
			System.out.print("Qual � o nome do Aluno");
			nome = read.nextLine();
			
		}else {
			System.out.print("Quantas notas voc� deseja digitar? ");
			val = read.nextInt();
			
			double notas[] = new double[val];
			
			if(val <= 0) {
				System.err.println("Valor inv�lido!");
				
				System.out.print("Quantas notas voc� deseja digitar? ");
				val = read.nextInt();
				
			}else {
				for(int i = 0; i < notas.length; i++) {		
					System.out.print("Digite as notas a seguir: ");
					notas[i] = read.nextDouble();
				}
				
				for(double notasFinais: notas) {
					notaTotal += notasFinais;
					
				}
				result = notaTotal / notas.length;
				
				System.out.println(mensagemFinal(nome, result));
				
				read.close();
			}
		}
	}
		
	static String mensagemFinal(String nome, double result){		
		if(result < 5.0) {
			return "Aluno(a) " + nome + "\n Foi Reprovado(a)\n Obteve a m�dia: " + result;
		}else if(result >= 5.0 && result <= 7.0) {
			return "Aluno(a) Mediana " + nome + "\n Foi Aprovado(a)\n Obteve a m�dia: " + result;
		}else {
			return "Aluno(a) Acima da M�dia " + nome + "\nFoi Aprovado(a)\nObteve a m�dia: " + result;
		}
	}
}
