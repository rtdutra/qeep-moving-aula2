package br.com.qm.aulaDois;

import java.util.Scanner;

public class ExercicioTres { 
	
	// 3. Implemente um programa que calcule o ano de nascimento de uma 
	//    pessoa a partir de sua idade e do ano atual.

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## Calculador de ano de nascimento ##");
		System.out.println("Digite a sua idade ");
		int idade = teclado.nextInt();
		System.out.println("Digite o ano atual ");
		int anoAtual = teclado.nextInt();
		int anoNascimento = anoAtual - idade;
		
		System.out.printf("Você nasceu em: %d", anoNascimento);
		
		teclado.close();
	

	}

}
