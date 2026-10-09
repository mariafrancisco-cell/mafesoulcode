package exInterface;
import java.util.ArrayList;
public class Main {
    static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.emitirSom();

        Animal bidu = new Cachorro();
        Animal salem = new Gato();

        bidu.emitirSom();
        salem.emitirSom();
        //ArrayList
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        for(Animal animal : animais){
            animal.emitirSom();
        }

        //ArrayList do ex 4
        ArrayList<Notificacao> mensagens = new ArrayList<>();
        mensagens.add(new email());
        mensagens.add(new SMS());
        for(Notificacao mensagem : mensagens){
            mensagem.enviarMensagem();
        }
        //Array list ex 5
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro());
        veiculos.add(new Moto());
        for(Veiculo veiculo:veiculos){
            veiculo.ligar();
            veiculo.acelerar();
        }
    }
}
