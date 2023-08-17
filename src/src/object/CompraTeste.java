package object;

public class CompraTeste {
	public static void main(String[] args) {
		Compra buy = new Compra();
		buy.cliente = "Júlia Brasileiro";
		buy.adcionarItem("Bala de Maçã Verde", 20, 0.5);
		buy.adcionarItem(new Item("Caneta", 40, 1.75));
		buy.adcionarItem(new Item("Dadinho", 100, 0.50));
		
		System.out.println(buy.itens.size());
		System.out.println(buy.obterValorTotal());
	}
}
