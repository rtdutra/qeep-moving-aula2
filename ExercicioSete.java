package br.com.qm.aulaDois;

import java.util.Scanner;

public class ExercicioSete {
	
	// 7. Faça um programa que peça um valor e mostre na tela se o 
	//    valor é positivo ou negativo.

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## Positivo ou Negativo ##");
		System.err.println("Digite um número ");
		int numeroLido = teclado.nextInt();
		
		// maior do que zero é positivo
		// menor do que zero é negativo
		// 0 valor é nulo
		
		if (numeroLido == 0) {
			System.out.println("O número é nulo (igual a 0)");
		} else if (numeroLido > 0) {
			System.out.println("O número é positivo!");
		} else {
			System.out.println("O número é negativo!");
			
		}
		
		teclado.close();
		
	}

}
