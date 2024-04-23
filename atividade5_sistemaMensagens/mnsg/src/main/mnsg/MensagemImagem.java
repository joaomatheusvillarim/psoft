package mnsg.src.main.mnsg;

public class MensagemImagem extends MensagemFactory {

    public MensagemImagem(Aplicativo app, Usuario usuario) {
        super(app, usuario);
    }

    @Override
    public String gerarConteudo(String conteudo) {
        return this.usuario.getUsername() + "[Imagem]: " + conteudo;
    }
    
}
