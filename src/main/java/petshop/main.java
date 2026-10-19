package petshop;
import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.HashSet;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //1. A primeira ficha
        Petshop pt = new Petshop();
        pt.nome = "Hollow";
        pt.peso = 12.23;
        pt.especie = "felina";
        System.out.println("=== FICHA DO PET ===");
        System.out.printf("Nome: %s\n", pt.nome);
        System.out.printf("Espécie: %s\n", pt.especie);
        System.out.printf("Peso: %.1f kg\n", pt.peso);

        //2. Scanner e array (criados uma vez só)
        Scanner sc = new Scanner(System.in);
        Petshop[] lista = new Petshop[5];

        //7. Menu
        int opcao = -1;
        int total = 0;
        ArrayDeque<String> fila = new ArrayDeque<>();
        while (opcao != 0) {
            System.out.println("\n=== PETSHOP ===");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Listar pets");
            System.out.println("3 - Procurar pet");
            System.out.println("4- Quantas espécies diferentes");
            System.out.println("5 - Entrar na fila do banho");
            System.out.println("6 - Atender o próximo");
            System.out.println("7- Serviços PET");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();


            switch (opcao) {
                case 1:
                    if (total == lista.length) {
                        System.out.println("Lista cheia! Não dá pra cadastrar mais.");
                        break;
                    }

                    System.out.println("Digite o nome do seu pet");
                    String nomeCad = sc.nextLine();
                    System.out.println("Digite o peso do seu pet");
                    double pesoCad = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite a espécie do seu pet");
                    String especieCad = sc.nextLine();

                    Petshop pet;
                    if (especieCad.equalsIgnoreCase("cachorro")) {
                        pet = new cao();
                    } else if (especieCad.equalsIgnoreCase("gato")) {
                        pet = new gato();
                    } else {
                        pet = new Petshop();
                    }

                    pet.nome = nomeCad;
                    pet.peso = pesoCad;
                    pet.especie = especieCad;

                    System.out.println("=== FICHA DO PET ===");
                    System.out.printf("Nome: %s\n", pet.nome);
                    System.out.printf("Espécie: %s\n", pet.especie);
                    System.out.printf("Peso: %.1f kg\n", pet.peso);
                    pet.definirPorte(pet.peso);

                    lista[total] = pet;
                    total++;
                    System.out.printf("Pet cadastrado! Agora são %d pet(s).\n", total);
                    break;

                case 2:
                    System.out.println("--- PETS CADASTRADOS ---");
                    if (total == 0) {
                        System.out.println("Nenhum pet cadastrado.");
                    } else {
                        for (int i = 0; i < total; i++) {

                            System.out.printf("%s (%s) - %.1f kg - Porte %s\n ",
                                    lista[i].nome, lista[i].especie, lista[i].peso, lista[i].categoria);
                            lista[i].emitirSom();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Qual pet você procura?");
                    String nome = sc.nextLine();
                    boolean achou = false;
                    for (int i = 0; i < total; i++) {
                        if (lista[i].nome.equalsIgnoreCase(nome)) {
                            System.out.println("Encontrado: " + lista[i].nome + " (" + lista[i].especie + ") - " + lista[i].peso + " kg");
                            achou = true;
                        }
                    }
                    if (!achou) {
                        System.out.println("Não enocntrado");
                    }
                    break;

                case 4:
                    System.out.println("--- ESPÉCIES CADASTRADAS ---");
                    HashSet<String> conjuntos = new HashSet<>();
                    for (int i = 0; i <total; i++){
                        conjuntos.add(lista[i].especie.toLowerCase());
                    }
                    for (String conjunto : conjuntos){
                        System.out.println("- " + conjunto);
                    }
                    System.out.println("Total de espécies diferentes: " + conjuntos.size());
                    break;

                case 5:
                    System.out.println("Qual é o nome do pet?");
                    String nomefila = sc.nextLine();
                    fila.add(nomefila);
                    System.out.printf("%s entrou na fila\n", nomefila);
                    System.out.println("Fila agora: "  + fila);
                    break;
                case 6:
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else{
                        System.out.println("O próximo da fila: " + fila.peek());
                        System.out.println("Atendendo: " + fila.poll());
                        System.out.println("Fila agora: " + fila);
                    }
                    break;

                case 7:
                    System.out.println("Qual é o nome do pet?");
                    String nomepet = sc.nextLine();
                    ArrayList<Servico> servicos = new ArrayList<>();
                    servicos.add(new banho());
                    servicos.add(new tosa());
                    servicos.add(new consulta());
                    for ( Servico s : servicos){
                        s.executar(nomepet);
                    }
                    break;
                case 0:
                    System.out.println("Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida");




            }

            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                sc.nextLine();
            }
        }
    }

    static void mostrarFicha(Petshop p) {
        System.out.println("Nome: " + p.nome);
    }

    static void mostrarFicha(Petshop p, String titulo) {
        System.out.println(titulo);
        System.out.println("Nome: " + p.nome);
        System.out.println("Espécie: " + p.especie);
        System.out.printf("Peso: %.1f kg\n", p.peso);
        System.out.println("Porte: " + p.categoria);
    }

}