package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> mapContato;

	public AgendaContatos() {
		this.mapContato = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		mapContato.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!mapContato.isEmpty()) {
			mapContato.remove(nome);
		}
	}
	
	public void exibirContato() {
		System.out.println(mapContato);
	}
	
	public Integer pesquisarPorNome(String Nome) {
		Integer numNome = null;
		
		if(!mapContato.isEmpty()) {
			numNome = mapContato.get(Nome);
		}
		
		return numNome;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();

	    // Adicionar contatos
	    agendaContatos.adicionarContato("Camila", 123456);
	    agendaContatos.adicionarContato("João", 5665);
	    agendaContatos.adicionarContato("Carlos", 1111111);
	    agendaContatos.adicionarContato("Ana", 654987);
	    agendaContatos.adicionarContato("Maria", 1111111);
	    agendaContatos.adicionarContato("Camila", 44444);

	    agendaContatos.exibirContato();

	    // Remover um contato
	    agendaContatos.removerContato("Maria");
	    agendaContatos.exibirContato();

	    // Pesquisar número por nome
	    String nomePesquisa = "João";
	    Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
	    System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

	    String nomePesquisaNaoExistente = "Paula";
	    Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
	    System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
	}
	
}
