import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class aula11 {
    // Adicionado public e os argumentos (String[] args)
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(10);
        lista.addAll(List.of(1, 2, 35, 6, 765, 234));

        lista.remove(1);
        System.out.println(lista.get(2));
        lista.set(0,98);
        System.out.println(lista.contains(3));
        System.out.println(lista.size());

        HashMap<String, String> emails = new HashMap<>();
        emails.put("Ana", "ana@gmail.com");
        emails.put("Mafe", "mafe@gmail.com");
        emails.put("posicao 2", "qualquer coisa");
        System.out.println(emails.get("Ana"));
        System.out.println(emails.get("posicao 2"));
        System.out.println(emails.getOrDefault("olá", "oi"));

    }
}
