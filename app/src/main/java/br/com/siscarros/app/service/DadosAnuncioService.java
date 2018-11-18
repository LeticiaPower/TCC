package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.DadosAnuncioDao;
import br.com.siscarros.app.entities.DadosAnuncio;
import br.com.siscarros.app.entities.converter.DadosAnuncioConverter;
import br.com.siscarros.app.entities.dto.DadosAnuncioDTO;

@Service
public class DadosAnuncioService implements DadosAnuncioServiceInt {
	
	@Autowired
	private DadosAnuncioDao dadosAnuncioDao;
	
	@Autowired
	private DadosAnuncioConverter dadosAnuncioConverter;

	@Override
	public DadosAnuncioDTO Cadastra(DadosAnuncioDTO dadosAnuncioDTO) {
		DadosAnuncio dadosAnuncio = dadosAnuncioConverter.convertToEntity(dadosAnuncioDTO);
		DadosAnuncio retorno = dadosAnuncioDao.save(dadosAnuncio);
		return dadosAnuncioConverter.convertToDTO(retorno);
	}

	@Override
	public DadosAnuncioDTO Altera(DadosAnuncioDTO dadosAnuncioDTO) {
		DadosAnuncio dadosAnuncio = dadosAnuncioConverter.convertToEntity(dadosAnuncioDTO);
		DadosAnuncio retorno = dadosAnuncioDao.save(dadosAnuncio);
		return dadosAnuncioConverter.convertToDTO(retorno);
	}

	@Override
	public void Deleta(Long id) {
		DadosAnuncio dadosAnuncio = dadosAnuncioDao.findOne(id);
		dadosAnuncioDao.delete(dadosAnuncio);
		
	}

	@Override
	public List<DadosAnuncioDTO> ListaTodos() {
		List<DadosAnuncio> anuncios = dadosAnuncioDao.findAll();
		return dadosAnuncioConverter.convertToDTO(anuncios);
	}

	@Override
	public DadosAnuncioDTO BuscaPorId(Long id) {
		DadosAnuncio dadosAnuncio = dadosAnuncioDao.findOne(id);
		return dadosAnuncioConverter.convertToDTO(dadosAnuncio);
	}

	


}
