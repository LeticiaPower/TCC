package br.com.siscarros.app.entities.converter;

import org.springframework.stereotype.Component;

import br.com.siscarros.app.entities.Caracteristica;
import br.com.siscarros.app.entities.dto.CaracteristicaDTO;
import br.com.siscarros.app.entities.util.BaseConverter;

@Component
public class CaracteristicaConverter extends BaseConverter<Caracteristica, CaracteristicaDTO>{

	@Override
	public CaracteristicaDTO convertToDTO(Caracteristica entity) {
		CaracteristicaDTO dto = new CaracteristicaDTO();
		dto.setId(entity.getId());
		dto.setNomeCaracteristica(entity.getNomeCaracteristica());
		return dto;
	}

	@Override
	public Caracteristica convertToEntity(CaracteristicaDTO dto) {
		Caracteristica carac = new Caracteristica();
		carac.setId(dto.getId());
		carac.setNomeCaracteristica(dto.getNomeCaracteristica());
		return carac;
	}

}
