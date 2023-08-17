package object;

public class Item {
	String nome;
	int qtd;
	double preco;
	Compra compra;
	
	Item(String nome, int qtd, double preco){
		this.nome = nome;
		this.qtd = qtd;
		this.preco = preco;
	}
}
