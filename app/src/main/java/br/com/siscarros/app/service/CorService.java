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
	public Cor Cadastra(Cor cor) {
		return corDao.save(cor);
	}

	@Override
	public Cor Altera(Cor cor) {
		return corDao.save(cor);
	}

	@Override
	public void Deleta(Long id) {
		
	}

	@Override
	public List<Cor> ListaTodos() {
		return corDao.findAll();
	}

	@Override
	public Cor BuscaPorId(Long id) {
		return corDao.findOne(id);
	}

	


}