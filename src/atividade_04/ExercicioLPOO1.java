package atividade_04;

public class ExercicioLPOO1 {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("FIAT","Palio");
		c1.printStatus();
		c1.acelerar(20);
		c1.acelerar(50);
		c1.acelerar(200);
		c1.frear(100);
		c1.frear(150);
		c1.printStatus();

	}

}
