package exInterface;

public class Carro implements Veiculo{
    @Override
    public void ligar(){
        System.out.println("O carro ligou");
    }
    public void acelerar(){
        System.out.println("O carro acelerou");
    }
}
