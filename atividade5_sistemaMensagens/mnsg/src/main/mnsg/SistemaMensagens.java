package mnsg.src.main.mnsg;

import java.util.HashMap;

public class SistemaMensagens {

    private HashMap<String, Usuario> usuarios;

    public SistemaMensagens() {
        this.usuarios = new HashMap<String, Usuario>();
    }

    public static void main(String[] args) {
        SistemaMensagens sistema = new SistemaMensagens();
        sistema.criarUsuario("Joao");
        sistema.criarUsuario("Matheus");
        sistema.gerarMensagem("Joao", "Matheus", "Email", "Texto", 
        "Oi! Me manda um sms pra eu salvar teu numero!");
        sistema.exibirMensagens("Matheus");
        sistema.gerarMensagem("Matheus", "Joao", "Sms", "Voz", 
        "Oi! Joao aqui! Salva ai meu numero e depois fala comigo no Slack!");
        sistema.exibirMensagens("Joao");
        sistema.gerarMensagem("Joao", "Matheus", "Slack", "Imagem", 
        "Oiii você esqueceu de me bloquear no Slack");
        sistema.exibirMensagens("Matheus");
    }

    private void criarUsuario(String username) {
        Usuario novoUsuario = new Usuario(username);
        this.usuarios.put(username, novoUsuario);
    }

    private Usuario getUsuarioByUsername(String username) {
        return this.usuarios.get(username);
    }

    private void gerarMensagem(String usuario, String destinatario, String aplicativo, String tipo, String conteudo) {
        MensagemFactory msg = Util.selectTypeAndApp(aplicativo, tipo, getUsuarioByUsername(usuario));
        enviarMensagem(msg.gerarMensagem(conteudo), destinatario);
    }

    private void enviarMensagem(String conteudo, String destinatario) {
        getUsuarioByUsername(destinatario).receberMensagem(conteudo);
    }

    private void exibirMensagens(String username) {
        this.usuarios.get(username).exibirMensagens();
    }
    
}
