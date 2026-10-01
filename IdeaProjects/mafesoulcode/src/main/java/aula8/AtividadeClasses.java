package aula8;

public class AtividadeClasses {
    //1 — Na mesma classe do main, crie um método chamado mostrarBoasVindas() que imprime "Bem-vinda ao curso de Java!". Chame ele no main.
    static void boasVindas() {
        System.out.println("Bem-vinda ao curso de Java");
    }
    static void main() {
        boasVindas();

        //chamando o nome 3x
        classe.saudar("mafe");
        classe.saudar("flora");
        classe.saudar("cibele");

        //exercicio do dobro
        classe.dobro(2);
        classe.dobro(7);
        //exercicio da média
        classe.calcularMedia(1, 4);
        //exercicio maior de idade
        classe.ehMaiorDeIdade(8);
        //exercicio de somar
        classe.somar(2, 3);
        //exercicio de dois métodos
        classe.saudacao();
        classe.saudacao("mafe");
        }


}
