package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Caracteristica;
import br.com.siscarros.app.service.CaracteristicaServiceInt;


@RestController
@RequestMapping("/caracteristica")
public class CaracteristicaController {
	
	@Autowired
    private CaracteristicaServiceInt caracteristicaService;
	
	@GetMapping(path="/cadastraCaracteristica")
	public void CadastraCaracteristica () {	
	}
	
	
	@GetMapping(path="/listaCaracteristica")
	public List<Caracteristica> ListaCaracteristica () {
			
	return caracteristicaService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiCaracteristica")
	public void ExcluiCaracteristica () {
		
	}
	@GetMapping(path="/alterarCaracteristica")
	public void AlteraCaracteristica () {
		
	}
	
	@GetMapping(path="/buscaPorId")
	public void BuscaPorId () { 	
	}
	
	
    

}
