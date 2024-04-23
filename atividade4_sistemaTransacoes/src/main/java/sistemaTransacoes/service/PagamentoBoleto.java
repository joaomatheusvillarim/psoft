package sistemaTransacoes.service;

public class PagamentoBoleto extends Pagamento{

    private static final double FATOR = 0.95;

    @Override
    public void checarValores() {
        System.out.println("Checando chave Boleto do destinatário.");
    }

    @Override
    public double fazerPagamento(double valorInicial) {
        double valorFinal = FATOR * valorInicial;
        System.out.println("Realizando pagamento via Boleto. Valor da compra = " + valorFinal);
        return valorFinal;
    }

    @Override
    public void atualizarValores() {
        System.out.println("Realizando agendamento para atualização do saldo.");
    }
    
}
