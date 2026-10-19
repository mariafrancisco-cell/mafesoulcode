package org.example.aula5;
import java.util.Scanner;

public class Exercicio {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= 5; i += 5) {
            System.out.println("Volta " + i);

        int senha = 0;
        while (senha != 1234 ) {
            System.out.println("Digite a senha: ");
            senha = scanner.nextInt();
        }
        int numero = 0;
        while (numero < 5) {
            numero++;
            System.out.println(numero);
        }

    }
}}
