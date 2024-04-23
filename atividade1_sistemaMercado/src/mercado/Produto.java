package src.mercado;

public class Produto {
    
    private String nomeDoProduto;
    private double preco;

    public Produto(String nome, double valor) {
        this.nomeDoProduto = nome;
        this.preco = valor;
    }

    public String getNomeDoProduto() {
        return this.nomeDoProduto;
    }

    public double getPreco() {
        return this.preco;
    }

}
