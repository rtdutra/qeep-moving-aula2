package br.com.qm.aulaDois;

import java.util.Scanner;

public class ExercicioDez {
	
	// 10. Fa�a um algoritmo que calcule a m�dia ponderada das notas 
	// de 3 provas. A primeira e a segunda prova tem peso 1 e a terceira 
	// tem peso 2. Ao final, mostrar a m�dia do aluno e indicar se o 
	// aluno foi aprovado ou reprovado. A nota para aprova��o deve ser igual 
	// ou superior a 60 pontos.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("# Aprova��o ##");
		System.out.println("Digite a primeira nota ");
		float primeiraNota = teclado.nextFloat();
		System.out.println("Digite a segunda nota ");
		float segundaNota = teclado.nextFloat();
		System.out.println("Digite a terceira nota ");
		float terceiraNota = teclado.nextFloat();
		
		float media = (primeiraNota * 1F + segundaNota * 1F + terceiraNota * 2F)
				/ (1F + 1F + 2F);
		
		if (media >= 60) {
			System.out.printf("O aluno foi aprovado com a m�dia %.2f", media);
		} else {
			System.out.printf("O aluno foi reprovado com a m�dia %.2f", media);
			
			teclado.close();
			
		}
		
		
		
	

	}

}
