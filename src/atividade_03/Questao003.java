package atividade_03;

import java.util.Scanner;

public class Questao003 {

	public static void main(String[] args) {		
		
		
	/*	3. Escreva um programa que vai ler 2 n�meros, 
	 * o sistema vai escrever na tela todos os n�mero entre os 2 digitados.*/

		
	Scanner input = new Scanner(System.in);		
		Integer numero1;
		Integer numero2;
				
		System.out.println("Escreva primeiro N�mero ");		
		numero1 = input.nextInt();
		
		System.out.println("Escreva Segundo N�mero ");		
		numero2 = input.nextInt();
		
		if(numero1 > numero2) {
			
			System.out.println("N�mero 2 n�o pode ser menor do que o N�mero 1");
		}
		
				
		for(int i= numero1; i<=numero2; i++) {
					
			System.out.println(i);
		}
		
		
	}

}
