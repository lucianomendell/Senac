package atividade_02;

import java.util.Scanner;

public class Questao002 {

	public static void main(String[] args) {
		
//		2. Escreva um programa que receba tr�s inteiros e diga qual deles � o maior e qual o menor.

		
		Scanner input = new Scanner(System.in);		
		Integer numero1, numero2, numero3;
		
		
		System.out.println("Escreva N�mero 1 ");		
		numero1 = input.nextInt();
		
		System.out.println("Escreva N�mero 2 ");		
		numero2 = input.nextInt();
		
		System.out.println("Escreva N�mero 3 ");		
		numero3 = input.nextInt();
		
		
			if(numero1 > numero2 && numero1 > numero3) {
				
				System.out.println("O N�mero maior � o N�mero 1 valor = "+numero1);
				
			}else if(numero2 > numero1 && numero2 > numero3) {
				
				System.out.println("O N�mero Maior � o N�mero 2 valor = "+numero2);
				
			}else {
				
				System.out.println("O N�mero Maior � o N�mero 3  valor = "+numero3);

				
			}

	}

}
