package exercicios11HashSet;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

//3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
//   tirar os repetidos. Imprima os dois e compare.
public class ex3 {
    static void main() {
    ArrayList<String> nomes = new ArrayList<>(List.of("Mafe", "Mafe", "Ana", "Ana"));
    HashSet<String> naorepete = new HashSet<>(nomes);
        System.out.println(naorepete);
    }
}
