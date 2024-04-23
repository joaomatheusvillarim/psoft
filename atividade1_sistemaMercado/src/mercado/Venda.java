package src.mercado;

import java.util.ArrayList;

public class Venda {

    //atributos

    private ArrayList<ItemVenda> itens;
    
    //construtores

    public Venda() {
        this.itens = new ArrayList<ItemVenda>();
    }

    //métodos

    public void adicionarItem(Produto produto, int quantidade) {
        ItemVenda novoItem = new ItemVenda(produto, quantidade);
        this.itens.add(novoItem);
    }

    public double getTotal() {
        double total = 0;
        for (ItemVenda i : this.itens) {
            total += i.getSubTotal();
        }
        return total;
    }

    public boolean fazerPagamento(double valorRecebido) {
        Pagamento p = new Pagamento(this.getTotal());
        return p.pagar(valorRecebido);
    }

    private ItemVenda getItemVendaByProduto(Produto produto) {
        ItemVenda item = new ItemVenda(new Produto("", 0), 0);
        for (ItemVenda i : this.itens) {
            if (i.getProduto().equals(produto)) {
                item = i;
                break;
            }
        }
        return item;
    }

    public boolean removerItem(Produto produto) {
        return this.itens.remove(getItemVendaByProduto(produto));
    }

    public void alterarItem(Produto produto, int quantidade) {
        //implementar
    }

    public String toString() {
        String retorno = "";
        for (int i = 0; i < this.itens.size(); i++) {
            retorno += Integer.toString(i+1) + " - " + this.itens.get(i).getProduto().getNomeDoProduto()
                + ": " + this.itens.get(i).getProduto().getPreco() + this.itens.get(i).getQuantidade()
                + " = " + this.itens.get(i).getSubTotal();
        }
        return retorno;
    }

}
