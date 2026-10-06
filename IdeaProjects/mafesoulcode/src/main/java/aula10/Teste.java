package aula10;

public class Teste {
    static void main() {
        try{
            int resultado = 10/0;
            System.out.println(resultado);
        }catch(ArithmeticException ae) {
            System.out.println("Não se divide por 0!");
        } finally {
            System.out.println("Isso sempre roda");
        }
        System.out.println("O programa continua");
    }
}
