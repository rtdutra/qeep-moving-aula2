package br.com.qm.aulaDois;

import java.util.Scanner;

public class ExercicioOito {
	
	// 8. Escreva um programa que, dados dois números inteiros, mostre na tela
	// o maior deles, assim como a diferença existente entre ambos.

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## Maior e a Diferença ##");
		System.out.println("Digite o primeiro número");
		int primeiroLido = teclado.nextInt();
		System.out.println("Digite o segundo número");
		int segundoLido = teclado.nextInt();
		
		if (primeiroLido == segundoLido) {
			System.out.println("Os números são iguais, portanto, não há uma diferença");
		} else if (primeiroLido > segundoLido) {
			int diferenca = primeiroLido - segundoLido;
			System.out.printf("O primeiro número digitado é maior e a"
					+ "diferença dos dois números é %d", diferenca);
		} else { 
			int diferenca = segundoLido - primeiroLido;
			System.out.printf("O segundo núemro digitado é maior e a "
					+ "diferenca dos dois números é12"
					+ " %d", diferenca);
			
			teclado.close();
			
		}
		
		

	}

}
