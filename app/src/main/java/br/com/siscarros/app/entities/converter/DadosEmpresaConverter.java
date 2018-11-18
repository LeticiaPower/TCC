package br.com.siscarros.app.entities.converter;

import org.springframework.stereotype.Component;

import br.com.siscarros.app.entities.DadosEmpresa;
import br.com.siscarros.app.entities.dto.DadosEmpresaDTO;
import br.com.siscarros.app.entities.util.BaseConverter;

@Component
public class DadosEmpresaConverter extends BaseConverter<DadosEmpresa, DadosEmpresaDTO>{

	@Override
	public DadosEmpresaDTO convertToDTO(DadosEmpresa entity) {
		DadosEmpresaDTO dto = new DadosEmpresaDTO ();
		dto.setId(entity.getId());
		dto.setNomeFantasia(entity.getNomeFantasia());
		dto.setRazaoSocial(entity.getNomeFantasia());
		return dto;
	}

	@Override
	public DadosEmpresa convertToEntity(DadosEmpresaDTO dto) {
		DadosEmpresa dadosEmpresa = new DadosEmpresa ();
		dadosEmpresa.setId(dto.getId());
		dadosEmpresa.setNomeFantasia(dto.getNomeFantasia());
		dadosEmpresa.setRazaoSocial(dto.getNomeFantasia());
		return dadosEmpresa;
	}

}
