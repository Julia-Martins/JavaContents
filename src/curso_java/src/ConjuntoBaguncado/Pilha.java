package ConjuntoBaguncado;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("The Witcher");
		livros.push("Don Quixote");
		livros.add("O senhor dos An�is");
		livros.push("O Hobbit");
		livros.add("Mist�rio na Mans�o da Montanha");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		while(!livros.isEmpty()){
			System.out.println(livros.pop());
			System.out.println(livros.poll());
		}
	}
}
