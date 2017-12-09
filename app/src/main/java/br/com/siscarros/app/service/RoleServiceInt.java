package br.com.siscarros.app.service;

import java.util.List;

import br.com.siscarros.app.entities.Role;

public interface RoleServiceInt {
	
	Role CadastraRole (Role role);
	
	List<Role> ListaRole();

}
