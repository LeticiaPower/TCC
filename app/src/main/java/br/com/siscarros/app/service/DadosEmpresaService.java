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
	public DadosEmpresa CadastraDadosEmpresa(DadosEmpresa dadosE) {
		return dadosEmpresaDao.save(dadosE);
	}

	@Override
	public List<DadosEmpresa> ListaDadosEmpresa() {
		return dadosEmpresaDao.findAll();
	}

}
