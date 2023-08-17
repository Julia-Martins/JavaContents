package ConjuntoBaguncado;

import java.util.HashSet;
import java.util.Set;

public class conjuntoBaguncado {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true);
		conjunto.add("Test");
		conjunto.add(1);
		conjunto.add('j');
		
		System.out.println("Tamanho é " + conjunto.size());  
		
		System.out.println(conjunto.remove('j'));
		System.out.println(conjunto.remove("Game"));
		System.out.println(conjunto.remove("Test"));
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.contains('j'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(21);
		nums.add(72);
		nums.add(81);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums); // União entre dois conjuntos
		//conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}

}
