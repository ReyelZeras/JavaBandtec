package br.com.bandtec.exercicios;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a base:");
		Integer base = leitor.nextInt();
		System.out.println("Digite o expoente:");
		Integer expoente = leitor.nextInt();
		Integer result = 0;
		
		for(int cont = 0; cont < expoente; cont++) {
			result = base;
			result += result * base;
			System.out.println(result);
			};
		
		System.out.println(result);
	};
	
	
	
	
}
