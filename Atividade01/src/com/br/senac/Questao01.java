package com.br.senac;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		double nota1;
		double nota2;
		double media;
		
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println(" Informe Nota 01:");
	    nota1 = scanner.nextDouble();
	    
	    
	    System.out.println(" Informe Nota 02:");
	    nota2 = scanner.nextDouble();
	    
	    media = (nota1+ nota2)/2;
	    
	    if(media > 7) {
	    	
	    	System.out.println("Aprovado");
	    }else {
	    	System.out.println("Reprovado");
	    }    


	}

}
