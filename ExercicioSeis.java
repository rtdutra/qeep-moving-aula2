package br.com.qm.aulaDois;

import java.util.Scanner;

public class ExercicioSeis {
	
	// 6. Fa�a um programa que receba dois n�meros e mostre qual deles � o maior.
    public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## Comparador de N�meros ##");
		System.out.println("Digite o primeiro n�mero");
		int primeiroNumero = teclado.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		int segundoNumero = teclado.nextInt();
		
		if (primeiroNumero == segundoNumero) {
			System.out.println("Os n�meros digitados s�o iguais");
		} else if (primeiroNumero > segundoNumero) {
			System.out.printf("O numero %d � maior que %d", primeiroNumero, 
					segundoNumero);
		} else {
			
			System.out.printf("O n�mero %d � maior que %d", segundoNumero, 
					primeiroNumero);
		}	
		teclado.close();
		
		
		
		}
		
		

	}


