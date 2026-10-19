package aula13.atvpolimorfismo;

import aula15.Pagamento;

public class Main {
    static void main(String[] args) {
        Calculadora cal = new Calculadora();
        cal.CalcularArea(2.1);
        cal.CalcularArea(3);
        cal.CalcularArea(3.2, 3.6);

        painel pa = new painel();
        pa.ExibirPainel(true);
        pa.ExibirPainel(2);
        pa.ExibirPainel("eu");
        pa.ExibirPainel(2.14);

        //ex 3
        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 30;
        flora.especializacao = "Java e IA";
        flora.apresentar("professora");

        Aluna mafe = new Aluna();
        mafe.nome = "Maria Fernanda";
        mafe.idade = 18;

        flora.lancarNota("mafee", 9.99);

        //ex4
        Estagiaria est = new Estagiaria();
        est.nome = "mafee";
        est.idade = 12;
        est.apresentar();


        Aluna mafee = new Aluna();
        mafee.nome = "Maria Fernanda";
        mafee.idade = 18;
        Estagiaria ana = new Estagiaria();
        ana.nome = "Ana Banana";
        ana.idade = 20;
        Professora floraa = new Professora();
        floraa.idade = 30;
        floraa.nome = "Flora";

        mostrarFicha(floraa);
        mostrarFicha(ana);
        mostrarFicha(mafee);

    //6
      MeioDePagamento forma;
      forma = new Pix();
      forma.pagar(23.48);
      forma = new Boleto();
      forma.pagar(56.902);

    }
    //5
    static void mostrarFicha(Pessoa p){
        p.apresentar();

    }

}
