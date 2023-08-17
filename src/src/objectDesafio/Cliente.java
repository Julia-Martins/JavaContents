package objectDesafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final String nome;
	final List<Compra> comprar = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.comprar.add(compra);
	}
	
	double obterValorTotalCompras() {
		double total = 0;
		
		for(Compra compras: comprar) {
			total += compras.obterValorTotal();
		}
		
		return total;
	}
}
