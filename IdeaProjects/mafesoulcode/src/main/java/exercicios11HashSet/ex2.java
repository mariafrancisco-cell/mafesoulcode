package exercicios11HashSet;
import java.util.HashSet;
import java.util.List;

//2. Crie um HashSet de cores usando addAll. Depois use contains dentro
//   de um if para avisar se a cor "verde" já está no conjunto ou não.
public class ex2 {
    static void main() {
    HashSet<String> cores = new HashSet<>(List.of("vermelho", "azul"));
    HashSet<String> cores2 = new HashSet<>(List.of("verde", "azul"));
    cores.addAll(cores2);
        System.out.println(cores);
        if (cores.contains("verde")){
            System.out.println("Contém verde");
        }
        else {
            System.out.println("Não contém verde");
        }
    }
}
