package desafio_array;

import java.util.Arrays;
import java.util.Scanner;
	
public class matriz {	
	public static void main(String[] args) {
		int qtdNotas = 0, qtdAlunos = 0;
		double result = 0;
		double notaTotal = 0;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Quantidade de Alunos: ");
		qtdAlunos = read.nextInt();
		
		if(qtdAlunos <= 0) {
			System.out.println("Por favor digite uma qtd válida!");
			
			System.out.print("Quantidade de Alunos");
			qtdAlunos = read.nextInt();
			
		}else {
			System.out.print("Quantas notas você deseja digitar? ");
			qtdNotas = read.nextInt();
			
			double notasTurma[][] = new double[qtdNotas][qtdAlunos];
			
			if(qtdNotas <= 0) {
				System.err.println("Valor inválido!");
				
				System.out.print("Quantas notas você deseja digitar? ");
				qtdNotas = read.nextInt();
				
			}else {
				for(int i = 0; i < notasTurma.length; i++) {
					for (int j = 0; j < notasTurma[i].length; j++) {
						System.out.print("Digite as notas a seguir: ");
						notasTurma[i][j] = read.nextDouble();
						notaTotal += notasTurma[i][j];
					}
				}
				
				result = notaTotal / (qtdAlunos * qtdNotas);
				System.out.println("Média da Turma: " + result);
				
				for(double[] notasAlunos: notasTurma) {
					System.out.println(Arrays.toString(notasAlunos));
				}
				
				read.close();
			}
		}
	}
}
