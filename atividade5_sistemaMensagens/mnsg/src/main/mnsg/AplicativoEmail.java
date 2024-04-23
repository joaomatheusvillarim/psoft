package mnsg.src.main.mnsg;

public class AplicativoEmail implements Aplicativo {

    @Override
    public String enviarMensagem(String conteudo) {
        return "[E-Mail] " + conteudo;
    }
    
}
