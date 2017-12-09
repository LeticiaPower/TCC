package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.CaracteristicaDao;
import br.com.siscarros.app.entities.Caracteristica;

@Service
public class CaracteristicaService implements CaracteristicaServiceInt{
	
	@Autowired
	private CaracteristicaDao caracteristicaDao;

	@Override
	public Caracteristica Cadastra(Caracteristica caracteristica) {
		return caracteristicaDao.save(caracteristica);
	}

	@Override
	public Caracteristica Altera(Caracteristica caracteristica) {
		return caracteristicaDao.save(caracteristica);
	}

	@Override
	public void Deleta(Long id) {
		
	}

	@Override
	public List<Caracteristica> ListaTodos() {
		return caracteristicaDao.findAll();
	}

	@Override
	public Caracteristica BuscaPorId(Long id) {
		return caracteristicaDao.findOne(id);
	}



}
