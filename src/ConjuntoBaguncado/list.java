package ConjuntoBaguncado;

import java.util.ArrayList;

public class list {
	public static void main(String[] args) {
		ArrayList<usuario> list = new ArrayList<>();
		
		usuario u1 = new usuario("Júlia");
		
		list.add(u1);
		list.add(new usuario("Bruce"));
		list.add(new usuario("Jeorge"));
		list.add(new usuario("Lucas"));
		list.add(new usuario("Dastan"));
		
		System.out.println(list.get(1));
		
		System.out.println("Item removido: " + list.remove(2));
		System.out.println(list.remove(new usuario("Dastan")));
		System.out.println("Contém o objeto? " + list.contains(u1));
		
		System.out.println("Contém o objeto? " + list.contains(new usuario("Lucas")));
		
		for (usuario u : list) {
			System.out.println(u.nome);
		}
	}
}
