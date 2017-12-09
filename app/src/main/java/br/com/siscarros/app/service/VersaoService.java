package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.VersaoDao;
import br.com.siscarros.app.entities.Versao;

@Service
public class VersaoService implements VersaoServiceInt{
	
	@Autowired
	private VersaoDao versaoDao;

	@Override
	public Versao Cadastra(Versao versao) {
		return versaoDao.save(versao);
	}

	@Override
	public Versao Altera(Versao versao) {
		return versaoDao.save(versao);
	}

	@Override
	public void Deleta(Long id) {
		
	}

	@Override
	public List<Versao> ListaTodos() {
		return versaoDao.findAll();
	}

	@Override
	public Versao BuscaPorId(Long id) {
		return versaoDao.findOne(id);
	}



	
}
