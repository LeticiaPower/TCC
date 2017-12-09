package br.com.siscarros.app.service;

import java.util.List;

import br.com.siscarros.app.entities.Modelo;

public interface ModeloServiceInt {
	
	Modelo CadastraModelo (Modelo modelo);
	
	List<Modelo> ListaModelo();
}
