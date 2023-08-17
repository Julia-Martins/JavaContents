package objectDesafio;

public class ClienteTeste {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Júlia Martins de Freitas Brasileiro");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Bolacha Recheada", 3.25, 5);
		compra1.adicionarItem(new Produto("Monster Energy", 8.0), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Mexirica", 1.25, 7);
		compra2.adicionarItem(new Produto("Brócolis", 3.0), 4);
		
		cliente.adicionarCompra(compra1);// Melhor método
		cliente.comprar.add(compra2);
		
		System.out.println(cliente.obterValorTotalCompras());
	}
}
