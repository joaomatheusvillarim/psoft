package sistemaTransacoes;

import sistemaTransacoes.service.PagamentoService;

public class Main {
    public static void main(String[] args) {

        PagamentoService pagamentoService = new PagamentoService();

        pagamentoService.processarPagamento("DEBITO", 500);
        System.out.println("============================================");
        pagamentoService.processarPagamento("CREDITO", 1122);
        System.out.println("============================================");
        pagamentoService.processarPagamento("PIX", 600);
        System.out.println("============================================");
        pagamentoService.processarPagamento("BOLETO", 160);
        System.out.println("============================================");
    }
}