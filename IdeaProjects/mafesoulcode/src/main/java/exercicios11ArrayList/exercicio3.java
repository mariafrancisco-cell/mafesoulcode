package exercicios11ArrayList;
import java.util.ArrayList;
import java.util.List;

public class exercicio3 {
    static void main() {
        ArrayList<String> nome = new ArrayList<>(List.of("Mafe", "Flora", "Ana", "Edu"));
        System.out.println(nome);
        nome.set(1, "camila");
        System.out.println(nome);

    }
}
