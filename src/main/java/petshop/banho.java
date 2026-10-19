package petshop;

public class banho implements  Servico{
        @Override
        public void executar(String nomepet){
            System.out.println("Dando banho em " + nomepet);
        }


}
