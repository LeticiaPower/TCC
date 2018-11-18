package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.UsuarioDao;
import br.com.siscarros.app.entities.Usuario;
import br.com.siscarros.app.entities.Usuario;
import br.com.siscarros.app.entities.converter.UsuarioConverter;
import br.com.siscarros.app.entities.dto.UsuarioDTO;

@Service
public class UsuarioService implements UsuarioServiceInt {
	
	@Autowired
	private UsuarioDao usuarioDao;

	@Autowired
	private UsuarioConverter usuarioConverter;

	@Override
	public UsuarioDTO Cadastra(UsuarioDTO usuarioDTO) {
		Usuario usuario = usuarioConverter.convertToEntity(usuarioDTO);
		Usuario retorno = usuarioDao.save(usuario);
		return usuarioConverter.convertToDTO(retorno);
	}

	@Override
	public UsuarioDTO Altera(UsuarioDTO usuarioDTO) {
		Usuario usuario = usuarioConverter.convertToEntity(usuarioDTO);
		Usuario retorno = usuarioDao.save(usuario);
		return usuarioConverter.convertToDTO(retorno);
	}

	@Override
	public void Deleta(Long id) {
		Usuario usuario = usuarioDao.findOne(id);
		usuarioDao.delete(usuario);
		
	}

	@Override
	public List<UsuarioDTO> ListaTodos() {
		List<Usuario> usuario = usuarioDao.findAll();
		return usuarioConverter.convertToDTO(usuario);
	}

	@Override
	public UsuarioDTO BuscaPorId(Long id) {
		Usuario usuario = usuarioDao.findOne(id);
		return usuarioConverter.convertToDTO(usuario);
	}

	


}