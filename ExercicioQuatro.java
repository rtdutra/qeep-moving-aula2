package br.com.qm.aulaDois;

import java.util.Scanner;

public class ExercicioQuatro {
	
	// 4. Receba a altura do degrau de uma escada e a altura que o usu�rio 
	//    deseja alcan�ar subindo a escada. Calcule e mostre quantos degraus 
	//    o usu�rio dever� subir para atingir seu objetivo.
	
	// degrau: cm, altura: m
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## Calculador de Degraus ##");
		System.out.println("Digite a altura do degrau ");
		float alturaDegrau = teclado.nextFloat();
		System.out.println("Digite a altura da escada ");
		float alturaEscada = teclado.nextFloat();
		
		float quantidadeDegraus = (alturaEscada * 100) / alturaDegrau;
		
		System.out.printf("A quantidade de degraus dessa escada �: %.0f", quantidadeDegraus);
		
		teclado.close();
		

	}

}
