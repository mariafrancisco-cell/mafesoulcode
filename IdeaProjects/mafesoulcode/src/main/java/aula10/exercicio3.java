package aula10;
import java.util.InputMismatchException;
import java.util.Scanner;
public class exercicio3 {
    static void main() {
        //3 — Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número, trate a InputMismatchException e mostre uma mensagem pedindo um número.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        try {
            int numero = sc.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Digite um número, não uma string");
        }

    }
}
