package object;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	
	void adcionarItem(String nome, int qtd, double preco) {
		this.itens.add(new Item(nome, qtd, preco));
	}

	void adcionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.qtd * item.preco;
		}
		
		return total;
	}

}
