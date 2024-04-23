package sistemaTransacoes.service;

public class PagamentoCredito extends Pagamento {

    private static final double FATOR = 1.1;

    @Override
    public void checarValores() {
        System.out.println("Checando limite de crédito do usurário");
    }

    @Override
    public double fazerPagamento(double valorInicial) {
        double valorFinal = FATOR * valorInicial;
        System.out.println("Realizando pagamento via cartão de crédito. Valor da compra = " + valorFinal);
        return valorFinal;
    }

    @Override
    public void atualizarValores() {
        System.out.println("Realizando atualização do limite de crédito.");
    }
    
}
