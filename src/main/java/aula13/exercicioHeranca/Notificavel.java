package aula13.exercicioHeranca;

public interface Notificavel {
    default void notificar(String mensagem){
        System.out.println("Notificação: " + mensagem);
    }
}
