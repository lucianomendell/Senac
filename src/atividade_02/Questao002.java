package atividade_02;

import java.util.Scanner;

public class Questao002 {

	public static void main(String[] args) {
		
//		2. Escreva um programa que receba três inteiros e diga qual deles é o maior e qual o menor.

		
		Scanner input = new Scanner(System.in);		
		Integer numero1, numero2, numero3;
		
		
		System.out.println("Escreva Número 1 ");		
		numero1 = input.nextInt();
		
		System.out.println("Escreva Número 2 ");		
		numero2 = input.nextInt();
		
		System.out.println("Escreva Número 3 ");		
		numero3 = input.nextInt();
		
		
			if(numero1 > numero2 && numero1 > numero3) {
				
				System.out.println("O Número maior é o Número 1 valor = "+numero1);
				
			}else if(numero2 > numero1 && numero2 > numero3) {
				
				System.out.println("O Número Maior é o Número 2 valor = "+numero2);
				
			}else {
				
				System.out.println("O Número Maior é o Número 3  valor = "+numero3);

				
			}

	}

}
