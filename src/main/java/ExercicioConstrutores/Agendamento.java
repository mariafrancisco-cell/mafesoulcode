package ExercicioConstrutores;

public class Agendamento {
    private String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    private String observacao;
    private double desconto;

    public Agendamento(String nomePet, String servico, String horario, boolean perfume, boolean laco, boolean hidratacao, String observacao, double desconto){
        this.nomePet = nomePet;
        this.servico = servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.hidratacao = hidratacao;
        this.observacao = observacao;
        this.desconto = desconto;
    }

    public void mostrar(){
        System.out.println(nomePet);
        System.out.println(servico);
        System.out.println(horario);
        System.out.println(perfume);
        System.out.println(laco);
        System.out.println(hidratacao);
        System.out.println(observacao);
        System.out.println(desconto);
    }
}
