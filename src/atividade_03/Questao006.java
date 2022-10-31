package atividade_03;

import java.util.Scanner;

public class Questao006 {

	public static void main(String[] args) {		
		
		 /*5. Escreva um programa que vai ler a idade de 5 pessoas, o sistema 
		 vai mostrar quantas são maior ou iguais a 18 e quantas são de menor.*/


		Integer[] idades = new Integer [5];
		
		Integer maior18 = 0;
		Integer menor18 = 0;	

		
	Scanner input = new Scanner(System.in);		

	System.out.println("Escreva o Primeiro Número 01");		
	idades[0] = input.nextInt();
	
	System.out.println("Escreva o Segundo Número 02");		
	idades[1] = input.nextInt();
	
	System.out.println("Escreva o Terceiro Número 03");		
	idades[2] = input.nextInt();
	
	System.out.println("Escreva o primeiro Número 04");		
	idades[3] = input.nextInt();	
	
	System.out.println("Escreva o primeiro Número 05");		
	idades[4] = input.nextInt();
			
		for(int i=0; i<5;i++) {
			
			if(idades[i] >= 18) {
				
				maior18 ++;
				
			}else {				
				menor18++;
			}
			
		}				
		
		System.out.println(maior18+" é maior ou igual a 18 ");
		System.out.println(menor18+" é MENOR de IDADE ");

	}	

}
