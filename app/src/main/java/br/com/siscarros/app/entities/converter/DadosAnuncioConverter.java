package br.com.siscarros.app.entities.converter;

import org.springframework.stereotype.Component;

import br.com.siscarros.app.entities.DadosAnuncio;
import br.com.siscarros.app.entities.dto.DadosAnuncioDTO;
import br.com.siscarros.app.entities.util.BaseConverter;

@Component
public class DadosAnuncioConverter extends BaseConverter<DadosAnuncio, DadosAnuncioDTO>{

	@Override
	public DadosAnuncioDTO convertToDTO(DadosAnuncio entity) {
		DadosAnuncioDTO dto = new DadosAnuncioDTO();
		dto.setId(entity.getId());
		dto.setDataDoCadastro(entity.getDataDoCadastro());
		dto.setDataExpiracao(entity.getDataExpirecao());
		dto.setDataUpdate(entity.getDataUpdate());
		dto.setDescricao(entity.getDescricao());
		dto.setTitulo(entity.getTitulo());
		dto.setVeiculo(entity.getVeiculo());
		dto.setPeca(entity.getPeca());
		return dto;
	}

	@Override
	public DadosAnuncio convertToEntity(DadosAnuncioDTO dto) {
		DadosAnuncio dados = new DadosAnuncio();
		dados.setId(dto.getId());
		dados.setDataDoCadastro(dto.getDataDoCadastro());
		dados.setDataExpirecao(dto.getDataExpiracao());
		dados.setDataUpdate(dto.getDataUpdate());
		dados.setDescricao(dto.getDescricao());
		dados.setTitulo(dto.getTitulo());
		dados.setVeiculo(dto.getVeiculo());
		dados.setPeca(dto.getPeca());
		return dados;
	}

}
