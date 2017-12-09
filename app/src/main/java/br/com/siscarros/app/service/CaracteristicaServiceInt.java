package br.com.siscarros.app.service;

import java.util.List;

import br.com.siscarros.app.entities.Caracteristica;

public interface CaracteristicaService {
	
	Caracteristica CadastraCaracteristica (Caracteristica carac);
	
	List<Caracteristica> ListaCaracteristica();

}
