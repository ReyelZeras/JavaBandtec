package com.bandtec;



/**
 *
 * @author diego brito
 */
public class Operadores {

    public static void main(String[] args) {

        /*
            Em Java, os operadores aritméticos são os mesmos do Javascripto <3
            São eles:
            + adição
            - subtração
            * multiplicação
            / divisão
         */
        
        Integer numero1 = 40;
        Integer numero2 = 10;
        
        Integer resultadoSoma = numero1 + numero2;
        
        System.out.println(resultadoSoma);
        
        /*
            ++ incrementar
            -- decrementar
        
            numero1 += 1;
            numero1 -= 1;
            numero1 *= 1;
            numero1 ++;
        
        */
        
        Integer numeroParaTeste = 42;
        
        numeroParaTeste++;
        
        System.out.println(numeroParaTeste);
    }
}
