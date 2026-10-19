package aula7;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
public class atividadeArray {
    static void main() {
        //1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.
        String[] pessoas = {"Maria", "Julia", "Ana", "Camily", "Fernanda"};
        System.out.println(pessoas[0] + pessoas[2] + pessoas[4]);
        //2 — Crie um array com as notas {8, 6, 10, 7, 9}.
        // Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".
        int[] notas = {8, 6,10, 7,9};
        for (int i = 0; i < notas.length; i++){
            System.out.println("Nota"+ (i +1) + ": " + notas[i]);
        }
        //3 — Com o mesmo array de notas, calcule e mostre a soma e a média.
        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.printf("Sua média é %.2f\n", media);

        //4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i= 0; i < numeros.length; i++) {
            System.out.println("Digite o número" + (i + 1));
            numeros[i] = sc.nextInt(); //
        }
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        //loop que lê do contrário
        for (int i = numeros.length -1; i >= 0 ;i--){
            System.out.println(numeros[i]);
            if (i >0);
        }
        for(int i = 10; i> 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
