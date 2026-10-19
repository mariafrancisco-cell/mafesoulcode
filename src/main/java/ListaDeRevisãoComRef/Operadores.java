package ListaDeRevisãoComRef;

public class Operadores {
    static void main(String[] args) {
        int a = 15;
        int b = 4;
        System.out.println((a + b) + " " + (a-b) + " "+ (a*b) + " " + (a/b) + " " + (a%b)) ;

        int saldo = 1000;
        saldo += 250;
        saldo -= 380;
        System.out.println("saldo final " + saldo);

        int idade = 20;
        boolean temCarteira = true;
        System.out.println(idade >= 18 && temCarteira == true);

        int c = 30;
        System.out.println(c);
        System.out.println(c%2);
        double arroz = 5.50 * 3;
        System.out.printf("Você pagou %.2f em 3 sacos de arroz", arroz);

        int d = 10;
        int restodivisão = 10%3;
        int restodivisão1 = 10%5;
        System.out.println(restodivisão == 0);
        System.out.println(restodivisão1 == 0);
    }
}
