package aula13.atvpolimorfismo;

public class Pessoa {
    public String nome;
    public int idade;

    public void apresentar(){
        System.out.printf("Oi eu sou %s, tenho %d anos.%n", nome, idade);
    }
}
