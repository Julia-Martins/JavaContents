package desafio_alimento;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.caloria;
		}
	}
	
	String mensagem() {
		return nome + " seu peso atual é " + peso;
	}
}
