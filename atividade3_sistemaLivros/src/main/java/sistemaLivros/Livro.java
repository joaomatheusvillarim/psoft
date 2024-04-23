package sistemaLivros;

public class Livro {

    private String titulo;
    private String autor;
    private boolean disponivel;
    private int identificador;

    public Livro(String titulo, String autor, int id) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
        this.identificador = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String toString() {
        return this.titulo + " - " + this.autor;
    }

    public void alteraDisponibilidade() {
        this.disponivel = !this.disponivel;
    }

    public boolean getDisponibilidade() {
        return this.disponivel;
    }

    public int getIdentificador() {
        return this.identificador;
    }
    
}
