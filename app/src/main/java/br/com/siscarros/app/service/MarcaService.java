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
	public Marca Cadastra(Marca marca) {
		return marcaDao.save(marca);
	}

	@Override
	public Marca Altera(Marca marca) {
		return marcaDao.save(marca);
	}

	@Override
	public void Deleta(Long id) {

		
	}

	@Override
	public List<Marca> ListaTodos() {
		return marcaDao.findAll();
	}

	@Override
	public Marca BuscaPorId(Long id) {
		return marcaDao.findOne(id);
	}



}
