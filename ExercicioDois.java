package br.com.qm.aulaDois;

import java.util.Scanner;

public class ExercicioDois {
	
	// 2. Leia uma velocidade em km/h (quilometros por hora) e apresente-a
	//    convertida em m/s (metros por segundo).
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## Converter KM/H para M/S ##");
		System.out.println("Digite a velocidade em Km/H");
		float velocidadeKm = teclado.nextFloat();
		
		float velocidadeMs = velocidadeKm / 3.6F;
		
		System.out.printf("A Velocidade digitada em M/S é: %.2f", velocidadeMs);
		
		teclado.close();
		
	
	}

}
