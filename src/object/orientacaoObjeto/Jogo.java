package object.orientacaoObjeto;

public class Jogo {
	public static void main(String[] args) {
		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 10;
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 11;
		
		System.out.println("Vida do Herói: " + heroi.vida);
		System.out.println("Vida do Monstro: " + monstro.vida);
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		monstro.andar(Direcao.NORTE);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		System.out.println("Vida do Herói: " + heroi.vida);
		System.out.println("Vida do Monstro: " + monstro.vida);
	}
}
