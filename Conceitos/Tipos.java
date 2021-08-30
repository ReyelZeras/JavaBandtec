package com.bandtec;

/**
 *
 * @author diego brito
 */
public class Tipos {

    public static void main(String[] args) {

        // Comentários podem ser feitos com "//"
        
        /*
            Se necessário você pode fazer dessa maneira
         */
        
        /*
            Javascript possuí tipagem dinâmica
            var x = 1234
        
            Java utiuliza tipagem estática
            Integer x = 1234
         */
        
        // Para textos ou alfanuméricos, utilizamos o tipo
        // String.
        String nome = "Diego";
        String sobrenome = " Brito";
        String nomeCompleto = nome + sobrenome;
        String faculdade = "Bandtec";
        String cidadeNatal = "São Paulo";

        System.out.println(nomeCompleto);

         /*  
        NÃO UTILIZAREMOS:      
            Tipos primitivos:
                int 
                double
                boolean

                Não aceitam "null"
            
            --------------------------------------------------
        
        UTILIZAREMOS:
            Classes Wrapper:
                Integer
                Double
                Boolean

                Aceitam "null"
        */
        
        // Para valores com inteiros sem casas decimais
        // Utilizaremos o tipo Integer
        Integer numero1 = 42;
        Integer idade = 28;
        
        System.out.println(numero1);
        
        // Para valores com ponto flutuante ou casas decimais
        // Utilizaremos o tipo Double
        Double valor = 10.0;
        Double altura = 1.83;
            
        
        // Para situações que somente é possível "uma opção ou outra"
        // utilizaremos o tipo Boolean
        Boolean ligado = true;
        Boolean isProfessor = false;
        Boolean isMaior = numero1 > 10;
        
    }
}
