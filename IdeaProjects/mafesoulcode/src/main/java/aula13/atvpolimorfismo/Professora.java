package aula13.atvpolimorfismo;

public class Professora extends Pessoa {
    public String especializacao;

    void apresentar(String cargo){
        System.out.println("Oi, sou " + nome + ", " +  cargo);
    }
    void lancarNota(String aluna, double nota){
        System.out.printf("%s lançou nota %.1f para %s",nome, nota, aluna);
    }
}
