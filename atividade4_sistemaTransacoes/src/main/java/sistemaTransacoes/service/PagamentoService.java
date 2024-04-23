package sistemaTransacoes.service;

public class PagamentoService {

    public double processarPagamento(String metodoDePagamento, double valor) {
        Pagamento pagamento = PagamentoSelector.selecionarMetodo(metodoDePagamento);
        return pagamento.processarPagamento(valor);
    }

}
