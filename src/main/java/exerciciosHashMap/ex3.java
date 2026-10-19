package exerciciosHashMap;
import java.util.HashMap;
import java.util.Scanner;
//3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
//   dentro de um if para mostrar o telefone de alguém que está na agenda
//   e de alguém que não está.
public class ex3 {
    static void main(String[] args) {
        HashMap<String, String> agenda = new HashMap<>();
        agenda.put("Mafe", "12 99710-7600");
        agenda.put("Cibele", "11 89327-8299");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome para ver se está dentro da lista");
        String numero = sc.nextLine();
        if(agenda.containsKey(numero)) {
            System.out.println("Está na agenda, o número da pessoa é " +agenda.get(numero) );
        }
        else{
            System.out.println("Não está");
        }
    }
}
