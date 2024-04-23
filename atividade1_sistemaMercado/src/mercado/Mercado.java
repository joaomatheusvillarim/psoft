package src.mercado;

import java.util.ArrayList;
import java.util.Scanner;

public class Mercado {

    private ArrayList<Venda> historicoVendas;

    public Mercado() {
        this.historicoVendas = new ArrayList<Venda>();
    }

    //métodos

    //create

    public Venda iniciarNovaVenda() {
        Venda novaVenda = new Venda();
        return novaVenda;
    }
    
    //read
    public String estadoParcialDaVenda(Venda venda) {
        System.out.println(venda.toString());
    }
    
    //update
    
    public void adicionarItemNaVenda(Venda venda, Produto produto, int quantidade) {
        venda.adicionarItem(produto, quantidade);
    }

    public void alterarItemNaVenda(Venda venda, Produto produto, int quantidade) {
        venda.alterarItem(produto, quantidade);
    }

    //delete

    public void removerItemDaVenda(Venda venda, Produto produto) {
        venda.removerItem(produto);
    }


    public void finalizarVenda(Venda venda, Scanner sc) {
        double valorRecebido = Double.parseDouble(sc.nextLine());
        if (venda.fazerPagamento(valorRecebido)) {
            this.historicoVendas.add(venda);
        }
    }

    private static String menu(Scanner sc) {
        System.out.println(
				"\n---\nMENU\n" + 
						"(A)dicionar item\n" + 
						"(M)udar quantidade de item\n" + 
						"(R)emover item\n" + 
						"(F)azer pagamento\n" +
						"(C)ancelar venda\n" +
						"(S)air\n" + 
						"\n" + 
						"Opção> ");
		return sc.nextLine().trim().toUpperCase();
    }


    public static void main(String[] args) {
        Mercado mercado = new Mercado();
        Scanner sc = new Scanner(System.in);
        String escolha;
        while (true) {
			escolha = menu(sc);
			comando(escolha, mercado, sc);
		}
    }

    private static void comando(String opcao, Mercado mercado, Scanner scanner) {
		switch (opcao) {
		case "A":
            adicionarItemNaVenda()
			break;
		case "M":
			alterarItemNaVenda()
			break;
		case "R":
			removerItemDaVenda()
			break;
		case "F":
			finalizarVenda()
			break;
		case "S":
            sai();
            break;
		default:
			System.out.println("Opção inválida!");
		}
	}

    private static void sai() {
		System.exit(0);
	}

}