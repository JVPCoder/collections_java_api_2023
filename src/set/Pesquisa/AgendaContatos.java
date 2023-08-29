package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contato> agendaSet;

	public AgendaContatos() {
		this.agendaSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		agendaSet.add(new Contato(nome,numero));
	}
	
	public void exibirContatos() {
		System.out.println(agendaSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatosNome = new HashSet<>();
		
		for(Contato c : agendaSet) {
			if(c.getNome().startsWith(nome)) {
				contatosNome.add(c);
			}
		}
		
		return contatosNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		
		for(Contato c : agendaSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		
		return contatoAtualizado;
	}
	
	public static void main(String[] args) {
		AgendaContatos agenda = new AgendaContatos();
		
		agenda.adicionarContato("Joao Vitor", 123);
		agenda.adicionarContato("Paulo", 1515);
		agenda.adicionarContato("Joao Andre", 321321);
		
		agenda.exibirContatos();
		
		System.out.println(agenda.pesquisarPorNome("Joao"));
		
		agenda.atualizarNumeroContato("Joao Vitor", 996);
		
		agenda.exibirContatos();
	}
}
