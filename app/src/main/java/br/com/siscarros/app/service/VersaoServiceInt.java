package br.com.siscarros.app.service;

import java.util.List;

import br.com.siscarros.app.entities.Versao;

public interface VersaoServiceInt {
	
	Versao CadastraVersao (Versao versao);
	
	List<Versao> ListaVersao();

}
