package atividade_02;

import java.util.Scanner;

public class Questao006 {

	public static void main(String[] args) {
	
		//6. Escreva um programa para calcular O IMC (�ndice de massa corp�rea) que indica o grau de obesidade de uma pessoa.
	   // Este �ndice � obtido pelo peso (em kg) dividido pelo quadrado da altura (em metros).
	  //  Entradas peso e altura, sa�da resultado do IMC e Avalia��o.
	  //  A tabela a seguir apresenta as faixas deste �ndice:
	  //  IMC = Avalia��o
	   // menor que 20 = Abaixo do normal
	  //  entre 20, 25 = Normal
	  //  entre 25, 30 = Sobrepeso
	  //  entre 30, 35 = Obesidade leve
	 //   entre 35, 40 = Obesidade moderada
	  //  maior que 40 = Obesidade m�rbida
		
		Scanner input = new Scanner(System.in);		
		Float peso, altura, imc;
		
		
		System.out.println("Informe a Altura");		
		altura = input.nextFloat();
		
		
		System.out.println("Informe o Peso");		
		peso = input.nextFloat();
		
		imc = peso / (altura * altura);
		
		
		  //  maior que 40 = Obesidade m�rbida
		
		if(imc < 20 ) {
			
			System.out.println(" Abaixo do Normal");
			
		}else if(imc > 20 && imc < 25) {
			
			System.out.println(" Normal");
		}else if (imc >= 25 && imc < 30) {
			
			System.out.println("Sobrepeso");
			
		}else if (imc >=30 && imc < 35) {
			
			System.out.println("Obesidade leve");
			
		}else if(imc>=35 && imc < 40) {
			
			System.out.println("Obesidade Moderada");
		}else if(imc >40) {
		
		System.out.println("Obesidade M�rbida");
	}
			
			
	}

}
