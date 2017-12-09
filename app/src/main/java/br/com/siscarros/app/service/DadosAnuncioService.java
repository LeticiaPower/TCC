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
	public DadosAnuncio CadastraDadosAnuncio(DadosAnuncio dadosA) {
		return dadosAnuncioDao.save(dadosA);
	}

	@Override
	public List<DadosAnuncio> ListaDadosAnuncio() {
		return dadosAnuncioDao.findAll();
	}

}
