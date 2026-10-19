package aula13.exercicioHeranca;

public class Aluna extends Pessoa{
        String curso;
        void estudar(){
            System.out.printf("%s está estudando %s curso\n", nome, curso);
        }
}
