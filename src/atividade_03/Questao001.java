package atividade_03;

import java.util.Scanner;

public class Questao001 {

	public static void main(String[] args) {		
		
		
		//1. Escreva um programa que vai ler um n�mero, o sistema vai escrever na tela a tabuada de 1 at� 10 do n�mero digitado.
		
				Scanner input = new Scanner(System.in);		
				Integer numero1;
				
				System.out.println("Escreva um N�mero ");		
				numero1 = input.nextInt();
				
				for(int i=0; i<=10; i++) {
					
					System.out.println(i+" * "+numero1+" = "+numero1*i);
				}
		
		
	}

}
