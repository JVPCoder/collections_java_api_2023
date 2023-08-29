package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	private Set<Tarefa> listaSet;

	public ListaTarefas() {
		this.listaSet = new HashSet<>();
	}
	
	public void adicionarTarefa(String descricao) {
		listaSet.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		Tarefa tarefaRemover = null;
		
		for(Tarefa t : listaSet) {
			if(t.getDesc().equalsIgnoreCase(descricao)) {
				tarefaRemover = t;
				break;
			}
		}
		
		listaSet.remove(tarefaRemover);
	}
	
	public void exibirTarefas() {
		System.out.println(listaSet);
	}
	
	public int contarTarefas() {
		return listaSet.size();
	}
	
	public Set<Tarefa> obterTarefasConcluidas(){
		Set<Tarefa> concluidas = new HashSet<>();
		
		for(Tarefa t : listaSet) {
			if(t.isFeito()) {
				concluidas.add(t);
			}
		}
		
		return concluidas;
	}
	
	public Set<Tarefa> obterTarefasPendentes(){
		Set<Tarefa> pendentes = new HashSet<>();
		
		for(Tarefa t : listaSet) {
			if(!t.isFeito()) {
				pendentes.add(t);
			}
		}
		
		return pendentes;
	}
	
	public void marcarTarefaConcluida(String descricao) {
		for(Tarefa t : listaSet) {
			if(t.getDesc().equalsIgnoreCase(descricao)) {
				t.setFeito(true);
			}
		}
	}
	
	public void marcarTarefaPendente(String descricao) {
		for(Tarefa t : listaSet) {
			if(t.getDesc().equalsIgnoreCase(descricao)) {
				t.setFeito(false);
			}
		}
	}
	
	public void limparListaTarefas() {
		listaSet.clear();
	}
	
	public static void main(String[] args) {
	    // Criando uma instância da classe ListaTarefas
	    ListaTarefas listaTarefas = new ListaTarefas();

	    // Adicionando tarefas à lista
	    listaTarefas.adicionarTarefa("Estudar Java");
	    listaTarefas.adicionarTarefa("Fazer exercícios físicos");
	    listaTarefas.adicionarTarefa("Ler livro");
	    listaTarefas.adicionarTarefa("Preparar apresentação");

	    // Exibindo as tarefas na lista
	    listaTarefas.exibirTarefas();

	    // Removendo uma tarefa
	    listaTarefas.removerTarefa("Fazer exercícios físicos");
	    listaTarefas.exibirTarefas();

	    // Contando o número de tarefas na lista
	    System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

	    // Obtendo tarefas concluídas
	    System.out.println(listaTarefas.obterTarefasConcluidas());

	    // Obtendo tarefas pendentes
	    System.out.println(listaTarefas.obterTarefasPendentes());

	    // Marcando tarefas como concluídas
	    listaTarefas.marcarTarefaConcluida("Ler livro");
	    listaTarefas.marcarTarefaConcluida("Estudar Java");
	    listaTarefas.exibirTarefas();

	    // Marcando tarefas como pendentes
	    listaTarefas.marcarTarefaPendente("Estudar Java");
	    listaTarefas.exibirTarefas();

	    // Limpando a lista de tarefas
	    listaTarefas.limparListaTarefas();
	    listaTarefas.exibirTarefas();
	  }
	
}
