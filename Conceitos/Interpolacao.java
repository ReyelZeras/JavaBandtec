package com.bandtec;

public class Interpolacao {
    public static void main(String[] args) {
        String nome = "Giuliana";
        Integer idade = 22;
        Double altura = 1.55;
        
        // Interpolação é uma maneira de formatar uma String usando 
        // valores de outras variáveis (semelhante ao ${} do JavaScript)
        // %s para Strinf
        // %d para Integer
        // %.2f para Double (sendo 2 a quantidade de casas decimais)
        String frase = String.format("Meu nome é %s, tenho %d anos e %.2f de altura",
                nome,idade, altura);
        
        //Exibindo a frase formatada
        System.out.println(frase);
    }
}
