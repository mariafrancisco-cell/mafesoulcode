package aula13.exercicioHeranca;

public class Gerente extends Funcionario implements Notificavel, Exportavel{
    void aprovarFerias(String quem){
        System.out.printf("Aprovou férias de %s\n", quem);
    }

    @Override
    public void notificar() {
    }

    @Override
    public void exportar() {
        Exportavel.super.exportar();
    }
}
