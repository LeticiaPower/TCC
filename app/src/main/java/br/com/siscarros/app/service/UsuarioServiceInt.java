package br.com.siscarros.app.service;

import java.util.List;

import br.com.siscarros.app.entities.Usuario;

public interface UsuarioServiceInt {

	Usuario CadastraUsuario (Usuario user);
	
	List<Usuario> ListaUsuario();
	
}
