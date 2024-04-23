package sistemaTransacoes;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sistemaTransacoes.service.PagamentoService;

public class PagamentoServiceTest {

    private PagamentoService pagamentoService;

    @Before
    public void setup() {
        pagamentoService = new PagamentoService();
    }

    @Test
    public void processarPagamentoDebitoTest() {
        double valorFinal = pagamentoService.processarPagamento("DEBITO", 10);
        Assert.assertEquals(valorFinal, 10, 0);
    }
    
    @Test
    public void processarPagamentoCreditoTest() {
        double valorFinal = pagamentoService.processarPagamento("CREDITO", 20);
        Assert.assertEquals(valorFinal, 22, 0);
    }

    @Test
    public void processarPagamentoPixTest() {
        double valorFinal = pagamentoService.processarPagamento("PIX", 30);
        Assert.assertEquals(valorFinal, 27, 0);
    }

    @Test
    public void processarPagamentoBoletoTest() {
        double valorFinal = pagamentoService.processarPagamento("BOLETO", 40);
        Assert.assertEquals(valorFinal, 38, 0);
    }

    @SuppressWarnings("unused")
    @Test(expected = IllegalArgumentException.class)
    public void processarPagamentoInvalido() {
        double valorFinal = pagamentoService.processarPagamento("DINHEIRO", 50);
    }
    

}
