package exercicios11HashSet;
import java.util.HashSet;

public class exercicio1 {
    static void main() {
    HashSet<String> pessoas = new HashSet<>();
    pessoas.add("Ana");
    pessoas.add("Henrique");
    pessoas.add("Camis");
    pessoas.add("Pepito");
    pessoas.add("Pepito");
    //repetido ele ignora
        System.out.println(pessoas);
    }
}
