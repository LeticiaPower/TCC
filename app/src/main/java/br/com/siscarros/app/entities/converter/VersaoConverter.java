package br.com.siscarros.app.entities.converter;

import org.springframework.stereotype.Component;

import br.com.siscarros.app.entities.Versao;
import br.com.siscarros.app.entities.dto.VersaoDTO;
import br.com.siscarros.app.entities.util.BaseConverter;

@Component
public class VersaoConverter extends BaseConverter<Versao, VersaoDTO>{

	@Override
	public VersaoDTO convertToDTO(Versao entity) {
		VersaoDTO dto = new VersaoDTO();
		dto.setId(entity.getId());
		dto.setNomeVersao(entity.getNomeVersao());
		return dto;
	}

	@Override
	public Versao convertToEntity(VersaoDTO dto) {
		Versao versao = new Versao();
		versao.setId(dto.getId());
		versao.setNomeVersao(dto.getNomeVersao());
		return versao;
	}

}
