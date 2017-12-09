package br.com.siscarros.app.service;

import java.util.List;

import br.com.siscarros.app.entities.Caracteristica;

public interface CaracteristicaServiceInt {
	
	Caracteristica CadastraCaracteristica (Caracteristica carac);
	
	List<Caracteristica> ListaCaracteristica();

}
