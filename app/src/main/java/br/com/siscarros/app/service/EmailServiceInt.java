package br.com.siscarros.app.service;

import java.util.List;

import br.com.siscarros.app.entities.Email;

public interface EmailServiceInt {
	
	Email CadastraEmail (Email email);
	
	List<Email> ListaEmail();

}
