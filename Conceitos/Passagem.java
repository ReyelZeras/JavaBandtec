package com.bandtec;

import java.util.Scanner;

public class Passagem {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         
        System.out.println("Digite seu saldo: ");
        Double saldo = leitor.nextDouble();       
        
        Double resultado = (saldo / 4.40);
        
        Integer quantidadeInteiro = resultado.intValue();
                
        System.out.println("Você ainda pode utilizar o metrô " + (saldo / 4.40) + " vezes.");
 
    }
}
