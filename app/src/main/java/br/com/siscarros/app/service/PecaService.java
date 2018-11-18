package br.com.siscarros.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.PecaDao;
import br.com.siscarros.app.entities.Peca;
import br.com.siscarros.app.entities.converter.PecaConverter;
import br.com.siscarros.app.entities.dto.PecaDTO;

@Service
public class PecaService implements PecaServiceInt {
	
	@Autowired
	private PecaDao pecaDao;
	
	@Autowired
	private PecaConverter pecaConverter;

	@Override
	public PecaDTO Cadastra(PecaDTO pecaDTO) {
		Peca peca = pecaConverter.convertToEntity(pecaDTO);
		Peca retorno = pecaDao.save(peca);
		return pecaConverter.convertToDTO(retorno);
	}

	@Override
	public PecaDTO Altera(PecaDTO pecaDTO) {
		Peca peca = pecaConverter.convertToEntity(pecaDTO);
		Peca retorno = pecaDao.save(peca);
		return pecaConverter.convertToDTO(retorno);
	}

	@Override
	public void Deleta(Long id) {
		Peca peca = pecaDao.findOne(id);
		pecaDao.delete(peca);
		
	}

	@Override
	public List<PecaDTO> ListaTodos() {
		List<Peca> pecas = pecaDao.findAll();
		return pecaConverter.convertToDTO(pecas);
	}

	@Override
	public PecaDTO BuscaPorId(Long id) {
		Peca peca = pecaDao.findOne(id);
		return pecaConverter.convertToDTO(peca);
	}




}
