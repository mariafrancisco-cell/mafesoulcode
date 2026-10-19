package aula10;
public class exercicio6 {
    static void main() {
        String nomes[] = {"mafe", "ana", "camily"};
        try {
            System.out.println(nomes[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Essa posição não existe.");
        }
    }
}
