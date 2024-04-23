package mnsg.src.main.mnsg;

public class MensagemVoz extends MensagemFactory {

    public MensagemVoz(Aplicativo app, Usuario usuario) {
        super(app, usuario);
    }

    @Override
    public String gerarConteudo(String conteudo) {
        return this.usuario.getUsername() + "[Mensagem de voz]: " + conteudo;
    }
    
}
