package br.com.siscarros.app.service;

import java.util.List;

import br.com.siscarros.app.entities.Cor;


public interface CorServiceInt {
	
	Cor CadastraCor (Cor cor);
	
	List<Cor> ListaCor();

}
