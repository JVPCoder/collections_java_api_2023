package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavras {
	private Set<String> palavras;

	public ConjuntoPalavras() {
		this.palavras = new HashSet<>();
	}
	
	public void adicionarPalavra(String palavra) {
		palavras.add(palavra);
	}
	
	public void removerPalavra(String palavra) {
		String convidadosRemover = null;
		
		for(String s : palavras) {
			if(palavra.equalsIgnoreCase(s)) {
				convidadosRemover = s;
				break;
			}
		}
		
		palavras.remove(convidadosRemover);
	}
	
	public void verificarPalavra(String palavra) {
		for(String s : palavras) {
			if(palavra.equalsIgnoreCase(s)) {
				System.out.println("A palavra existe no conjunto");
				break;
			}else {
				System.out.println("Nao existe no sistema");
			}
		}
	}
	
	public void exibirPalavrasUnicas() {
		System.out.println(this.palavras);
	}
	
	public static void main(String[] args) {
		ConjuntoPalavras conjunto = new ConjuntoPalavras();
		
		conjunto.adicionarPalavra("Palavra 1");
		conjunto.adicionarPalavra("Palavra 1");
		conjunto.adicionarPalavra("Palavra 2");
		conjunto.adicionarPalavra("Palavra 3");
		conjunto.adicionarPalavra("Palavra 4");
		
		conjunto.exibirPalavrasUnicas();
		
		conjunto.verificarPalavra("Palavra 5");
		conjunto.removerPalavra("Palavra 2");
		
		conjunto.exibirPalavrasUnicas();
	}

	@Override
	public int hashCode() {
		return Objects.hash(palavras);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConjuntoPalavras other = (ConjuntoPalavras) obj;
		return Objects.equals(palavras, other.palavras);
	}
	
	
	
}
