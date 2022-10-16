package com.br.senac;

import java.math.BigDecimal;
import java.util.Scanner;

public class Questao05 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		String nome;
		double valorHora;
		int quantidadeHorasTrabalhadas = 0;
		BigDecimal salario;
		
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println(" Informe seu Nome ");
	    nome = scanner.next();
	    
	    System.out.println(" Valor da Hora : ");
	    valorHora = scanner.nextDouble();
	    
	    System.out.println(" Qantidades de Horas trabalhadas: ");
	    quantidadeHorasTrabalhadas = scanner.nextInt();
	    
	    salario = new BigDecimal(valorHora * quantidadeHorasTrabalhadas);
	    
	    
	    System.out.println (nome+ " você vai receber  R$"+salario.setScale(2, BigDecimal.ROUND_HALF_EVEN)	);
	    
	}

}
