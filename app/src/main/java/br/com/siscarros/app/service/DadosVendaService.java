package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.DadosVendaDao;
import br.com.siscarros.app.entities.DadosVenda;

@Service
public class DadosVendaService implements DadosVendaServiceInt{
	
	@Autowired
	private DadosVendaDao dadosVendaDao;

	@Override
	public DadosVenda CadastraDadosVenda(DadosVenda dadosV) {
		return dadosVendaDao.save(dadosV);
	}

	@Override
	public List<DadosVenda> ListaDadosVenda() {
		return dadosVendaDao.findAll();
	}

}
