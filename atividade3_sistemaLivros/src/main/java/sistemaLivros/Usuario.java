package sistemaLivros;

import java.util.ArrayList;

public class Usuario {

    private String nome;
    private int id;
    private ArrayList<Livro> reservas;
    
    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.reservas = new ArrayList<Livro>();
    }

    public String toString() {
        return this.id + " - " + this.nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void reservaLivro(Livro livro) {
        this.reservas.add(livro);
    }
    
}
