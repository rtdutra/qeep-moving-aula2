package br.com.qm.aulaDois;

import java.util.Scanner;

public class ExercicioOnze {
	
	// 11. Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## Maior N�mero ##");
		System.out.println("Digite o primeiro n�mero ");
		int primeiroNumero = teclado.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		int segundoNumero = teclado.nextInt();
		
		System.out.println("Digite o terceiro n�mero");
		int terceiroNumero = teclado.nextInt();
		
		if (primeiroNumero == segundoNumero && segundoNumero == terceiroNumero) {
			System.out.println("Os n�meros s�o iguais");
		} else if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O primeiro n�mero � o maior digitado");
		} else {
			System.out.println("O terceiro n�mero � o maior digitado");
		}
		
		teclado.close();
	

	}

}
