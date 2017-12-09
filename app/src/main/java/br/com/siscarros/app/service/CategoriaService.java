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
	public Categoria Cadastra(Categoria categoria) {
		return categoriaDao.save(categoria);
	}

	@Override
	public Categoria Altera(Categoria categoria) {
		return categoriaDao.save(categoria);
	}

	@Override
	public void Deleta(Long id) {
		
	}

	@Override
	public List<Categoria> ListaTodos() {
		return categoriaDao.findAll();
	}

	@Override
	public Categoria BuscaPorId(Long id) {
		return categoriaDao.findOne(id);
	}

	

}
