package sistemaTransacoes.service;

public class PagamentoDebito extends Pagamento {

    private static final double FATOR = 1;

    @Override
    public void checarValores() {
        System.out.println("Checando saldo da conta do usurário.");
    }

    @Override
    public double fazerPagamento(double valorInicial) {
        double valorFinal = FATOR * valorInicial;
        System.out.println("Realizando pagamento via cartão de débito. Valor da compra = " + valorFinal);
        return valorFinal;
    }

    @Override
    public void atualizarValores() {
        System.out.println("Realizando atualização do saldo da conta.");
    }

}
