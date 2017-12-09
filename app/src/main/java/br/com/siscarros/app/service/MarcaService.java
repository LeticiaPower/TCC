package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.MarcaDao;
import br.com.siscarros.app.entities.Marca;

@Service
public class MarcaService implements MarcaServiceInt{
	
	@Autowired
	private MarcaDao marcaDao;

	@Override
	public Marca CadastraMarca(Marca marca) {
		return marcaDao.save(marca);
	}

	@Override
	public List<Marca> ListaMarca() {
		return marcaDao.findAll();
	}

}
