package atividade_03;

import java.util.Scanner;

public class Questao004 {

	public static void main(String[] args) {	
		
		 final String COMPARAR = "Java-2022";
		
		
		/*4. Escreva um programa que vai ler uma palavra, se a palavra for diferente de "Java-2022" 
		 * o retorno vai ser "Palavra Errada" se igual "Palavra Ok" a pessoa pode faze no máximo 5 
		 * tentativas de acertar a palavra.
		 */

		
	Scanner input = new Scanner(System.in);		
		String palavra;
		Integer tentativas = 0;
				
		
		
		
		while(tentativas <5) {
			
			System.out.println("Escreva uma palavra ");		
			palavra = input.next();
			
			tentativas++;	
			
			if(palavra.equals(COMPARAR)) {
				
				System.out.println("ACERTOU");
				break;
			}else {
				
				System.out.println("ERROU");
			}
			
			
		}
		
	
		
	}

}
