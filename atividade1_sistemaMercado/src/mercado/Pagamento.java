package src.mercado;

public class Pagamento {
    
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public boolean pagar(double valorRecebido) {
        return valorRecebido == this.valor;
    }

}
