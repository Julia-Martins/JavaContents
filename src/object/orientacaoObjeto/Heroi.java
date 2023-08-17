package object.orientacaoObjeto;

public class Heroi extends Jogador {
	boolean atacar(Jogador oponente) {
		boolean atq1 = super.atacar(oponente);
		boolean atq2 = super.atacar(oponente);		
		return atq1 || atq2;
	}
}
