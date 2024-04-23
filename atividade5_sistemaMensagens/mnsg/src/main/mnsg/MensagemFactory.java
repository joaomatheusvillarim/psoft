package mnsg.src.main.mnsg;

public abstract class MensagemFactory {

    protected Aplicativo app;

    protected Usuario usuario;

    public MensagemFactory(Aplicativo app, Usuario usuario) {
        this.app = app;
        this.usuario = usuario;
    }

    public void setAplicativo(Aplicativo app) {
        this.app = app;
    }

    public final String gerarMensagem(String conteudo) {
        String conteudoGerado = gerarConteudo(conteudo);
        return this.app.enviarMensagem(conteudoGerado);
    }

    public abstract String gerarConteudo(String conteudo);

}
