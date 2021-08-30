package br.com.bandtec.exercicios;

import java.util.Scanner;

public class Acumulador {
	
public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	Integer soma = 0;
	Integer numero;
	
	do {
		System.out.println("Digite um número");
		numero = leitor.nextInt();
		soma+=numero;
	} while (numero!=0);
	
	System.out.println(soma);
}
}
