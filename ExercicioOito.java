package br.com.qm.aulaDois;

import java.util.Scanner;

public class ExercicioOito {
	
	// 8. Escreva um programa que, dados dois n�meros inteiros, mostre na tela
	// o maior deles, assim como a diferen�a existente entre ambos.

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## Maior e a Diferen�a ##");
		System.out.println("Digite o primeiro n�mero");
		int primeiroLido = teclado.nextInt();
		System.out.println("Digite o segundo n�mero");
		int segundoLido = teclado.nextInt();
		
		if (primeiroLido == segundoLido) {
			System.out.println("Os n�meros s�o iguais, portanto, n�o h� uma diferen�a");
		} else if (primeiroLido > segundoLido) {
			int diferenca = primeiroLido - segundoLido;
			System.out.printf("O primeiro n�mero digitado � maior e a"
					+ "diferen�a dos dois n�meros � %d", diferenca);
		} else { 
			int diferenca = segundoLido - primeiroLido;
			System.out.printf("O segundo n�emro digitado � maior e a "
					+ "diferenca dos dois n�meros �12"
					+ " %d", diferenca);
			
			teclado.close();
			
		}
		
		

	}

}
