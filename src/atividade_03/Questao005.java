package atividade_03;

import java.util.Arrays;
import java.util.Scanner;

public class Questao005 {

	public static void main(String[] args) {		
		
		/*6. Escreva um programa que vai ler 5 n�meros o sistema vai mostrar o maior o menor a 
		 * soma e a m�dia dos n�meros digitados
		 */


		Integer[] idades = new Integer [5];
		
		Integer maior18 = 0;
		Integer menor18 = 0;	
		Integer soma = 0;
		float media;
		Integer numeroContagem = 1;

		
	Scanner input = new Scanner(System.in);		

	
	for(int i=0; i<idades.length;i++) {
		
		System.out.println("Escreva o Numero "+numeroContagem);
		numeroContagem++;
		int numero = input.nextInt();
		idades[i] = numero;		
		soma += idades[i];		
	}	
	
	media = soma/5;					
		
	Arrays.sort(idades);
	
	System.out.println("O MENOR Numero "+idades[0]);
	System.out.println("O MAIOR Numero "+idades[4]);
	System.out.println("Media = "+media);

	}	

}
