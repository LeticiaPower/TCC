package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.CategoriaDao;
import br.com.siscarros.app.entities.Categoria;
import br.com.siscarros.app.entities.converter.CategoriaConverter;
import br.com.siscarros.app.entities.dto.CategoriaDTO;

@Service
public class CategoriaService implements CategoriaServiceInt{
	
	@Autowired
	private CategoriaDao categoriaDao;
	
	@Autowired
	private CategoriaConverter categoriaConverter;

	@Override
	public CategoriaDTO Cadastra(CategoriaDTO categoriaDTO) {
		Categoria categoria = categoriaConverter.convertToEntity(categoriaDTO);
		Categoria retorno = categoriaDao.save(categoria);
		return categoriaConverter.convertToDTO(retorno);
	}

	@Override
	public CategoriaDTO Altera(CategoriaDTO categoriaDTO) {
		Categoria categoria = categoriaConverter.convertToEntity(categoriaDTO);
		Categoria retorno = categoriaDao.save(categoria);
		return categoriaConverter.convertToDTO(retorno);
	}

	@Override
	public void Deleta(Long id) {
		Categoria categoria = categoriaDao.findOne(id);
		categoriaDao.delete(categoria);
		
	}

	@Override
	public List<CategoriaDTO> ListaTodos() {
		List<Categoria> categorias = categoriaDao.findAll();
		return categoriaConverter.convertToDTO(categorias);
	}

	@Override
	public CategoriaDTO BuscaPorId(Long id) {
		Categoria categoria = categoriaDao.findOne(id);
		return categoriaConverter.convertToDTO(categoria);
	}

	

}
