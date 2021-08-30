package br.com.bandtec.exercicios;

import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Integer cont = 0;
		Integer voto;
		Integer mussarela = 0;
		Integer calabresa = 0;
		Integer quatro = 0;

		do {
			System.out.println("Para votar no sabor mussarela, deve-se digitar o valor 5, "
					+ "Para votar no sabor calabresa, "
					+ "deve-se digitar o valor 25, Para votar no sabor quatro queijos, "
					+ "deve- se digitar o valor 50. Vote:");
			voto = leitor.nextInt();
			
			switch (voto) {
			case 5:
				mussarela++;
			
			case 25:
				calabresa++;
				
			case 50:
				quatro++;
				
			
			}
			
		} while (cont < 10);
		
		System.out.printf("\nMussarela recebeu %d votos\n"
				+ "\\nCalabresa recebeu %d votos\\n"
				+ "\\nQuatro queijos recebeu %d votos\\n", 
				mussarela, calabresa, quatro);
	}
	
}
