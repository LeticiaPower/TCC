package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.TelefoneDao;
import br.com.siscarros.app.entities.Telefone;

@Service
public class TelefoneService implements TelefoneServiceInt{
	
	@Autowired
	private TelefoneDao telefoneDao;

	@Override
	public Telefone Cadastra(Telefone telefone) {
		return telefoneDao.save(telefone);
	}

	@Override
	public Telefone Altera(Telefone telefone) {
		return telefoneDao.save(telefone);
	}

	@Override
	public void Deleta(Long id) {
	
	}

	@Override
	public List<Telefone> ListaTodos() {
		return telefoneDao.findAll();
	}

	@Override
	public Telefone BuscaPorId(Long id) {
		return telefoneDao.findOne(id);
	}

	

}
