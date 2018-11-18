package br.com.siscarros.app.entities.converter;

import org.springframework.stereotype.Component;

import br.com.siscarros.app.entities.Categoria;
import br.com.siscarros.app.entities.dto.CategoriaDTO;
import br.com.siscarros.app.entities.util.BaseConverter;

@Component
public class CategoriaConverter extends BaseConverter<Categoria, CategoriaDTO> {

	@Override
	public CategoriaDTO convertToDTO(Categoria entity) {
		CategoriaDTO dto = new CategoriaDTO();
		dto.setId(entity.getId());
		dto.setNomeCategoria(entity.getNomeCategoria());
		return dto;
	}

	@Override
	public Categoria convertToEntity(CategoriaDTO dto) {
		Categoria cat = new Categoria();
		cat.setId(dto.getId());
		cat.setNomeCategoria(dto.getNomeCategoria());
		return cat;
	}
	
}
