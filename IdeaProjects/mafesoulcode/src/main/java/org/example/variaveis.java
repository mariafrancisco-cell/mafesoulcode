package org.example;

// 1 — Crie uma variável idade e mostre a categoria...
public class variaveis {
    public static void main(String[] args) {

        // -EXERCÍCIO 1
        int idade = 2;
        String pessoa;
        if (idade < 13) { // Ajustado para "menos de 13" conforme o enunciado
            pessoa = "criança";
        } else if (idade <= 17) {
            pessoa = "adolescente";
        } else if (idade >= 18 && idade < 60) {
            pessoa = "adulto";
        } else {
            pessoa = "Idoso";
        }
        System.out.println("A pessoa é " + pessoa);


        //  EXERCÍCIO 2
        double saldoDaConta = 500.00;
        double compra = 320.00;

        if (saldoDaConta >= compra) { // Se o saldo for suficiente
            double saldoRestante = saldoDaConta - compra;
            System.out.println("Compra aprovada! Saldo restante: R$ " + saldoRestante); // Corrigido o 'println'
        } else {
            double faltando = compra - saldoDaConta;
            System.out.println("Saldo insuficiente. Está faltando: R$ " + faltando);
        }


        // EXERCÍCIO 3
        int opcao = 3;
        switch (opcao) {
            case 1:
                System.out.println("Café");
                break;
            case 2:
                System.out.println("Capuccino");
                break;
            case 3:
                System.out.println("Chocolate quente");
                break;
            case 4:
                System.out.println("Chá");
                break;
            default: // Adicionado para exibir "Opção inválida" como pede o enunciado
                System.out.println("Opção inválida");
                break;
        }
        //exercicio 4
        //4 — Crie variáveis idade (17) e temAutorizacao (true).
        // Mostre se a pessoa pode entrar na festa: precisa ter 18 anos ou ter autorização. Faça o mesmo para
        //precisa ter 18 anos e ter autorização.
        int idade2 = 17;
        boolean temAutorizacao = true;
        if (idade >=18 && temAutorizacao == true ) {
            System.out.println("Pode entrar na festa");
        }
        else {
            System.out.println("Não tem autorização");

        }
        if (idade2 >= 18 || temAutorizacao) {
            System.out.println("Regra OU: Pode entrar na festa");
        } else {
            System.out.println("Regra OU: Não pode entrar");
        }


        //desafio : Crie variáveis para três notas de uma aluna. Calcule a média e mostre: "Aprovada" se for 7 ou mais, "Recuperação" entre 5 e 6.9, e "Reprovada" abaixo de 5. Mostre também a média na tela. Valores: nota1 = 5.3, nota2 = 7.8 , nota3 = 4.5.
        //Ps: Utilize double para o valor das notas. Para controlar as casas decimais, use printf com o marcador %.2f onde você quer que apareça a média no seu texto (Troquem ele de lugar pra ver o que acontece), onde 2 é a quantidade de casas que você quer
        // (Experimentem trocar por 3 e ver o que acontece). O texto e a pontuação vão dentro das aspas, e o \n no final pula a linha (ele funciona como  um enter para que tudo não fique colado um do lado do outro):
        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;
        double media = (nota1+nota2 + nota3)/ 3;
        if (media >= 7){
            System.out.printf("A aluna foi aprovada ocm uma média de %.\n", media);
        }
        else {
            System.out.printf("A aluna foi reprovada com uma média de %.3f\n",media);
        }

    }
}

