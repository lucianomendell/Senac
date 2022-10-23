package atividade_02;

import java.util.Scanner;

public class Questao004 {

	public static void main(String[] args) {
		
		//4. Escreva um programa que solicita a idade de uma pessoa e verifica se ela pode dirigir (idade>=18).

		
		Scanner input = new Scanner(System.in);		
		Integer idade;
		
		
		System.out.println("Informe a Idade");		
		idade = input.nextInt();
		
		
		
		
			if(idade >= 18) {
				
				System.out.println("Pode Dirigir");
			}else {
				
				System.out.println("Não pode Dirigir");				
				
			}
				
			
			
	}

}
