package atividade_04;

public class Carro {
	
		
		private String marca;
		private String modelo;
		private int velocidade;
		
		public static final int VELOCIDADEMAXIMA = 200;
		public static final int VELOCIDADEMINIMA = 0;
	
		
		public Carro(String marca, String modelo) {
			
			this.marca = marca;
			this.modelo = modelo;
		}
		
		
		public void acelerar(int acelerar ) {
			
			int calculoVelocidade = this.velocidade + acelerar;
			
			if(calculoVelocidade < VELOCIDADEMAXIMA ) {				
				
				System.out.println("Acelerando "+this.velocidade+"+"+acelerar+">"+calculoVelocidade );
				this.velocidade = calculoVelocidade;
				
			}else {					
				
				System.out.println("Acelerando "+this.velocidade+"+"+acelerar+"<"+VELOCIDADEMAXIMA);
				this.velocidade = VELOCIDADEMAXIMA;		
			}			
		}
	
		
		public void frear(int frear) {
			
			int frearCarro =  this.velocidade - frear;
			
			if(frearCarro < VELOCIDADEMINIMA) {
				
				System.out.println("Freando "+this.velocidade+"-"+frear+"<"+VELOCIDADEMINIMA);
				this.velocidade = VELOCIDADEMINIMA;
			}else {
				
				System.out.println("Freando "+this.velocidade+"-"+frear+"<"+frearCarro );
				this.velocidade = frearCarro;
			}
			
		}
		
		

		
		public void printStatus() {
		
		System.out.println("Carro [marca="+this.marca+ ", Modelo="+this.modelo+", Velocidade="+this.velocidade+"]");
	
		}
	
	

}


 



