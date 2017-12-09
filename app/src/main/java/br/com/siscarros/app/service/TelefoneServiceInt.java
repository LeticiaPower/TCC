package br.com.siscarros.app.service;

import java.util.List;

import br.com.siscarros.app.entities.Telefone;

public interface TelefoneServiceInt {
	
	Telefone CadastraTelefone (Telefone telefone);
	
	List<Telefone> ListaTelefone();

}
