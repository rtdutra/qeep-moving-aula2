package br.com.qm.aulaDois;

import java.util.Scanner;

public class ExercicioNove {
	
	// 9. Leia o sal�rio de um trabalhador e o valor da presta��o de 
	// um empr�stimo. Se a presta��o for maior que 20% do sal�rio imprima: 
	// "Empr�stimo n�o concedido", caso contr�rio imprima: "Empr�stimo concedido"
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## Empr�stimo #");
		System.out.println("Digite o seu sal�rio ");
		float salario = teclado.nextFloat();
		System.out.println("Digite o valor da presta��o");
		float prestacao = teclado.nextFloat();
		
		boolean emprestimoConcedido = prestacao < salario * 0.2F;
		if (emprestimoConcedido) {
			System.out.println("Empr�stimo concedido");
		} else  {
			System.out.println("Empr�stimo n�o conecedido");
		}
		
		teclado.close();
		

	}

}
