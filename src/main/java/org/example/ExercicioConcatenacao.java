package org.example;

public class ExercicioConcatenacao {
    static void main() {
        // 1- Crie variáveis para um nome, uma cidade e uma idade. Mostre em uma única linha: "Meu nome é Ana, moro em Salvador e tenho 28 anos."
        String nome = "Mafe";
        String cidade = "SP";
        int idade = 18;
        System.out.println("Meu nome é " + nome + " moro em " + cidade + " e tenho " + idade +" anos" );

        //2 - 2 — Crie variáveis para o nome de um produto ("Caneca"), o preço (12.50) e a quantidade (4). Mostre: "Comprei 4 unidades de Caneca por R$ 12.5 cada. Total: R$ 50.0"
        String produto = "caneca";
        double preco = 12.50;
        int quantidade = 4;
        System.out.println("Comprei " + quantidade + " quantidades de" + produto + "por R$" + preco + ". Total: R$" + (preco * quantidade));
        //3- Crie duas variáveis com números inteiros. Mostre a soma em uma frase completa, assim: "A soma de 15 e 4 é igual a 19."
        int number1 = 2;
        int number2 = 1;
        System.out.println("A soma de " + number1 + " e " + number2 + " é igual a " + (number1 + number2));

        //Aritméticos:
        //0- Rode esse código:
        //System.out.println("2 + 2 = " + 2 + 2);.
        //Agora rode:
        // System.out.println("2 + 2 = " + (2 + 2));
        //Explique em um comentário por que deram resultados diferentes.
        //1- Crie variáveis para dois números inteiros de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.
        //2- Crie variáveis para dois números decimais de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.
        //3- Crie variáveis para três notas (8, 6 e 10). Mostre a soma e a média.
        //4- Faça a operação a + b * c, sendo a = 3, b = 4 e c = 5.
        //5- Faça a operação (a + b) * c, sendo a = 3, b = 4 e c = 5.
        //Desafio: Crie uma variável com 3785 segundos. Mostre quantos minutos inteiros isso dá e quantos segundos sobram.
        //
        //Dica: segundos/60 dá os minutos. segundos % 60 mostra os segundos restantes.
        int numero1 = 10;
        int numero2 = 3;
        System.out.println("soma: " + (numero1 + numero2));
        System.out.println("subtração: "+ (numero1 - numero2));
        System.out.println("multiplicação: " +(numero1 * numero2));
        System.out.println("divisão: " + (numero1 / numero2) );
        System.out.println("resto: " + (numero1 % numero2));
        //parte com o numero decimal
        double numero3 = 10;
        double numero4 = 3;
        System.out.println("soma: " + (numero3 + numero4));
        System.out.println("subtração: "+ (numero3 - numero4));
        System.out.println("multiplicação: " +(numero3 * numero4));
        System.out.println("divisão: " + (numero3 / numero4) );
        System.out.println("resto: " + (numero3 % numero4));
        //desafio
        int segundos = 3785;
        System.out.println(segundos + " segundos equivale a " + (segundos/60) + " minutos e " + (segundos % 60) + " segundos restantes" );


    }

}