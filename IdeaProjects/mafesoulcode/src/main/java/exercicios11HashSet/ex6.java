package exercicios11HashSet;
import java.util.HashSet;
import java.util.ArrayList;
public class ex6 {
    static void main() {
        HashSet<String> lista = new HashSet<>();
        System.out.println(lista.isEmpty());
        lista.add("banana");
        System.out.println(lista.isEmpty());
    }
}
