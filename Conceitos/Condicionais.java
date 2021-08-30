package com.bandtec;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        //Validando números
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número entre 0 e 10: ");
        
        Integer numeroRecebido = leitor.nextInt();
        
        Integer numeroEsperado = 7;
        
        if(numeroRecebido ==  numeroEsperado){
            System.out.println("Você acertou o número esperado! ");
        }else{
            System.out.println("Que pena, você errou o número esperado :( ");
        }
        
        
        // Para validar strings, usamos .equals e NUNCA ==
        String nome1 = "Giuliana";
        String nome2 = "Giuliana";
              
        if(nome1.equals(nome2)){
            System.out.println("Os nomes são iguais mesmo!");
        }else{
            System.out.println("Os nomes não são iguais :( ");
        }
        
        //Melhor forma de validar booleanos
        Boolean receberNotificacoes = true;
        
        if(receberNotificacoes){
            System.out.println("Notificações habilitadas! :)");
        }
        
        //Para validar se o valor é falso usamos !
        if(!receberNotificacoes){
            System.out.println("Notificações desabilitadas!");
        }
    }
    
}
