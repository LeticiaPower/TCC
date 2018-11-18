package br.com.siscarros.app.entities.converter;

import org.springframework.stereotype.Component;

import br.com.siscarros.app.entities.DadosVenda;
import br.com.siscarros.app.entities.dto.DadosVendaDTO;
import br.com.siscarros.app.entities.util.BaseConverter;

@Component
public class DadosVendaConverter extends BaseConverter<DadosVenda, DadosVendaDTO>{

	@Override
	public DadosVendaDTO convertToDTO(DadosVenda entity) {
		DadosVendaDTO dto = new DadosVendaDTO ();
		dto.setId(entity.getId());
		dto.setDadosAnuncio(entity.getDadosAnuncio());
		dto.setParcela(entity.getParcela());
		dto.setTroca(entity.getTroca());
		dto.setValor(entity.getValor());
		return dto;
	}

	@Override
	public DadosVenda convertToEntity(DadosVendaDTO dto) {
		DadosVenda dados = new DadosVenda ();
		dados.setId(dto.getId());
		dados.setDadosAnuncio(dto.getDadosAnuncio());
		dados.setParcela(dto.getParcela());
		dados.setTroca(dto.getTroca());
		dados.setValor(dto.getValor());
		return dados;
	}
	
	

}
