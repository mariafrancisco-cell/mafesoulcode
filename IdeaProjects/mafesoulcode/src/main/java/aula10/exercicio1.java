package aula10;
import java.util.Scanner;
public class exercicio1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Me dê o primeiro número");
        int a = sc.nextInt();
        System.out.println("Me dê o próximo número");
        int b = sc.nextInt();
        int resultado = a/b;
        System.out.println("Resultado:" + resultado);

        try{
             resultado = a/b;
                System.out.println(resultado);
        }catch(ArithmeticException e) {
            System.out.println("Não dá pra dividir por 0");
        } finally {
            System.out.println("Fim do cálculo");
        }

    }

}
