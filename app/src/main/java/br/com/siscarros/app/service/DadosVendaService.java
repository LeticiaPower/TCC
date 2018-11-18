package br.com.siscarros.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.siscarros.app.dao.DadosVendaDao;
import br.com.siscarros.app.entities.DadosVenda;
import br.com.siscarros.app.entities.converter.DadosVendaConverter;
import br.com.siscarros.app.entities.dto.DadosVendaDTO;

@Service
public class DadosVendaService implements DadosVendaServiceInt{
	
	@Autowired
	private DadosVendaDao dadosVendaDao;
	
	@Autowired
	private DadosVendaConverter dadosVendaConverter;

	@Override
	public DadosVendaDTO Cadastra(DadosVendaDTO dadosVendaDTO) {
		DadosVenda dadosVenda = dadosVendaConverter.convertToEntity(dadosVendaDTO);
		DadosVenda retorno = dadosVendaDao.save(dadosVenda);
		return dadosVendaConverter.convertToDTO(retorno);
	}

	@Override
	public DadosVendaDTO Altera(DadosVendaDTO dadosVendaDTO) {
		DadosVenda dadosVenda = dadosVendaConverter.convertToEntity(dadosVendaDTO);
		DadosVenda retorno = dadosVendaDao.save(dadosVenda);
		return dadosVendaConverter.convertToDTO(retorno);
	}

	@Override
	public void Deleta(Long id) {
		DadosVenda dadosVenda = dadosVendaDao.findOne(id);
		dadosVendaDao.delete(dadosVenda);
		
	}

	@Override
	public List<DadosVendaDTO> ListaTodos() {
		List<DadosVenda> dadosVendas = dadosVendaDao.findAll();
		return dadosVendaConverter.convertToDTO(dadosVendas);
	}

	@Override
	public DadosVendaDTO BuscaPorId(Long id) {
		DadosVenda dadosVenda = dadosVendaDao.findOne(id);
		return dadosVendaConverter.convertToDTO(dadosVenda);
	}

	
	
	

	



}
