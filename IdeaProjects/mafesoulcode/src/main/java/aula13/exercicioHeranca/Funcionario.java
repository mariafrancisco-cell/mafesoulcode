package aula13.exercicioHeranca;

public abstract class Funcionario extends Pessoa{
    String nome;
    void baterPonto(){
        System.out.println("Bateu o ponto");
    }

    abstract void notificar();

    abstract void exportar();
}
