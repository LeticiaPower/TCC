package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.RoleDao;
import br.com.siscarros.app.entities.Role;

@Service
public class RoleService implements RoleServiceInt {
	
	@Autowired
	private RoleDao roleDao;

	@Override
	public Role CadastraRole (Role role) {
		return roleDao.save(role);
	}

	@Override
	public List<Role> ListaRole() {
		return roleDao.findAll();
	}

}
