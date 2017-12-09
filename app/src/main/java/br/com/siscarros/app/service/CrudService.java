package br.com.siscarros.app.service;

import java.util.List;

public interface CrudService<T, K> {

	T Cadastra (T t);
	
	T Altera (T t);
	
	void Deleta (K id);
	
	List<T> ListaTodos (); 
	
	T BuscaPorId (K id);
	
	
	
}
