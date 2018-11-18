package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.VersaoDao;
import br.com.siscarros.app.entities.Pessoa;
import br.com.siscarros.app.entities.Versao;
import br.com.siscarros.app.entities.converter.PessoaConverter;
import br.com.siscarros.app.entities.converter.VersaoConverter;
import br.com.siscarros.app.entities.dto.PessoaDTO;
import br.com.siscarros.app.entities.dto.VersaoDTO;

@Service
public class VersaoService implements VersaoServiceInt{
	
	@Autowired
	private VersaoDao versaoDao;

	@Autowired
	private VersaoConverter versaoConverter;

	@Override
	public VersaoDTO Cadastra(VersaoDTO versaoDTO) {
		Versao versao= versaoConverter.convertToEntity(versaoDTO);
		Versao retorno = versaoDao.save(versao);
		return versaoConverter.convertToDTO(retorno);
	}

	@Override
	public VersaoDTO Altera(VersaoDTO versaoDTO) {
		Versao versao = versaoConverter.convertToEntity(versaoDTO);
		Versao retorno = versaoDao.save(versao);
		return versaoConverter.convertToDTO(retorno);
	}

	@Override
	public void Deleta(Long id) {
		Versao versao= versaoDao.findOne(id);
		versaoDao.delete(versao);
		
	}

	@Override
	public List<VersaoDTO> ListaTodos() {
		List<Versao> versoes = versaoDao.findAll();
		return versaoConverter.convertToDTO(versoes);
	}

	@Override
	public VersaoDTO BuscaPorId(Long id) {
		Versao versao= versaoDao.findOne(id);
		return versaoConverter.convertToDTO(versao);
	}

	


}