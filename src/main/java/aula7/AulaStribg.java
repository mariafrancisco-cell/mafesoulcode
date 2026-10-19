package aula7;

import java.util.Locale;

public class AulaStribg {
    static void main() {
        String nome = "Mafe";
        String teste = " oi ";
        System.out.println(nome.length());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.contains("Mafe"));
        System.out.println(nome.charAt(4));
        System.out.println(nome.contains("Beatriz"));
        System.out.println(nome.substring(2,3));
        System.out.println(nome.replace("Mafe", "Ana"));
        System.out.println("oi".trim());
        System.out.println(teste.replace("", ","));

        System.out.println(nome.equals("mafe"));

    }
}
