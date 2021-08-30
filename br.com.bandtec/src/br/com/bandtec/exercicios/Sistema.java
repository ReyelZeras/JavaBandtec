package br.com.bandtec.exercicios;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		 Scanner leitor = new Scanner(System.in);
	        boolean confirmarNome = false;
	        boolean confirmarSenha = false;

	        while (confirmarNome == false || confirmarSenha == false) {
	            System.out.println("Insira o nome de usuario");
	            String nome = leitor.nextLine();

	            System.out.println("Insira a senha");
	            String senha = leitor.nextLine();

	            confirmarNome = "admin".equals(nome);
	            confirmarSenha = "#Bandtec".equals(senha);

	            if (confirmarNome && confirmarSenha) {
	                System.out.println("Login realizado com sucesso");
	            } else {
	                System.out.println("\nLogin e/ou senha inválidos\n");
	            }
	        }
	}
	
}
