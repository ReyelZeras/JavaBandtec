package br.com.bandtec.exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número");
		Integer numero = leitor.nextInt();
		Integer cont = 0;
		Integer result;
		System.out.printf("\nTabuada do %d:\n", numero);
		
		do {
			result = cont * numero;
			System.out.printf("\n%d X %d = %d", numero, cont, result);
			cont++;
		} while (cont <= 10);
	}
	
	
	
}
