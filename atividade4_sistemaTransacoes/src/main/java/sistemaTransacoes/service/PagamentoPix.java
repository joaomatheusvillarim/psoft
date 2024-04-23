package sistemaTransacoes.service;

public class PagamentoPix extends Pagamento {

    private static final double FATOR = 0.9;

    @Override
    public void checarValores() {
        System.out.println("Checando chave PIX do destinatário.");
    }

    @Override
    public double fazerPagamento(double valorInicial) {
        double valorFinal = FATOR * valorInicial;
        System.out.println("Realizando pagamento via PIX. Valor da compra = " + valorFinal);
        return valorFinal;
    }

    @Override
    public void atualizarValores() {
        System.out.println("Realizando atualização do saldo da conta.");
    }
    
}
