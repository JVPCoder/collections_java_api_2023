package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> carrinhocompra;

	public CarrinhoDeCompras() {
		this.carrinhocompra = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome,preco,quantidade);
		this.carrinhocompra.add(item);
	}
	
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		if(!carrinhocompra.isEmpty()) {
			for(Item t : carrinhocompra) {
				if(t.getNome().equalsIgnoreCase(nome)) {
					itensParaRemover.add(t);
				}
			}
			carrinhocompra.removeAll(itensParaRemover);
			}else {
				System.out.println("Carrinho Vazio!");
			}
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0d;
		if(!carrinhocompra.isEmpty()) {
			for(Item item : carrinhocompra) {
				double valorItem = item.getPreco() * item.getQuantidade();
				valorTotal += valorItem;
			}
			return valorTotal;
		}else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public void exibirItens() {
		if(!carrinhocompra.isEmpty()) {
			System.out.println(this.carrinhocompra);
		}else {
			System.out.println("Carrinho Vazio !");
		}
	}

	@Override
	  public String toString() {
	    return "CarrinhoDeCompras{" +
	        "itens=" + carrinhocompra +
	        '}';
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adicionarItem("Caneta", 2d, 2);
		carrinhoDeCompras.adicionarItem("Lapiseira", 5d, 1);
		carrinhoDeCompras.adicionarItem("Bolsa", 50d, 1);
		carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);
		
		carrinhoDeCompras.exibirItens();
		
		carrinhoDeCompras.removerItem("Caneta");
		carrinhoDeCompras.exibirItens();
		
		System.out.println("O valor total é : " + carrinhoDeCompras.calcularValorTotal());
	}	
}

