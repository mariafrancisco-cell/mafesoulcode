package listaRevisao;
import java.util.Scanner;

public class listaderevisao {
    static void main() {
        //1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
//Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"
        Scanner sc = new Scanner(System.in);
        double valorDoLanche;
        System.out.println("Digite o valor do lanche");
        valorDoLanche = sc.nextDouble();
        if (valorDoLanche > 30) {
            valorDoLanche = valorDoLanche - 5;
            System.out.printf("Você recebeu um desconto de 5 reais! o que você tem que pagar do lanche Xis-Bacon: R$ %.2f\n", valorDoLanche);
        } else {
            System.out.printf("Você terá que pagar do lanche Xis-Bacon: R$ %.2f\n ", valorDoLanche);
        }

        //2 - Faça um programa que use um laço for para contar de 1 até 15. Dentro do for, coloque um if para verificar se o número atual é par ou ímpar (dica: use o operador de resto da divisão % 2 == 0).
        //Imprima na tela o número e a palavra correspondente.
        //Exemplo de saída:
        //"1 é Ímpar"
        //"2 é Par"
        for (int i = 0; i <= 15; i += 1) {
            if (i % 2 == 0) {
                System.out.println(i + " é par");
            } else {
                System.out.println(i + " é ímpar");
            }

        }

        //3 - Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
        //1 - Ver camisas
        //2 - Ver calças
        //3 - Sair
        //Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha. Se digitar uma opção inválida, avise. O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.
        Scanner scaner = new Scanner(System.in);
        int opcao;
        System.out.println("Digite a opção que deseja, 1- Ver camisas, 2- Ver calças, 3- Sair ");
        opcao = scaner.nextInt();
        switch (opcao) {
            case 1:
                do {
                    System.out.println("Você selecionou ver camisas. ");
                    break;
                }
                while ( opcao == 1);

            case 2:
                do {
                    System.out.println("Você selecionou ver calças");
                    break;
                }

                while( opcao ==2);
                break;

            case 3:
                do{
                    System.out.println("Você selecionou sair");
                    break;
                }
                while (opcao ==3);
                break;

            default:
                System.out.println("Opção inválida");
                break;

        }
        //4 - Crie uma classe chamada Pet.
        //
        //Dê a ela três atributos: nome (String), raca (String) e peso (double).
        //
        //Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).
        //
        //Atribua valores para os atributos de cada um deles.
        //
        //Imprima os dados dos dois pets concatenando textos e variáveis.
        Animal gato = new Animal();
        gato.nome = "hollow";
        gato.peso = 20.00;
        gato.raca = "felina";
        Animal cachorro = new Animal();
        cachorro.nome = "floki";
        cachorro.peso = 10.00;
        cachorro.raca = "canina";
        System.out.printf("O nome do gato é %s, seu peso é %.2f KG, sua raça é %s", gato.nome, gato.peso, gato.raca);
        System.out.printf("O nome do cachorro é %s, seu peso é %.2f KG, sua raça é %s", cachorro.nome, cachorro.peso, cachorro.raca);




        //5 - Crie uma classe chamada Produto com os atributos nome (String) e preco (double).
        //
        //Na classe principal, faça um laço for que repita 3 vezes.
        //
        //A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.
        //
        //Instancie um novo Produto e guarde nele os valores digitados.
        //
        //Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!". Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.
       Scanner pd = new Scanner(System.in);
       for (int i = 0; i <= 2 ; i+=1 ) {
           Produto novoProduto = new Produto();
            System.out.println("Qual é produto?");
            Produto.nome = pd.nextLine();
            System.out.println("Qual é o preço?");
            Produto.preco = pd.nextDouble();
            pd.nextLine();
        }
       if (Produto.preco > 100) {
           System.out.printf("Produto caro! Valor R$ %.2f\n", Produto.preco);
       }
       else {
           System.out.printf("Produto com preço acessível Preço R$ %.2f\n", Produto.preco);
       }

       //6 - Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:
        //
        //Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).
        //
        //Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).
        //
        //Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."
        Scanner us = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento");
        usuario.dataDeNascimento = us.nextInt();
        us.nextLine();
        System.out.println("Qual é o seu nome completo?");
        usuario.nome = us.nextLine();
        System.out.printf("O usúario %s nasceu em %d", usuario.nome, usuario.dataDeNascimento);

        //7
    }
}
