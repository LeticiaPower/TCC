package br.com.siscarros.app.entities.converter;

import org.springframework.stereotype.Component;

import br.com.siscarros.app.entities.Marca;
import br.com.siscarros.app.entities.dto.MarcaDTO;
import br.com.siscarros.app.entities.util.BaseConverter;

@Component
public class MarcaConverter extends BaseConverter<Marca, MarcaDTO> {

	@Override
	public MarcaDTO convertToDTO(Marca entity) {
		MarcaDTO dto = new MarcaDTO();
		dto.setId(entity.getId());
		dto.setNomeMarca(entity.getNomeMarca());
		return dto;
	}

	@Override
	public Marca convertToEntity(MarcaDTO dto) {
		Marca marca = new Marca();
		marca.setId(dto.getId());
		marca.setNomeMarca(dto.getNomeMarca());
		return marca;
	}
	
	
	

}
