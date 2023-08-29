package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	List <Integer> numeros;

	public SomaNumeros() {
		this.numeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		numeros.add(numero);
	}
	
	public int calcularSoma() {
		int soma = 0;
		if(!numeros.isEmpty()) {
		
		
		
		for(Integer n : numeros) {
			soma += n;
		}
		
		
		}
		return soma;
	}
	
	public int encontrarMaiorNumero() {
		int maior = Integer.MIN_VALUE;
		
		if(!numeros.isEmpty()) {
			for(Integer n : numeros) {
				if(n >= maior) {
					maior = n;
				}
			}
		}
		
		return maior;
	}
	
	public int encontrarMenorNumero() {
		int menor = Integer.MAX_VALUE;
		
		if(!numeros.isEmpty()) {
			for(Integer n : numeros) {
				if(n <= menor) {
					menor = n;
				}
			}
		}
		
		return menor;
	}
	
	public void exibirNumeros() {
		if(!numeros.isEmpty()) {
			System.out.println(this.numeros);
		}else {
			System.out.println("Lista vazia");
		}
	}
	
	
	public static void main(String[] args) {
		SomaNumeros somaNumeros = new SomaNumeros();
		
		somaNumeros.adicionarNumero(1);
		somaNumeros.adicionarNumero(0);
		somaNumeros.adicionarNumero(10);
		somaNumeros.adicionarNumero(0);
		somaNumeros.adicionarNumero(2);
		
		System.out.println("Numeros add:");
		somaNumeros.exibirNumeros();
		
		System.out.println("Soma geral = " + somaNumeros.calcularSoma());
		
		System.out.println("Maior num = " + somaNumeros.encontrarMaiorNumero());
		
		System.out.println("Menor num = " + somaNumeros.encontrarMenorNumero());
	}
	
	
}
