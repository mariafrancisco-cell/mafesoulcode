package aula13.exercicioHeranca;

public class Main {
    static void main(String[] args) {
        //1. Crie a classe Pessoa com os atributos nome e idade, e o método
        //   apresentar(), que imprime "Oi, sou [nome] e tenho [idade] anos."
        //
        //   Crie a classe Aluna que SÓ faz extends Pessoa, sem acrescentar nada.
        //
        //   Na Main, crie uma aluna, preencha nome e idade, e chame apresentar().
        //
        //   Repare: você não escreveu nome, idade nem apresentar() na Aluna,
        //   e os três funcionaram.
        Aluna aluna1 = new Aluna();
        aluna1.nome = "mafe";
        aluna1.idade = 18;
        aluna1.apresentar();
        //2. Acrescente na Aluna o atributo curso e o metodo estudar(), que
        //   imprime "[nome] está estudando [curso]."
        //
        //   Preencha os três atributos no objeto e chame os dois métodos.
        //
        //   Repare que o estudar() usa o nome, que veio da mãe.
        aluna1.curso = "Engenharia da Computação";
        aluna1.estudar();
        //3. Crie a classe Professora, também filha de Pessoa, com o atributo
        //   disciplina e o metodo lancarNota(String aluna, double nota), que
        //   imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
        //   com %.1f.
        //
        //      Na Main, crie uma aluna e uma professora, preencha os atributos de
        //   cada objeto e chame os métodos das duas.

        Aluna aluna2 = new Aluna();
        aluna2.nome = "Maria Fernanda";
        aluna2.idade = 18;
        Professora prof = new Professora();
        prof.nome = "Flora";
        prof.disciplina = "Programação";
        prof.lancarNota("Maria Fernanda", 9.99);

        //4. Na Professora, sobrescreva o apresentar() usando @Override, pra
        //   imprimir "Oi, sou [nome] e ensino [disciplina]."
        //
        //   Chame apresentar() na aluna e na professora e compare as saídas.
        aluna2.apresentar();
        prof.apresentar();

        //5. Faça uma cadeia de três níveis:
        //   - Funcionario, com o atributo nome e o metodo baterPonto()
        //   - Gerente extends Funcionario, com aprovarFerias(String quem)
        //   - Diretora extends Gerente, com definirMeta(String meta)
        //
        //   Na Main, crie uma Diretora, preencha o nome dela
        //   (carla.nome = "Carla";) e chame OS TRÊS métodos no mesmo objeto.
        //
        //   Herança em cadeia: ela tem tudo que vem de cima.
        Diretora dir = new Diretora();
        dir.nome = "Angélica";
        dir.aprovarFerias("Mafe");
        dir.definirMeta("100");

        //6. Crie duas interfaces:
        //   - Notificavel, com notificar(String mensagem)
        //   - Exportavel, com exportar()
        //
        //   Faça o Gerente do exercício 5 implementar as duas, SEM tirar o
        //   extends Funcionario:
        //
        //   class Gerente extends Funcionario implements Notificavel, Exportavel
        //
        //    Na Main, crie um gerente, preencha o nome e chame os quatro
        //   métodos nele: baterPonto(), aprovarFerias(), notificar()
        //   e exportar().
        Gerente ger = new Gerente();
        ger.nome = "hugo";
        ger.baterPonto();
        ger.aprovarFerias("Flora");
        ger.notificar("Mafe está de férias");
        ger.exportar();


    }


}
