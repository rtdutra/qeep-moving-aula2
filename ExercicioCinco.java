package br.com.qm.aulaDois;

import java.util.Scanner;

public class ExercicioCinco {
	
	// 5. Fa�a um programa que leia o valor de um produto e imprima o valor 
	//    com desconto, tendo em vista que o desconto foi de 12%.

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## Calculador de Desconto ##");
		System.out.println("Digite o valor do produto ");
		float valorProduto = teclado.nextFloat();
		
		float valorComDesconto = valorProduto * 0.88F;
		System.out.printf("O valor do produto com desconto �: %.2f", valorComDesconto);
		
		teclado.close();
		

	}

}
