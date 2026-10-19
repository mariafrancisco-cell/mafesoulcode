package exerciciosHashMap;
import java.util.HashMap;
//4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
//   Use getOrDefault para mostrar a quantidade de um produto que existe
//   e de um que não existe (devolvendo 0). Depois tente com get normal
//   no que não existe e compare.
public class ex4 {
    static void main(String[] args) {
    HashMap<String, Integer> produtos = new HashMap<>();
    produtos.put("Café", 1);
    produtos.put("Chá", 2);
        System.out.println(produtos.getOrDefault("Café", 3));
        System.out.println(produtos.getOrDefault("Banana", 0));
        produtos.get("Banana");
        produtos.get("Café");
    }
}
