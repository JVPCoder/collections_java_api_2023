package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> livrolist;

	public CatalogoLivros() {
		this.livrolist = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livrolist.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		
		if(!livrolist.isEmpty()) {
			for(Livro l : livrolist) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}		
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervalo = new ArrayList<>();
		if(!livrolist.isEmpty()) {
			for(Livro l : livrolist) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervalo.add(l);
				}
			}
		}
		return livrosPorIntervalo;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		
		if(!livrolist.isEmpty()) {
			for(Livro l : livrolist) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		
		return livroPorTitulo;
	}
	
	public static void main(String[] args) {
		CatalogoLivros catalogolivros =  new CatalogoLivros();
		catalogolivros.adicionarLivro("Livro 1", "Autor 1", 2020);
		catalogolivros.adicionarLivro("Livro 1", "Autor 2", 2021);
		catalogolivros.adicionarLivro("Livro 2", "Autor 2", 2022);
		catalogolivros.adicionarLivro("Livro 3", "Autor 3", 2023);
		catalogolivros.adicionarLivro("Livro 4", "Autor 4", 1994);
		
		System.out.println(catalogolivros.pesquisarPorAutor("Autor 2"));
		System.out.println(catalogolivros.pesquisarPorIntervaloAnos(2020, 2022));
		System.out.println(catalogolivros.pesquisarPorTitulo("Livro 1"));
		
	}
	
}
