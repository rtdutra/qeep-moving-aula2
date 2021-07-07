package br.com.qm.aulaDois;

import java.util.Scanner;

public class ExercicioOnze {
	
	// 11. Faça um Programa que leia três números e mostre o maior deles.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## Maior Número ##");
		System.out.println("Digite o primeiro número ");
		int primeiroNumero = teclado.nextInt();
		
		System.out.println("Digite o segundo número");
		int segundoNumero = teclado.nextInt();
		
		System.out.println("Digite o terceiro número");
		int terceiroNumero = teclado.nextInt();
		
		if (primeiroNumero == segundoNumero && segundoNumero == terceiroNumero) {
			System.out.println("Os números são iguais");
		} else if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O primeiro número é o maior digitado");
		} else {
			System.out.println("O terceiro número é o maior digitado");
		}
		
		teclado.close();
	

	}

}
