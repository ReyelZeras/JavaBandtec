
package com.bandtec;

import java.util.Scanner;

/**
 *
 * @author diego brito
 */
public class Leitor {

    public static void main(String[] args) {
        
        // Declaração padrão de um objeto do tipo Scanner
        Scanner leitorNumerico = new Scanner(System.in);
        Scanner leitorAlfaNumerico = new Scanner(System.in);
        
//        System.out.println("Digite seu nome:");
//        String nome = leitor.nextLine();
//        
//        System.out.println("Seja bem vindo " + nome);

        System.out.println("Digite seu nome:");
        String nome = leitorAlfaNumerico.nextLine();
        
        System.out.println("Seja bem vindo " + nome + "\n");
        
        System.out.println("Digite sua idade:");
        Integer idade = leitorNumerico.nextInt();
        
        System.out.println("Ta veiao ein: " + idade + "\n");
        
        System.out.println("Digite a faculdade que você estudou:");
        String nomeFaculdade = leitorAlfaNumerico.nextLine();
        
        System.out.println("A melhor faculdade de SP: " + nomeFaculdade);
        System.out.println("");
        
        System.out.println("Digite seu salario pretendido:");
        Double salarioDosSonhos = leitorNumerico.nextDouble();
        
        System.out.println("\tVai ganhar isso se estudar bastante: " +
                salarioDosSonhos + "\n");
        
    }
}
