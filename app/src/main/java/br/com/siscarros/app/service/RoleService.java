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
	public List<Role> ListaTodos() {
		return roleDao.findAll();
	}

	@Override
	public Role BuscaPorNome(String nome) {
		return roleDao.findOne(nome);
	}


}
