package atividade_02;

import java.util.Scanner;

public class Questao001 {

	public static void main(String[] args) {
		
//		1. Escreva um programa que leia um n�mero e escreva na tela se o n�mero � menor, igual ou maior que zero

		
		Scanner input = new Scanner(System.in);		
		Integer numero1;
		
		
		System.out.println("Escreva um N�mero ");		
		numero1 = input.nextInt();
		
		
			if(numero1 > 0) {
				
				System.out.println("O N�mero informado "+numero1+" � MAIOR do que Zero");
			}else if(numero1 < 0){
				System.out.println("O N�mero informado "+numero1+" � MENOR do que zero");
				
			}else {
				System.out.println("O n�mero informado "+numero1+" � ZERO");
			}

	}

}
