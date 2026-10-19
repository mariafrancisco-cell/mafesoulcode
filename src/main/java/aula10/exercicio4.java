package aula10;
import java.util.Scanner;
public class exercicio4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String nome = null;
        try {
            System.out.println(nome.length());
        } catch (NullPointerException e) {
            System.out.println("O nome não foi preenchido");
        }
    }
}
