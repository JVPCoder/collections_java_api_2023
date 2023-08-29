package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
	private List <Pessoa> pessoaList;

	public OrdenacaoPessoa() {
		this.pessoaList = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		
		Collections.sort(pessoasPorIdade);
		
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
		
		Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
		
		return pessoaPorAltura;
	}
	
	public static void main(String[] args) {
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		ordenacaoPessoa.adicionarPessoa("Nome 1", 15, 1.60);
		ordenacaoPessoa.adicionarPessoa("Nome 2", 60, 1.57);
		ordenacaoPessoa.adicionarPessoa("Nome 3", 10, 1.45);
		ordenacaoPessoa.adicionarPessoa("Nome 4", 20, 1.80);
		ordenacaoPessoa.adicionarPessoa("Nome 5", 5, 1.20);
		
		System.out.println(ordenacaoPessoa.ordenarPorIdade());
		System.out.println(ordenacaoPessoa.ordenarPorAltura());
	}
	
}
