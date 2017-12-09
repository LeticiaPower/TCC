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
	public Telefone CadastraTelefone(Telefone telefone) {
		return telefoneDao.save(telefone);
	}

	@Override
	public List<Telefone> ListaTelefone () {
		return telefoneDao.findAll();
	}

}
