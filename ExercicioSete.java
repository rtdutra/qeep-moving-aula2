package br.com.qm.aulaDois;

import java.util.Scanner;

public class ExercicioSete {
	
	// 7. Fa�a um programa que pe�a um valor e mostre na tela se o 
	//    valor � positivo ou negativo.

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## Positivo ou Negativo ##");
		System.err.println("Digite um n�mero ");
		int numeroLido = teclado.nextInt();
		
		// maior do que zero � positivo
		// menor do que zero � negativo
		// 0 valor � nulo
		
		if (numeroLido == 0) {
			System.out.println("O n�mero � nulo (igual a 0)");
		} else if (numeroLido > 0) {
			System.out.println("O n�mero � positivo!");
		} else {
			System.out.println("O n�mero � negativo!");
			
		}
		
		teclado.close();
		
	}

}
