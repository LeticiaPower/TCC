package br.com.siscarros.app.service;

import java.util.List;

import br.com.siscarros.app.entities.dto.CategoriaDTO;

public interface CrudService<T, K> {

	T Cadastra (T t);
	
	T Altera (T t);
	
	void Deleta (Long id);
	
	List<T> ListaTodos (); 
	
	T BuscaPorId (K id);
	
	
	
}
