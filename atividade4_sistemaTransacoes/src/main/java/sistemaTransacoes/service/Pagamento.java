package sistemaTransacoes.service;

public abstract class Pagamento {

    public final double processarPagamento(double valorInicial) {
        checarValores();
        realizarVerificacoes();
        double valorFinal = fazerPagamento(valorInicial);
        atualizarValores();
        notificarCompraConcluida();
        return valorFinal;
    }

    public abstract void checarValores();

    public void realizarVerificacoes() {
        System.out.println("Realizando verificações de segurança.");
    }
    
    public abstract double fazerPagamento(double valorInicial);

    public abstract void atualizarValores();

    public void notificarCompraConcluida() {
        System.out.println("Notifica compra concluída.");
    }

}
