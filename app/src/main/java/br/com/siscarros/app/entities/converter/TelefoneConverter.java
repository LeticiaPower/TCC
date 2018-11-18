package br.com.siscarros.app.entities.converter;

import org.springframework.stereotype.Component;


import br.com.siscarros.app.entities.Telefone;
import br.com.siscarros.app.entities.dto.TelefoneDTO;
import br.com.siscarros.app.entities.util.BaseConverter;

@Component
public class TelefoneConverter extends BaseConverter<Telefone, TelefoneDTO>{

	@Override
	public TelefoneDTO convertToDTO(Telefone entity) {
		TelefoneDTO dto = new TelefoneDTO();
		dto.setId(entity.getId());
		dto.setDadosEmpresa(entity.getDadosEmpresa());
		dto.setNumeroTelefone(entity.getNumeroTelefone());
		dto.setTipoTelefone(entity.getTipoTelefone());
		return dto;
	}

	@Override
	public Telefone convertToEntity(TelefoneDTO dto) {
		Telefone telefone = new Telefone();
		telefone.setId(dto.getId());
		telefone.setDadosEmpresa(dto.getDadosEmpresa());
		telefone.setNumeroTelefone(dto.getNumeroTelefone());
		telefone.setTipoTelefone(dto.getTipoTelefone());
		return telefone;
	}

}
