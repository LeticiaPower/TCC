package br.com.siscarros.app.entities.converter;

import org.springframework.stereotype.Component;

import br.com.siscarros.app.entities.Cor;
import br.com.siscarros.app.entities.dto.CorDTO;
import br.com.siscarros.app.entities.util.BaseConverter;

@Component
public class CorConverter extends BaseConverter<Cor, CorDTO> {

	@Override
	public CorDTO convertToDTO(Cor entity) {
		CorDTO dto = new CorDTO();
		dto.setId(entity.getId());
		dto.setNomeCor(entity.getNomeCor());
		return dto;
	}

	@Override
	public Cor convertToEntity(CorDTO dto) {
		Cor cor = new Cor ();
		cor.setId(dto.getId());
		return cor;
	}
	

}
