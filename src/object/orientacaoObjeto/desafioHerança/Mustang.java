package object.orientacaoObjeto.desafioHeran�a;

public class Mustang extends Veiculo {
	String nome;
	
	Mustang(String nome){
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return  "O modelo do carro: " + nome + "\nVelocidade atual � de " + velocidade;
	}
	
}
