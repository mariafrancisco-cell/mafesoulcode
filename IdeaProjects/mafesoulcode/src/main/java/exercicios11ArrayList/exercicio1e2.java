package exercicios11ArrayList;
import java.util.ArrayList;
import java.util.List;
public class exercicio1e2 {
    static void main() {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Mafe");
        nomes.add("Edu");
        nomes.add("Ana");

        ArrayList<String> frutas = new ArrayList<>(List.of("Maçã", "banana", "uva"));
        System.out.println(frutas.get(0));
        System.out.println(frutas.size());


    }

}
