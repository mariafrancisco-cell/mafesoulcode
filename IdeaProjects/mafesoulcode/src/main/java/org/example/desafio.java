package org.example;

public class desafio {
    // Sem ponto e vírgula aqui, apenas a chave abrindo
    public static void main(String[] args) {
        int idade = 25;
        String pessoa;

        if (idade <= 12) {
            pessoa = "Criança";
        }
        else if (idade >= 13 && idade <= 17) {
            pessoa = "Adolescente";
        }
        else if (idade >= 18 && idade < 60) {
            pessoa = "Adulto";
        }
        else {
            pessoa = "Idoso";
        }

        System.out.println("A pessoa é: " + pessoa);
    } // Fecha o main
} // Fecha a classe
