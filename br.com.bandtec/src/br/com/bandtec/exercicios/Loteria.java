package br.com.bandtec.exercicios;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Loteria {

	public static void main(String[] args) {
		System.out.println("Digite um número entre 0 e 10");
		Scanner leitor = new Scanner(System.in);
		Integer numero = leitor.nextInt();
		
		
		Integer aleatorio = null;
		
		for(int cont = 0; numero != aleatorio; cont++) {
			aleatorio = ThreadLocalRandom.current().nextInt(0, 11);
			System.out.println(aleatorio);
			
			if(numero == aleatorio && cont < 3) {
				System.out.println("Você é MUITO sortudo"  );
			}
			if(numero == aleatorio && cont >= 4 && cont < 10) {
				System.out.println("Você é sortudo");
			}
			if(numero == aleatorio && cont > 10) {
				System.out.println("É melhor você parar de apostar e ir trabalhar");
			}
		}
	}
	
}
