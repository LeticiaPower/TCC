package br.com.siscarros.app.entities.converter;

import org.springframework.stereotype.Component;

import br.com.siscarros.app.entities.Modelo;
import br.com.siscarros.app.entities.dto.ModeloDTO;
import br.com.siscarros.app.entities.util.BaseConverter;

@Component
public class ModeloConverter extends BaseConverter<Modelo, ModeloDTO>{

	@Override
	public ModeloDTO convertToDTO(Modelo entity) {
		ModeloDTO dto = new ModeloDTO();
		dto.setId(entity.getId());
		dto.setNomeModelo(entity.getNomeModelo());
		dto.setVersao(entity.getVersao());
		return dto;
	}

	@Override
	public Modelo convertToEntity(ModeloDTO dto) {
		Modelo modelo = new Modelo();
		modelo.setId(dto.getId());
		modelo.setNomeModelo(dto.getNomeModelo());
		modelo.setVersao(dto.getVersao());
		return modelo;
	}

}
