package object.orientacaoObjeto.desafioHerança;

public class Carro {
	public static void main(String[] args) {
		Mustang car1 = new Mustang("March 1");
		Bugatti car2 = new Bugatti("Divo");
		
		car1.ligar();
		car1.acelerar();
		car1.acelerar();
		car1.acelerar();
		
		System.out.println(car1);
		
		car1.frear();
		car1.frear();
		System.out.println(car1);
		
		car2.ligar();
		car2.acelerar();
		car2.acelerar();
		car2.acelerar();
		System.out.println(car2);
		
		car2.frear();
		car2.frear();
		System.out.println(car2);
	}
}
