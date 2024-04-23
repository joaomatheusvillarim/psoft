package mnsg.src.main.mnsg;

public class AplicativoSms implements Aplicativo {

    @Override
    public String enviarMensagem(String conteudo) {
        return "[Sms] " + conteudo;
    }
    
}
