package object.orientacaoObjeto.desafioHerança;

public class Veiculo {
	protected double velocidade = 0;
	final int velocidadeMax;
	
	Veiculo(){
		this.velocidadeMax = 450;
	}
	
	Veiculo(int velocidadeMax){
		this.velocidadeMax = velocidadeMax;
	}
	
	void acelerar() {
		if(ligar() && (velocidade + 10 < velocidadeMax)) {
			velocidade += 10;
		}else{
			velocidade = velocidadeMax;
		}
	}
	
	void frear() {
		if(velocidade >= 10) {			
			velocidade -= 10;
		}else {
			velocidade = 0;
		}
	}
	
	boolean ligar() {
		return true;
	}
	
	boolean desligar() {		
		return false;
	}
}
