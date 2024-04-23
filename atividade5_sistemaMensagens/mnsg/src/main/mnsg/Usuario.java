package mnsg.src.main.mnsg;

import java.util.ArrayList;

public class Usuario {

    private String username;

    private ArrayList<String> mensagensRecebidas;

    public Usuario(String username) {
        this.username = username;
        this.mensagensRecebidas = new ArrayList<String>();
    }

    public String getUsername() {
        return this.username;
    }

    public void receberMensagem(String mensagem) {
        this.mensagensRecebidas.add(mensagem);
    }

    public void exibirMensagens() {
        for (String msg : this.mensagensRecebidas) {
            System.out.println(msg);
        }
    }

}
