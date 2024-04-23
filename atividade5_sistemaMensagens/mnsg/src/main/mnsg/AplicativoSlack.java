package mnsg.src.main.mnsg;

public class AplicativoSlack implements Aplicativo {

    @Override
    public String enviarMensagem(String conteudo) {
        return "[Slack] " + conteudo;
    }
    
}
