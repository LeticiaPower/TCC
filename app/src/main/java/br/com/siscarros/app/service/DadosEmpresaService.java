package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.DadosEmpresaDao;
import br.com.siscarros.app.entities.DadosEmpresa;
import br.com.siscarros.app.entities.converter.DadosEmpresaConverter;
import br.com.siscarros.app.entities.dto.DadosEmpresaDTO;


@Service
public class DadosEmpresaService implements DadosEmpresaServiceInt{
	
	@Autowired
	private DadosEmpresaDao dadosEmpresaDao;
	
	@Autowired
	private DadosEmpresaConverter dadosEmpresaConverter;

	@Override
	public DadosEmpresaDTO Cadastra(DadosEmpresaDTO dadosEmpresaDTO) {
		DadosEmpresa dadosEmpresa = dadosEmpresaConverter.convertToEntity(dadosEmpresaDTO);
		DadosEmpresa retorno = dadosEmpresaDao.save(dadosEmpresa);
		return dadosEmpresaConverter.convertToDTO(retorno);
	}

	@Override
	public DadosEmpresaDTO Altera(DadosEmpresaDTO dadosEmpresaDTO) {
		DadosEmpresa dadosEmpresa = dadosEmpresaConverter.convertToEntity(dadosEmpresaDTO);
		DadosEmpresa retorno = dadosEmpresaDao.save(dadosEmpresa);
		return dadosEmpresaConverter.convertToDTO(retorno);
	}

	@Override
	public void Deleta(Long id) {
		DadosEmpresa dadosEmpresa = dadosEmpresaDao.findOne(id);
		dadosEmpresaDao.delete(dadosEmpresa);
		
	}

	@Override
	public List<DadosEmpresaDTO> ListaTodos() {
		List<DadosEmpresa> dadosEmpresas = dadosEmpresaDao.findAll();
		return dadosEmpresaConverter.convertToDTO(dadosEmpresas);
	}

	@Override
	public DadosEmpresaDTO BuscaPorId(Long id) {
		DadosEmpresa dadosEmpresa = dadosEmpresaDao.findOne(id);
		return dadosEmpresaConverter.convertToDTO(dadosEmpresa);
	}
	

}
