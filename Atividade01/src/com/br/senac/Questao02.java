package com.br.senac;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		Integer numero1;
		
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println(" Informe um N�mero");
	    numero1 = scanner.nextInt();
	    
	    
	    System.out.println("N�mero anterior :"+(numero1-1));
	    System.out.println("N�mero Posterior :"+(numero1+1));   
	    
	}

}
