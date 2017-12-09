package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.CategoriaDao;
import br.com.siscarros.app.entities.Categoria;

@Service
public class CategoriaService implements CategoriaServiceInt{
	
	@Autowired
	private CategoriaDao categoriaDao;

	@Override
	public Categoria CadastraCategoria(Categoria categ) {
		return categoriaDao.save(categ);
	}

	@Override
	public List<Categoria> ListaCategoria() {
		return categoriaDao.findAll();
	}
	

}
