package aula13.atvpolimorfismo;

public class Boleto implements MeioDePagamento{
    @Override
    public void pagar(double valor){
        System.out.printf("Você pagou %.2f por boleto", valor);
    }
}
