package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.CorDao;
import br.com.siscarros.app.entities.Cor;

@Service
public class CorService implements CorServiceInt{
	
	@Autowired
	private CorDao corDao;

	@Override
	public Cor CadastraCor(Cor cor) {
		return corDao.save(cor);
	}

	@Override
	public List<Cor> ListaCor() {
		return corDao.findAll();
	}

}