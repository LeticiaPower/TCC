package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.CorDao;
import br.com.siscarros.app.entities.Cor;
import br.com.siscarros.app.entities.converter.CorConverter;
import br.com.siscarros.app.entities.dto.CorDTO;

@Service
public class CorService implements CorServiceInt{
	
	@Autowired
	private CorDao corDao;
	
	@Autowired
	private CorConverter corConverter;

	@Override
	public CorDTO Cadastra(CorDTO corDTO) {
		Cor cor = corConverter.convertToEntity(corDTO);
		Cor retorno = corDao.save(cor);
		return corConverter.convertToDTO(retorno);
	}

	@Override
	public CorDTO Altera(CorDTO corDTO) {
		Cor cor = corConverter.convertToEntity(corDTO);
		Cor retorno = corDao.save(cor);
		return corConverter.convertToDTO(retorno);
	}

	@Override
	public void Deleta(Long id) {
		Cor cor = corDao.findOne(id);
		corDao.delete(cor);
		
	}

	@Override
	public List<CorDTO> ListaTodos() {
		List<Cor> cores = corDao.findAll();
		return corConverter.convertToDTO(cores);
	}

	@Override
	public CorDTO BuscaPorId(Long id) {
		Cor cor = corDao.findOne(id);
		return corConverter.convertToDTO(cor);
	}



	


}