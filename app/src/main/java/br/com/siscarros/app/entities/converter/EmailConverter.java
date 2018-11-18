package br.com.siscarros.app.entities.converter;

import org.springframework.stereotype.Component;
import br.com.siscarros.app.entities.Email;
import br.com.siscarros.app.entities.dto.EmailDTO;
import br.com.siscarros.app.entities.util.BaseConverter;

@Component
public class EmailConverter extends BaseConverter<Email, EmailDTO>{

	@Override
	public EmailDTO convertToDTO(Email entity) {
		EmailDTO dto = new EmailDTO();
		dto.setId(entity.getId());
		dto.setDadosEmpresa(entity.getDadosEmpresa());
		dto.setNomeEmail(entity.getNomeEmail());
		dto.setTipoEmail(entity.getNomeEmail());
		return dto;
	}

	@Override
	public Email convertToEntity(EmailDTO dto) {
		Email email = new Email();
		email.setId(dto.getId());
		email.setDadosEmpresa(dto.getDadosEmpresa());
		email.setNomeEmail(dto.getNomeEmail());
		email.setTipoEmail(dto.getTipoEmail());
		return email;
	}
	

	
	

}
