package atividade_03;

import java.util.Scanner;

public class Questao002 {

	public static void main(String[] args) {		
		
		
		/*2. Escreva um programa que vai ler uma mensagem e um n�mero, o sistema vai repetir a mensagem digitada 
		 * x vezes o n�mero digitado.
		 */
		
	Scanner input = new Scanner(System.in);		
		Integer numero1;
		String mensagem;
				
		System.out.println("Escreva um N�mero ");		
		numero1 = input.nextInt();
		
		System.out.println("Escreva uma mensagem ");		
		mensagem = input.next();
		
		if(numero1 == 1) {
			
			System.out.println("");
		}
				
		for(int i= 1; i<=numero1; i++) {
					
			System.out.println(mensagem);
		}
		
		
	}

}
