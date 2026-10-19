package aula10;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dê um número:");
        int numero = sc.nextInt();

        try {
            int restoDaDivisao = 100 % numero;

            System.out.println("O resto da divisão de 100 por " + numero + " é: " + restoDaDivisao);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Não tem como realizar essa conta (divisão/resto por zero)!");
        }

        sc.close();
    }
}
