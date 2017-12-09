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
	public Modelo CadastraModelo(Modelo modelo) {
		return modeloDao.save(modelo);
	}

	@Override
	public List<Modelo> ListaModelo() {
		return modeloDao.findAll();
	}

}
