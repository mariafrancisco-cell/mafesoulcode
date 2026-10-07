package exercicios11ArrayList;
import java.util.ArrayList;
import java.util.List;

public class exercicio4 {
    static void main() {
        ArrayList<String> cidades = new ArrayList<>(List.of("SP", "SJC", "Jundiaí", "São José do Rio Preto"));
        cidades.remove(1);
        System.out.println(cidades);
    }
}
