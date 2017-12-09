package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.UsuarioDao;
import br.com.siscarros.app.entities.Usuario;

@Service
public class UsuarioService implements UsuarioServiceInt {
	
	@Autowired
	private UsuarioDao usuarioDao;

	@Override
	public Usuario Cadastra(Usuario usuario) {
		return usuarioDao.save(usuario);
	}

	@Override
	public Usuario Altera(Usuario usuario) {
		return usuarioDao.save(usuario);
	}

	@Override
	public void Deleta(Long id) {
	
		
	}

	@Override
	public List<Usuario> ListaTodos() {
		return usuarioDao.findAll();
	}

	@Override
	public Usuario BuscaPorId(Long id) {
		return usuarioDao.findOne(id);
	}

	
	

}
