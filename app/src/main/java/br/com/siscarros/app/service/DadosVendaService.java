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
	public DadosVenda Cadastra(DadosVenda dadosVenda) {
		return dadosVendaDao.save(dadosVenda);
	}

	@Override
	public DadosVenda Altera(DadosVenda dadosVenda) {
		return dadosVendaDao.save(dadosVenda);
	}

	@Override
	public void Deleta(Long id) {
		
	}

	@Override
	public List<DadosVenda> ListaTodos() {
		return dadosVendaDao.findAll();
	}

	@Override
	public DadosVenda BuscaPorId(Long id) {
		return dadosVendaDao.findOne(id);
	}



}
