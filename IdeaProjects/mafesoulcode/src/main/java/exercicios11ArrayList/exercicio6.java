package exercicios11ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class exercicio6 {
    static void main() {
        ArrayList<String> nomes = new ArrayList<>(List.of("Mafe", "Ana", "Edu", "Flora", "Ane"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome!");
        String nome = sc.nextLine();
        if (nomes.contains(nome)) {
            System.out.println("O nome está na posição " + nomes.indexOf(nome));
        }
        else {
            System.out.println("O nome não está na lista");
        }
    }
}
