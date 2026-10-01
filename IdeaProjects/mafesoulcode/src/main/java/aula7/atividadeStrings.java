package aula7;
import java.util.Scanner;

public class atividadeStrings {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nome = sc.nextLine();
        //1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).
        System.out.println("Possui essas letras" + nome.length());
        //2 — Peça o nome da pessoa e mostre ele em maisculo e minusco
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        //3 — Peça o nome da pessoa e mostre a primeira letra dele.
        System.out.println("A primeira letra é" +nome.charAt(0));
        //4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.
        System.out.println("Digete uma frase");
        String frase = sc.nextLine();
        System.out.println("Digite uma palavra");
        String palavra = sc.nextLine();
        System.out.println(frase.contains(palavra));
        //5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.
        System.out.println("Escreva seu nome!");
        String nome2 = sc.nextLine();
        String nome3 = sc.nextLine();
        System.out.println("São iguais?"+ nome2.equalsIgnoreCase(nome3));



    }
}
