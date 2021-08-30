package br.com.bandtec.exercicios;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um número entre 0 e 100");
		Integer numero = leitor.nextInt();
		Integer sorteado = null;
		Integer pares = 0;
		Integer impares = 0;
		
		for(int cont = 0; cont < 200; cont++ ) {
			Integer sorteio = ThreadLocalRandom.current().nextInt(0, 101);
			
			if(sorteio.equals(numero)) {
				sorteado = cont;
			};
			
			if(sorteio % 2 == 0) {
				pares++;
			};
			
			if(sorteio % 2 != 0) {
				impares++;
			};
		};
		
		String frase = String.format("\nSeu numero foi sorteado na %d vez"
				+ "\nForam sorteados %d números pares "
				+ "\nForam sorteados %d números impares", 
				sorteado, pares, impares);
		System.out.println(frase);
	}
	
}
