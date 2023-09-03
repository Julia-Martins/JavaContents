package ConjuntoBaguncado;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> users = new HashMap<>();
		
		users.put(1, "Júlia");
		users.put(2, "Lucas");
		users.put(3, "Dastan");
		
		System.out.println(users.size());
		System.out.print(users.isEmpty());
		
		System.out.print("\n");
		
		System.out.println(users.keySet());
		System.out.println(users.values());
		System.out.println(users.entrySet());
		
		System.out.println(users.containsKey(7));
		System.out.println(users.containsValue("Lucas"));
		
		System.out.println(users.get(1));
		
		
		for(int chave: users.keySet()) {
			System.out.println(chave);
		}
		
		System.out.print("\n");
		
		for(String valor: users.values()) {
			System.out.println(valor);
		}
		
		System.out.print("\n");
		
		for(Entry<Integer, String> registro: users.entrySet()) {
			System.out.print(registro.getKey() + " - ");
			System.out.println(registro.getValue());
		}
	}
}
