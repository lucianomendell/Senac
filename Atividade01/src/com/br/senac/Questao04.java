package com.br.senac;

import java.math.BigDecimal;
import java.util.Scanner;

public class Questao04 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		double valorConta;
		BigDecimal quantidadePessoas;
		
		BigDecimal valorFinal;
		
		
	    Scanner scanner = new Scanner(System.in);
	    
	    
	    System.out.println(" Valor do  Jantar : ");
	    valorConta = scanner.nextDouble();
	    
	    
	    System.out.println(" Quantidade Pessoas : ");
	    quantidadePessoas = scanner.nextBigDecimal();
	    
	    valorFinal= new BigDecimal(valorConta).divide(quantidadePessoas);
	    
	    
	    
	    System.out.println (" Cada Pesoa vai pagar R$ "+valorFinal.setScale(2, BigDecimal.ROUND_HALF_EVEN)	);
	    
	}

}
