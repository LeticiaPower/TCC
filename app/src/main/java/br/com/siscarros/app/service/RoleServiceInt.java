package br.com.siscarros.app.service;

import java.util.List;

import br.com.siscarros.app.entities.Role;

public interface RoleServiceInt {
	
	
	List<Role> ListaTodos (); 
	
	Role BuscaPorNome (String nome);
	
	
}
