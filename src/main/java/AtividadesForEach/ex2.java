package AtividadesForEach;

import java.util.ArrayList;
import java.util.List;

public class ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>(List.of(1, 10, 6, 7, 10));

        for (Integer nota : notas) {
            System.out.println(nota);
        }
    }
}
