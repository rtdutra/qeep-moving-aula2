package br.com.qm.aulaDois;

import java.util.Scanner;

public class ExercicioSeis {
	
	// 6. Faça um programa que receba dois números e mostre qual deles é o maior.
    public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## Comparador de Números ##");
		System.out.println("Digite o primeiro número");
		int primeiroNumero = teclado.nextInt();
		
		System.out.println("Digite o segundo número");
		int segundoNumero = teclado.nextInt();
		
		if (primeiroNumero == segundoNumero) {
			System.out.println("Os números digitados são iguais");
		} else if (primeiroNumero > segundoNumero) {
			System.out.printf("O numero %d é maior que %d", primeiroNumero, 
					segundoNumero);
		} else {
			
			System.out.printf("O número %d é maior que %d", segundoNumero, 
					primeiroNumero);
		}	
		teclado.close();
		
		
		
		}
		
		

	}


