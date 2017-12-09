package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.DadosEmpresaDao;
import br.com.siscarros.app.entities.DadosEmpresa;


@Service
public class DadosEmpresaService implements DadosEmpresaServiceInt{
	
	@Autowired
	private DadosEmpresaDao dadosEmpresaDao;

	@Override
	public DadosEmpresa Cadastra(DadosEmpresa dadosEmpresa) {
		return dadosEmpresaDao.save(dadosEmpresa);
	}

	@Override
	public DadosEmpresa Altera(DadosEmpresa dadosEmpresa) {
		return dadosEmpresaDao.save(dadosEmpresa);
	}

	@Override
	public void Deleta(Long id) {
		
	}

	@Override
	public List<DadosEmpresa> ListaTodos() {
		return dadosEmpresaDao.findAll();
	}

	@Override
	public DadosEmpresa BuscaPorId(Long id) {
		return dadosEmpresaDao.findOne(id);
	}



}
