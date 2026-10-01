package org.example.aula5;
import java.util.Scanner;

public class Scannear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o objeto correto
        Animal gato = new Animal();

        // Atribuindo valores ao GATO
        gato.emiteSom = true;
        gato.raca = "felina";

        Animal cachorro = new Animal();

        cachorro.emiteSom = true;
        cachorro.raca = "canina";

        // Exibindo os valores para testar
        System.out.println("O gato é da raça: " + gato.raca);
        System.out.println("Ele emite som? " + gato.emiteSom);
        //veiculo
        Veiculo carro = new Veiculo();
        carro.marca = "VW";
        System.out.printf("Qual é a marca do veículo? %s\n", carro.marca);

        Veiculo moto = new Veiculo();
        moto.marca = "Marca da moto";

        Veiculo caminhao = new Veiculo();
        caminhao.qtdPortas = 0;
        System.out.printf("A quantidade de portas da moto é %d\n", moto.qtdPortas);
        Pessoa mafe = new Pessoa();
        mafe.idade = 18;

        //
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        System.out.println("Escreva seu nome");
        nome = sc.nextLine();
        System.out.println("Seu nome é:" + nome);

        System.out.println("Escreva sua idade");
        idade = sc.nextInt();
        System.out.println("Sua diade é:" + idade);


    }
}
