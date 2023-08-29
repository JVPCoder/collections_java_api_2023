package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	private List<Integer> numeros;

	public OrdenacaoNumeros() {
		this.numeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		numeros.add(numero);
	}
	
	public List<Integer> ordenarAscendente() {
		List<Integer> numerosAsc = new ArrayList<>(this.numeros);
		
		Collections.sort(numerosAsc);
		
		return numerosAsc;
		
	}
	
	public List<Integer> ordenarDescendente() {
		List<Integer> numerosDesc = new ArrayList<>(this.numeros);
		
		numerosDesc.sort(Collections.reverseOrder());
		
		return numerosDesc;
	}
	
	public void exibirNumeros() {
		
		System.out.println(this.numeros);
		
	}
	
	public static void main(String[] args) {
		OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();
		
		ordenacao.adicionarNumero(2);
		ordenacao.adicionarNumero(1);
		ordenacao.adicionarNumero(6);
		ordenacao.adicionarNumero(3);
		ordenacao.adicionarNumero(0);
		ordenacao.adicionarNumero(52);
		
		ordenacao.exibirNumeros();
	
		System.out.println(ordenacao.ordenarAscendente());
		
		ordenacao.exibirNumeros();
		
		System.out.println(ordenacao.ordenarDescendente());
		
		ordenacao.exibirNumeros();
	}
	
}
