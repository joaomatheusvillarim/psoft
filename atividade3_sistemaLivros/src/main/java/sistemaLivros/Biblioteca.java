package sistemaLivros;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> acervo;
    private ArrayList<Usuario> usuarios;
    private int contagemUsuarios;

    public Biblioteca() {
        this.acervo = new ArrayList<Livro>();
        this.carregarAcervo();
        this.usuarios = new ArrayList<Usuario>();
        this.contagemUsuarios = 0;
    }

    private void carregarAcervo() {
        this.acervo.add(new Livro("O Estrangeiro", "Albert Camus", 0));
        this.acervo.add(new Livro("A Metamorfose", "Franz Kafka", 1));
        this.acervo.add(new Livro("O Capital", "Karl Marx", 2));
        this.acervo.add(new Livro("Capitães da Areia", "Jorge Amado", 3));
        this.acervo.add(new Livro("Viagem Solitária", "João W. Nery", 4));
        this.acervo.add(new Livro("Eu e Outras Poesias", "Augusto dos Anjos", 5));
        this.acervo.add(new Livro("Alguma Poesia", "Carlos Drummond de Andrade", 6));
    }

    public String getResultadosPesquisaLivro(String termoPesquisa) {
        String retorno = "Livro não existe no sistema!";
        if (this.pesquisaLivro(termoPesquisa).size() != 0) {
            retorno = "Livros disponíveis:\n" + this.elencarLivros(this.pesquisaLivro(termoPesquisa));
        }
        return retorno;
    }
    
    private ArrayList<Livro> pesquisaLivro(String termoPesquisa) {
        ArrayList<Livro> resultadosPesquisa = new ArrayList<Livro>();
        for (Livro livro : this.acervo) {
            if (livro.getTitulo().contains(termoPesquisa)) {
                resultadosPesquisa.add(livro);
            }
        }
        return resultadosPesquisa;
    }

    public ArrayList<Livro> getLivrosDisponiveis() {
        ArrayList<Livro> disponiveis = new ArrayList<Livro>();
        for (Livro livro : this.acervo) {
            if (livro.getDisponibilidade()) {
                disponiveis.add(livro);
            }
        }
        return disponiveis;
    }

    public String exibeLivrosDisponiveis() {
        return "Livros disponíveis:\n" + this.elencarLivros(this.getLivrosDisponiveis());
    }

    private String elencarLivros(ArrayList<Livro> lista) {
        int quantidade = lista.size();
        String retorno = "";
        for (int i = 0; i < quantidade; i++) {
            retorno += (i + 1) + ". " + lista.get(i).toString() + "\n";
        }
        return retorno.trim();
    }

    public void cadastraUsuario(String nomeUsuario) {
        Usuario novoUsuario = new Usuario(nomeUsuario, this.contagemUsuarios);
        this.usuarios.add(novoUsuario);
        this.contagemUsuarios++;
    }

    public void reservaLivro(Livro livro, int identificadorUsuario) {
        if (livro.getDisponibilidade()) {
            livro.alteraDisponibilidade();
            this.usuarios.get(identificadorUsuario).reservaLivro(livro);
        }
    }

    public String tentativaReservaLivro(int identificadorLivro, int identificadorUsuario) {
        Livro livro = this.acervo.get(identificadorLivro);
        String retorno = "Livro indisponível!";
        if (livro.getDisponibilidade()) {
            this.reservaLivro(livro, identificadorUsuario);
            retorno = "Livro reservado!";
        }
        return retorno;
    }
    
}
