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
	public Usuario CadastraUsuario(Usuario user) {
		return usuarioDao.save(user);
	}

	@Override
	public List<Usuario> SelecionaUsuario() {
		return usuarioDao.findAll();
	}
	

}
