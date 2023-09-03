package ConjuntoBaguncado;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class conjuntoComportado {
	public static void main(String[] args) {
//		Set<String> aprovedList = new HashSet<String>();
		SortedSet<String> aprovedList = new TreeSet<>();
		
		aprovedList.add("Júlia");
		aprovedList.add("Bruce");
		aprovedList.add("Lucas");
		aprovedList.add("Marcos");
		
		for(String candidato: aprovedList) {
			System.out.println(candidato);
		}
		
		System.out.print("\n");
		
		Set<Integer> numbers = new HashSet<>();
		
		numbers.add(21);
		numbers.add(72);
		numbers.add(33);
		numbers.add(64);
		
		for(int n: numbers) {
			System.out.println(n);
		}
	}

}
