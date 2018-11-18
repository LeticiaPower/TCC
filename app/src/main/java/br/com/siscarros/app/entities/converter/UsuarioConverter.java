package br.com.siscarros.app.entities.converter;

import org.springframework.stereotype.Component;

import br.com.siscarros.app.entities.Usuario;
import br.com.siscarros.app.entities.dto.UsuarioDTO;
import br.com.siscarros.app.entities.util.BaseConverter;

@Component
public class UsuarioConverter extends BaseConverter<Usuario, UsuarioDTO>{

	@Override
	public UsuarioDTO convertToDTO(Usuario entity) {
		UsuarioDTO dto = new UsuarioDTO();
		dto.setId(entity.getId());
		dto.setLogin(entity.getLogin());
		dto.setPessoa(entity.getPessoa());
		dto.setRole(entity.getRole());
		dto.setSenha(entity.getSenha());
		dto.setStatus(entity.getStatus());
		return dto;
	}

	@Override
	public Usuario convertToEntity(UsuarioDTO dto) {
		Usuario usuario = new Usuario();
		usuario.setId(dto.getId());
		usuario.setLogin(dto.getLogin());
		usuario.setPessoa(dto.getPessoa());
		usuario.setRole(dto.getRole());
		usuario.setSenha(dto.getSenha());
		usuario.setStatus(dto.getStatus());
		return usuario;
	}

}