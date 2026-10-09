package exerciciosHashMap;
import java.util.Map;
import java.util.HashMap;
//2. Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00,
//   imprima, e depois faça put de "café" DE NOVO com valor 7.50.
//   Imprima outra vez e veja o que aconteceu com o tamanho.
public class ex2 {
    static void main(String[] args) {
        HashMap<String, Double> produtos = new HashMap<>();
        produtos.put("Café", 5.00);
        System.out.println(produtos);
        produtos.put("Café", 7.50);
        System.out.println(produtos);
    }
}
