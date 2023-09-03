package object;

public class CarroTeste {
	public static void main(String[] args) {
		Carro car = new Carro();
		
		System.out.println(car.estaLigado());
		
		car.ligar();
		System.out.println(car.estaLigado());		
		System.out.println(car.motor.giros());
		
		car.acelerar();
		car.acelerar();
		car.acelerar();
		car.acelerar();
		
		System.out.println(car.motor.giros());
		
		car.frear();
		car.frear();
		car.frear();
		car.frear();
		car.frear();
		car.frear();
		car.frear();
		
		System.out.println(car.motor.giros());
		
		System.out.println(car.motor.carro.motor.carro.motor.giros());
	}
}
