package AtividadesForEach;

public class ex3 {
    static void main(String[] args) {
        Integer notas[] = {8, 6, 10, 7};
        int soma = 0;
        for ( Integer nota : notas){
             soma += nota;
        }
        System.out.println("A média é " + (soma/4));

    }
}
