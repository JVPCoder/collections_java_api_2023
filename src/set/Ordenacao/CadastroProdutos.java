package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> produtoSet;

	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(nome, cod, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
		
		return produtoPorNome;
	}
	
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtoPorPreco.addAll(produtoSet);
		
		return produtoPorPreco;
	}
	
	public static void main(String[] args) {
		CadastroProdutos cadastro = new CadastroProdutos();
		
		cadastro.adicionarProduto(1L, "Leite", 5.5, 5);
		cadastro.adicionarProduto(2L, "Café", 12, 2);
		cadastro.adicionarProduto(1L, "Chocolate", 3.5, 10);
		cadastro.adicionarProduto(9L, "Bolacha", 2.5, 20);
		
		
		
		System.out.println(cadastro.produtoSet);
		
		System.out.println(cadastro.exibirProdutosPorNome());
		System.out.println(cadastro.exibirProdutosPorPreco());
	}
}
