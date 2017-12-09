package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.DadosAnuncioDao;
import br.com.siscarros.app.entities.DadosAnuncio;

@Service
public class DadosAnuncioService implements DadosAnuncioServiceInt {
	
	@Autowired
	private DadosAnuncioDao dadosAnuncioDao;

	@Override
	public DadosAnuncio Cadastra(DadosAnuncio dadosAnuncio) {
		return dadosAnuncioDao.save(dadosAnuncio);
	}

	@Override
	public DadosAnuncio Altera(DadosAnuncio dadosAnuncio) {
		return dadosAnuncioDao.save(dadosAnuncio);
	}

	@Override
	public void Deleta(Long id) {
		
	}

	@Override
	public List<DadosAnuncio> ListaTodos() {
		return dadosAnuncioDao.findAll();
	}

	@Override
	public DadosAnuncio BuscaPorId(Long id) {
		return dadosAnuncioDao.findOne(id);
	}



}
