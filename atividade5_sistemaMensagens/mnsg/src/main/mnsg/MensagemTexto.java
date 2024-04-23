package mnsg.src.main.mnsg;

public class MensagemTexto extends MensagemFactory {

    public MensagemTexto(Aplicativo app, Usuario usuario) {
        super(app, usuario);
    }

    @Override
    public String gerarConteudo(String conteudo) {
        return this.usuario.getUsername() + ": " + conteudo;
    }
    
}
