package exercicios11ArrayList;
import java.util.ArrayList;
import java.util.List;
public class exercicio5 {
    static void main() {
        ArrayList<String> nomes = new ArrayList<>(List.of("Ana", "Gabi", "Manu", "Mafe", "Tina", "Emi"));
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
