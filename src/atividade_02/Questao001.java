package atividade_02;

import java.util.Scanner;

public class Questao001 {

	public static void main(String[] args) {
		
//		1. Escreva um programa que leia um número e escreva na tela se o número é menor, igual ou maior que zero

		
		Scanner input = new Scanner(System.in);		
		Integer numero1;
		
		
		System.out.println("Escreva um Número ");		
		numero1 = input.nextInt();
		
		
			if(numero1 > 0) {
				
				System.out.println("O Número informado "+numero1+" é MAIOR do que Zero");
			}else if(numero1 < 0){
				System.out.println("O Número informado "+numero1+" é MENOR do que zero");
				
			}else {
				System.out.println("O número informado "+numero1+" é ZERO");
			}

	}

}
