package petshop;

public class Petshop {
    String nome;
    String especie;
    double peso;
    String categoria;

    void emitirSom(){
        System.out.println(nome + " faz um som.");
    }

    void definirPorte(double peso) {
        if (peso < 10) {
            categoria = "Pequeno"; // MUDOU: maiúscula, igual à saída esperada
        } else if (peso < 25) {    // MUDOU: era "peso > 10 || peso < 25"
            categoria = "Médio";
        } else {
            categoria = "Grande";
        }
        System.out.println("Porte: " + categoria); // MUDOU: um print só, no fim
    }
}