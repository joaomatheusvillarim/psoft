package mnsg.src.main.mnsg;

public class Util {
    
    public static MensagemFactory selectTypeAndApp(String aplicativo, String tipo, Usuario usuario) {
        Aplicativo app;
        switch (aplicativo) {
            case "Email":
                app = new AplicativoEmail();
                break;
            case "Slack":
                app = new AplicativoSlack();
                break;
            case "Sms":
                app = new AplicativoSms();
                break;
            default:
                throw new IllegalArgumentException("Aplicativo invalido");
        }

        MensagemFactory msg;
        switch (tipo) {
            case "Imagem":
                msg = new MensagemImagem(app, usuario);
                break;
            case "Texto":
                msg = new MensagemTexto(app, usuario);
                break;
            case "Voz":
                msg = new MensagemVoz(app, usuario);
                break;
            default:
                throw new IllegalArgumentException("Tipo de mensagem invalido");
        }

        return msg;
    }

}
