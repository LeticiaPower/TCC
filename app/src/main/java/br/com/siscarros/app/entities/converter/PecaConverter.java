package br.com.siscarros.app.entities.converter;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;
import br.com.siscarros.app.entities.Peca;
import br.com.siscarros.app.entities.dto.PecaDTO;
import br.com.siscarros.app.entities.util.BaseConverter;

@Component
public class PecaConverter extends BaseConverter<Peca, PecaDTO> {

	@Override
	public PecaDTO convertToDTO(Peca entity) {
		PecaDTO dto = new PecaDTO();
		dto.setId(entity.getId());
		dto.setTipo(entity.getTipo());
		dto.setAplicacao(entity.getAplicacao());
		dto.setPessoa(entity.getPessoa());
		return dto;
	}

	@Override
	public Peca convertToEntity(PecaDTO dto) {
		Peca peca = new Peca();
		peca.setId(dto.getId());
		peca.setTipo(dto.getTipo());
		peca.setAplicacao(dto.getAplicacao());
		peca.setPessoa(dto.getPessoa());
		return peca;
	}
	
	
}
