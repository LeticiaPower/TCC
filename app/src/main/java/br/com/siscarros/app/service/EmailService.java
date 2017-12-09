package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.EmailDao;
import br.com.siscarros.app.entities.Email;

public class EmailService implements EmailServiceInt{
	
	@Autowired
	private EmailDao emailDao;

	@Override
	public Email CadastraEmail(Email email) {
		return emailDao.save(email);
	}

	@Override
	public List<Email> ListaEmail() {
		return emailDao.findAll();
	}
	
}
