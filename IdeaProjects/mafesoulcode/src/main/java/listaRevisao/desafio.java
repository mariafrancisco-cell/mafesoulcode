package listaRevisao;
import java.util.Scanner;
public class desafio {
    static void main() {
       Scanner sc = new Scanner(System.in);
       System.out.println("Selecione a opção que deseja utilizar, 1-continuar, 2- para sair");
       int opcao = sc.nextInt();
       switch (opcao) {
           case 1:
               do {
                   System.out.println("Qual é o seu nome ?");
                   Aluna.nome = sc.nextLine();
                   sc.nextLine();
                   System.out.println("Qual foi sua primeira nota?");
                   Aluna.nota = sc.nextInt();
                   System.out.println("QUal foi sua segunda nota?");
                   Aluna.nota2 = sc.nextInt();
                   Aluna.media = (Aluna.nota+ Aluna.nota2)/2;
                   if (Aluna.media >= 6) {
                       System.out.printf("Você foi aprovada parabéns!%s, nota 1: %d, nota 2: %d, média: %.2f",Aluna.nome, Aluna.nota, Aluna.nota2, Aluna.media);
                       break;
                   }
                    else {
                       System.out.printf("Voce não foi aprovada:(%s, nota 1: %d, nota 2: %d, média: %.2f",Aluna.nome, Aluna.nota, Aluna.nota2, Aluna.media);
                       break;
                   }
               }
               while (opcao == 1);
               break;
           case 2:
               do{
                   System.out.println("Você optou por sair. Adeus.");
                   break;
               }
               while (opcao ==2);
               break;
           default:
               System.out.println("Opção inválida");
               break;

       }
    }
}
