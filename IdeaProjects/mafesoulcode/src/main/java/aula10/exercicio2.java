package aula10;
import java.util.Scanner;
public class exercicio2 {
    //2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição. Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.
    static void main() {
        int[] notas = {10, 8, 9, 7, 8};
        System.out.println("Dê uma posição para descobrir a nota");
        Scanner sc = new Scanner(System.in);
        int indice = sc.nextInt();
        try {
            System.out.println(notas[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Esse número não existe enquanto índice");
        }
    }
}
