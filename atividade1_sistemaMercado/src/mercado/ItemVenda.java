package src.mercado;

public class ItemVenda {
    
    private Produto produto;
    private int quantidade;

    public ItemVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    private double calcularPrecoUnitario() {
        double valor = this.produto.getPreco();
        if (this.quantidade >= 100) { //desconto aplicado
            valor *= 0.9;
        }
        return valor;
    }

    public double getSubTotal() {
        double precoUnitario = this.calcularPrecoUnitario();
        return precoUnitario * this.quantidade;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void alterarQuantidade(int valor) {
        this.quantidade = valor;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

}
