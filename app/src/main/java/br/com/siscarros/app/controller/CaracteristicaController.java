package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Caracteristica;
import br.com.siscarros.app.service.CaracteristicaServiceInt;


@RestController
public class CaracteristicaController {
	@GetMapping(path="/CadastraCaracteristica")
	public void CadastraCaracteristica () {	
	}
	
	
	@GetMapping(path="/ListaCaracteristica")
	public List<Caracteristica> ListaCaracteristica () {
			
	return caracteristicaService.ListaCaracteristica();	
		
	}
	
	@GetMapping(path="/ExcluiCaracteristica")
	public void ExcluiCaracteristica () {
		
	}
	@GetMapping(path="/AlterarCaracteristica")
	public void AlteraCaracteristica () {
		
	}
	
	
	@Autowired
    private CaracteristicaServiceInt caracteristicaService;
    

}
