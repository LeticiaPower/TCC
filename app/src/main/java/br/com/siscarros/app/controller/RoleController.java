package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.siscarros.app.entities.Role;
import br.com.siscarros.app.service.RoleServiceInt;

public class RoleController {
	
	@Autowired
	private RoleServiceInt roleService;
	
	@GetMapping(path="/listaRole")
	public List<Role> ListaRole () {
			
	return roleService.ListaTodos();	
		
	}
	
	@GetMapping(path="/buscaPorNome")
	public void BuscaPorNome () { 	
	}

}
