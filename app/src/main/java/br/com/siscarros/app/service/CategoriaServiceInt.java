package br.com.siscarros.app.service;

import java.util.List;

import br.com.siscarros.app.entities.Categoria;

public interface CategoriaService {
	
	Categoria CadastraCategoria (Categoria categ);
	
	List<Categoria> ListaCategoria();

}
