package com.bandtec;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        //Leitor (scanner)
        Scanner leitor = new Scanner(System.in);

        //Guardando os números digitados em variáveis
        System.out.println("Digite o 1° número: ");
        Double primeiroNumero = leitor.nextDouble();

        System.out.println("Digite o 2° número: ");
        Double segundoNumero = leitor.nextDouble();

        //String com Interpolação
        String soma = String.format("Soma: %.0f + %.0f = %.0f ",
                primeiroNumero, segundoNumero, (primeiroNumero + segundoNumero));

        String subtracao = String.format("Subtração: %.0f - %.0f = %.0f ",
                primeiroNumero, segundoNumero, (primeiroNumero - segundoNumero));

        String multiplicacao = String.format("Multiplicão: %.0f * %.0f = %.0f ",
                primeiroNumero, segundoNumero, (primeiroNumero - segundoNumero));

        //Exibindo resultados formatados
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);

        //Validando divisão por 0
        if(segundoNumero != 0 && primeiroNumero != 0) {
            System.out.println(String.format("Divisão: %.0f / %.0f = %.0f",
                    primeiroNumero, segundoNumero, (primeiroNumero / segundoNumero)));
        }else{
            System.out.println("Não é possível dividir por 0!");
        }

    }
}
