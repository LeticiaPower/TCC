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
	public Versao CadastraVersao(Versao versao) {
		return versaoDao.save(versao);
	}

	@Override
	public List<Versao> ListaVersao() {
		return versaoDao.findAll();
	}

}
