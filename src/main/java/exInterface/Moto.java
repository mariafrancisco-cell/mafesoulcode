package exInterface;

public class Moto implements Veiculo{
    @Override
    public void ligar(){
        System.out.println("A moto ligou");
    }
    public void acelerar(){
        System.out.println("A moto acelerou");
    }
}
