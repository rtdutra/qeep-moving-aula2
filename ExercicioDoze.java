package br.com.qm.aulaDois;

import java.util.Scanner;

public class ExercicioDoze {
	
	// 12. Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual
	//     produto voc� deve comprar, sabendo que a decis�o � sempre pelo mais
	//     barato.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("# Menor Valor #");
		System.out.println("Digite o primeiro valor ");
		float primeiroProduto = teclado.nextFloat();
		System.out.println("Diigte o segundo valor ");
		float segundoProduto = teclado.nextFloat();
		System.out.println("Digite o terceiro produto ");
		float terceiroProduto = teclado.nextFloat();
		
		if (primeiroProduto == segundoProduto && segundoProduto == terceiroProduto) {
			System.out.println("Tanto faz, todos os produtos tem o mesmo pre�o");
		} else if (primeiroProduto < segundoProduto 
				&& primeiroProduto < terceiroProduto) { 
			System.out.println("Compre o primeiro produto.");
		} else if (segundoProduto < primeiroProduto 
				&& segundoProduto < terceiroProduto) {
			System.out.println("Comprar o segundo produto.");
		} else {
			System.out.println("Compre o terceiro produto.");
		}
		teclado.close();
	

	}

}
