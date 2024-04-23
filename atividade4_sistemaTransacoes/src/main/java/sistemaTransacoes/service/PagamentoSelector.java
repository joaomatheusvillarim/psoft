package sistemaTransacoes.service;

public class PagamentoSelector {
    
    public static Pagamento selecionarMetodo(String metodoDePagamento) {
        Pagamento pagamento;
        switch (metodoDePagamento) {
            case "DEBITO":
                pagamento = new PagamentoDebito();
                break;
            case "CREDITO":
                pagamento = new PagamentoCredito();
                break;
            case "PIX":
                pagamento = new PagamentoPix();
                break;
            case "BOLETO":
                pagamento = new PagamentoBoleto();
                break;
            default:
                throw new IllegalArgumentException("Metodo de pagamento invalido: " + metodoDePagamento);
        }
        return pagamento;
    }

}
