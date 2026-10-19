package AtividadesForEach;

public class ex4 {
    static void main(String[] args) {
        String nomes[] = {"Mafe", "Ana", "Bob", "Anna", "Brendon"};
        for (String nome : nomes){
            if (nome.length() > 5){
                System.out.println(nome + " esse nome tem mais de 5 letras ");
            }
            else {
                System.out.println(nome + " Não tem mais de 5 letras");
            }
        }
    }
}
