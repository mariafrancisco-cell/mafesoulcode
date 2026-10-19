package exercicios11HashSet;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
public class ex5 {
    static void main() {
        HashSet<String> frutas = new HashSet<>(List.of("banana", "mamão", "uva"));
        ArrayList<String> fruta = new ArrayList<String>(frutas);
        for (int i = 0; i < frutas.size(); i++ ) {
            System.out.println(fruta.get(i));
        }
    }
}
