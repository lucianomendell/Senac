package atividade_03;

import java.util.Scanner;

public class Questao003 {

	public static void main(String[] args) {		
		
		
	/*	3. Escreva um programa que vai ler 2 números, 
	 * o sistema vai escrever na tela todos os número entre os 2 digitados.*/

		
	Scanner input = new Scanner(System.in);		
		Integer numero1;
		Integer numero2;
				
		System.out.println("Escreva primeiro Número ");		
		numero1 = input.nextInt();
		
		System.out.println("Escreva Segundo Número ");		
		numero2 = input.nextInt();
		
		if(numero1 > numero2) {
			
			System.out.println("Número 2 não pode ser menor do que o Número 1");
		}
		
				
		for(int i= numero1; i<=numero2; i++) {
					
			System.out.println(i);
		}
		
		
	}

}
