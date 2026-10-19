package exerciciosHashMap;
import java.util.HashMap;
//5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
//   Remova uma delas e imprima de novo.
public class ex5 {
    static void main(String[] args) {
        HashMap<String, Integer> notas = new HashMap<>();
        notas.put("Mafe", 10);
        notas.put("Flora", 0);
        System.out.println(notas);
        System.out.println(notas.size());
        notas.remove("Mafe");
        System.out.println(notas);
        System.out.println(notas.size());


    }
}
