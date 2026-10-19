package exerciciosHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ex1 {
    static void main(String[] args) {
        //1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa
        //   inteiro e depois use get para mostrar a idade de uma delas.
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Mafe", 18);
        mapa.put("Gui", 20);
        mapa.put("Ana", 21);
        System.out.println(mapa);
        mapa.get("Mafe");

    }
}
