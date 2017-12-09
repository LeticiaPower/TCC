package br.com.siscarros.app.service;

import java.util.List;

import br.com.siscarros.app.entities.DadosAnuncio;

public interface DadosAnuncioServiceInt {
	
	DadosAnuncio CadastraDadosAnuncio (DadosAnuncio dados);
	
	List<DadosAnuncio> ListaDadosAnuncio();
	
}
