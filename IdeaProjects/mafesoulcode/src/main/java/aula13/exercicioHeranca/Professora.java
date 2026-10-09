package aula13.exercicioHeranca;

public class Professora extends Pessoa{
    String disciplina;
    void lancarNota(String aluna, double nota){
        System.out.printf(("%s lançou %.1f para %s\n"), nome, nota, aluna) ;
    }
    @Override
    void apresentar(){
        System.out.printf("Oi, eu sou %s, e ensino %s\n", nome, disciplina);
    }
}
