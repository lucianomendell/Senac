package atividade_02;

import java.util.Scanner;

public class Questao003 {

	public static void main(String[] args) {
		
	//	3. Escreva um programa que solicita a idade de uma pessoa e verifica se ela pode votar (idade>=16).

		
		Scanner input = new Scanner(System.in);		
		Integer idade;
		
		
		System.out.println("Informe a Idade");		
		idade = input.nextInt();
		
		
		
		
			if(idade >= 16) {
				
				System.out.println("Pode Votar");
			}else {
				
				System.out.println("Não pode Votar");				
				
			}
				
			
			
	}

}
