package ConjuntoBaguncado;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		// ADD e OFFER
		//  Quando a fila estiver cheia eles se comportam de forma diferente
		fila.add("Bruce"); // Retorna false
		fila.offer("Júlia"); // Retorna uma exceção
		fila.add("Dastan");
		fila.offer("Lucas");
		fila.add("Dartanhan");
		fila.offer("Rafael");
		
		// PEKK e ELEMENT
		// Quando a fila estiver vazia eles se comportam de forma diferente
		System.out.println(fila.peek()); // Retorna null
		System.out.println(fila.element()); // Retorna uma exceção
		System.out.println("\n");
		
		// POOL e REMOVE
		// Quando a fila estiver vazia eles se comportam de forma diferente
		while(!fila.isEmpty()){
			System.out.println(fila.poll()); // Retorna null
			System.out.println(fila.remove()); // Retorna uma exceção
		}
		
//		fila.clear();
//		fila.size();
//		fila.isEmpty();
	}

}
