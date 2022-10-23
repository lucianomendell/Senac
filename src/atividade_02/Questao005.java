package atividade_02;

import java.util.Scanner;

public class Questao005 {

	public static void main(String[] args) {
		
		//5. Escreva um programa que dada a idade de uma pessoa, retorna uma das seguintes mensagens: 
		//“Não pode nem votar e nem dirigir”, 
		//“Pode votar, mas não pode dirigir”, 
		//“Pode votar e pode dirigir”.

		
		Scanner input = new Scanner(System.in);		
		Integer idade;
		
		
		System.out.println("Informe a Idade");		
		idade = input.nextInt();
		
		
		
		
			if(idade < 16) {
				
				System.out.println("Não Pode votar e nem Dirigir");
				
			}else if(idade >= 16 && idade < 18) {
				
				System.out.println("Pode Votar, mas não pode dirigir");				
				
			}else {
				
				System.out.println("Pode votar e pode dirigir");
			}
							
			
	}

}
