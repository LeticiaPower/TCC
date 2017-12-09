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
	public Caracteristica CadastraCaracteristica(Caracteristica carac) {
		return caracteristicaDao.save(carac);
	}

	@Override
	public List<Caracteristica> ListaCaracteristica() {
		return caracteristicaDao.findAll();
	}

}
