package object.orientacaoObjeto.desafioHerança;

public class Bugatti extends Veiculo {
	String nome;
	
	Bugatti(String nome){
		super(550);
		this.nome = nome;
	}
	
	@Override
	void acelerar() {
		if(ligar()) {
			velocidade += 20;
		}
	}
	
	@Override
	void frear() {
		if(velocidade >= 20) {			
			velocidade -= 20;
		}else {
			velocidade = 0;
		}
	}
	
	@Override
	public String toString() {
		return  "O modelo do carro: " + nome + "\nVelocidade atual é de " + velocidade;
	}
}
