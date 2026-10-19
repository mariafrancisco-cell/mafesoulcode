package aula8;

public class classe {
    static void saudar(String nome){
        System.out.println("Olá!" + nome + "Tudo bem?");
    }
    static void dobro(int numero){
        System.out.println(numero * 2);
    }
    static  void calcularMedia(double n1, double n2) {
        double media = (n1 + n2)/2;
        System.out.printf("Sua média é %.2f", media);
    }
    static void ehMaiorDeIdade(int idade){
        if(idade >= 18){
            System.out.println("É maior de idade!");
        }
        else {
            System.out.println("Não é maior de idade");
        }
    }
    static void somar(int n1, int n2){
        System.out.println(n1 + n2);
    }
    static void somar(int n1, int n2, int n3) {
        System.out.println(n1 + n2 + n3);
    }
    static void somar(double n1, double n2){
        System.out.println(n1 + n2);
    }
    static void saudacao(String nome){
        System.out.println("Olá!" + nome);
    }
    static void saudacao(){
        System.out.println("Olá");
    }
}
