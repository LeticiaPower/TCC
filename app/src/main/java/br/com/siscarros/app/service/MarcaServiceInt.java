package br.com.siscarros.app.service;

import java.util.List;

import br.com.siscarros.app.entities.Marca;

public interface MarcaServiceInt {
	
	Marca CadastraMarca (Marca marca);
	
	List<Marca> ListaMarca()

}
