package desafio_alimento;

public class Jantar {
	public static void main(String[] args) {
		Comida ing = new Comida("Arroz", 0.534);
		Comida ing1 = new Comida("Feijão", 0.227);
		Comida ing2 = new Comida("Panceta", 0.758);
		
		Pessoa p1 = new Pessoa("Júlia", 70.0);
		Pessoa p2 = new Pessoa("Lucas", 100.0);
		Pessoa p3 = new Pessoa("Vitória", 60.0);
		
		System.out.println(p1.mensagem());
		p1.comer(ing);
		System.out.println(p1.mensagem());
		
		System.out.println("\n");
		
		System.out.println(p2.mensagem());
		p2.comer(ing1);
		System.out.println(p2.mensagem());
		
		System.out.println("\n");
		
		System.out.println(p3.mensagem());
		p3.comer(ing2);
		System.out.println(p3.mensagem());
	}
}
