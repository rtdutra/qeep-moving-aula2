package br.com.qm.aulaDois;

import java.util.Scanner;

public class ExercicioUm {
	
	//1. Leia um valor de comprimento em polegadas e apresente-o 
	//   convertido em cent�metros.

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("## Converte Polegadas em Centimetros ##");
		System.out.println("Digite o valor em polegadas:");
		float valorPolegadas = teclado.nextFloat();
		
		float valorCentimetros = valorPolegadas * 2.54F;
		
		System.out.printf("O valor %.2f polegadas equivale a %.2f centimentros", valorPolegadas,
				valorCentimetros);
		
		teclado.close();

	}

}
