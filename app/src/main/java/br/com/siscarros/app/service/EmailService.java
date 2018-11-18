package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.EmailDao;
import br.com.siscarros.app.entities.Email;
import br.com.siscarros.app.entities.converter.EmailConverter;
import br.com.siscarros.app.entities.dto.EmailDTO;

@Service
public class EmailService implements EmailServiceInt{
	
	@Autowired
	private EmailDao emailDao;
	
	@Autowired
	private EmailConverter emailConverter;

	@Override
	public EmailDTO Cadastra(EmailDTO emailDTO) {
		Email email = emailConverter.convertToEntity(emailDTO);
		Email retorno = emailDao.save(email);
		return emailConverter.convertToDTO(retorno);
	}

	@Override
	public EmailDTO Altera(EmailDTO emailDTO) {
		Email email = emailConverter.convertToEntity(emailDTO);
		Email retorno = emailDao.save(email);
		return emailConverter.convertToDTO(retorno);
	}

	@Override
	public void Deleta(Long id) {
		Email email = emailDao.findOne(id);
		emailDao.delete(email);
	}

	@Override
	public List<EmailDTO> ListaTodos() {
		List<Email> emails = emailDao.findAll();
		return emailConverter.convertToDTO(emails);
	}

	@Override
	public EmailDTO BuscaPorId(Long id) {
		Email email = emailDao.findOne(id);
		return emailConverter.convertToDTO(email);
	}




	
}
