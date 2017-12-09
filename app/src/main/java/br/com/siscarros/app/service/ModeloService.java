package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.ModeloDao;
import br.com.siscarros.app.entities.Modelo;

@Service
public class ModeloService implements ModeloServiceInt{
	
	@Autowired
	private ModeloDao modeloDao;

	@Override
	public Modelo Cadastra(Modelo modelo) {
		return modeloDao.save(modelo);
	}

	@Override
	public Modelo Altera(Modelo modelo) {
		return modeloDao.save(modelo);
	}

	@Override
	public void Deleta(Long id) {

		
	}

	@Override
	public List<Modelo> ListaTodos() {
		return modeloDao.findAll();
	}

	@Override
	public Modelo BuscaPorId(Long id) {
		return modeloDao.findOne(id);
	}



}
