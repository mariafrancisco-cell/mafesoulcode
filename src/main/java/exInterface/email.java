package exInterface;

public class email implements Notificacao {
    @Override
    public void enviarMensagem() {
        System.out.println(" E-mail enviado: Sua compra foi aprovada!");
    }
}
