package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	private Map<String, Integer> contagemSet;

	public ContagemPalavras() {
		this.contagemSet = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, Integer contagem) {
		contagemSet.put(palavra, contagem);
	}
	
	public void removerPalavra(String palavra) {
		
		if(!contagemSet.isEmpty()) {
			contagemSet.remove(palavra);
		}
	}
	
	 public int exibirContagemPalavras() {
		    int contagemTotal = 0;
		    for (int contagem : contagemSet.values()) {
		      contagemTotal += contagem;
		    }
		    return contagemTotal;
		  }
	
}
