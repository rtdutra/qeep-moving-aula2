package br.com.qm.aulaDois;

import java.util.Scanner;

public class ExercicioQuinze {
	
	// 15. Fa�a um programa que mostre ao usu�rio um menu com 4 op��es de
	// opera��es matem�ticas (as b�sicas, por exemplo). O usu�rio escolhe uma das
	// op��es e o seu programa ent�o pede dois valores num�ricos e realiza a
	// opera��o, mostrando o resultado e saindo.
	
	public static void main(String[] args) {
				
		Scanner teclado = new Scanner(System.in);
		System.out.println("## Primeira Calculadora ##");
		System.out.println(" -- Digite 1 para soma -- ");
		System.out.println(" -- Digite 2 para subtra��o -- ");
		System.out.println(" -- Digite 3 para multiplica��o -- ");
		System.out.println(" -- Digite 4 para divis�o -- ");
		int opcao = teclado.nextInt();
		
		switch (opcao) {
			case 1: 
				System.out.println("Digite o primeiro valor ");
				float primeiroValor = teclado.nextFloat();
				System.out.println("Digite o segundo valor ");
				float segundoValor = teclado.nextFloat();
				float soma = primeiroValor + segundoValor;
				System.out.printf("A soma dos valores �: %.2f", soma);
				break;
				
			case 2:
				System.out.println("Digite o primeiro valor ");
				float primeiroValorSub = teclado.nextFloat();
				System.out.println("Digite o segundo valor ");
				float segundoValorSub = teclado.nextFloat();
				float subtracao = primeiroValorSub - segundoValorSub;
				System.out.printf(" A diferen�a dos valores � %.2f", subtracao);
				break;
								
			case 3:
				System.out.println("Digite o primeiro valor ");
				float primeiroValorMult = teclado.nextFloat();
				System.out.println("Digite o segundo valor ");
				float segundoValorMult = teclado.nextFloat();
				float multiplicacao = primeiroValorMult * segundoValorMult;
				System.out.printf(" A multiplica��o dos valores �: %.2f", multiplicacao);
				break;
				
			case 4:
				System.out.println("Digite o primeiro valor ");
				float primeiroValorDiv = teclado.nextFloat();
				System.out.println("Digite o segundo valor ");
				float segundoValorDiv = teclado.nextFloat();
				float divisao = primeiroValorDiv / segundoValorDiv;
				System.out.printf(" O resultdo da divis�o �: %.2f", divisao);
				break;
			default:
				System.out.println("Op��o inv�lida.");
			
		}
		
		teclado.close();

	}

}
