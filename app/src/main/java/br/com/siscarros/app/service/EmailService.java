package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.EmailDao;
import br.com.siscarros.app.entities.Email;

@Service
public class EmailService implements EmailServiceInt{
	
	@Autowired
	private EmailDao emailDao;

	@Override
	public Email Cadastra(Email email) {
		return emailDao.save(email);
	}

	@Override
	public Email Altera(Email email) {
		return emailDao.save(email);
	}

	@Override
	public void Deleta(Long id) {
		
	}

	@Override
	public List<Email> ListaTodos() {
		return emailDao.findAll();
	}

	@Override
	public Email BuscaPorId(Long id) {
		return emailDao.findOne(id);
	}


	
}
