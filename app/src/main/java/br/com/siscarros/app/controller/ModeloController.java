package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Modelo;
import br.com.siscarros.app.service.ModeloServiceInt;


@RestController
public class ModeloController {

	@GetMapping(path="/CadastraModelo")
	public void CadastraModelo () {	
	}
	
	
	@GetMapping(path="/ListaModelo")
	public List<Modelo> ListaModelo () {
			
	return modeloService.ListaModelo();	
		
	}
	
	@GetMapping(path="/ExcluiModelo")
	public void ExcluiModelo () {
		
	}
	@GetMapping(path="/AlterarModelo")
	public void AlteraModelo () {
		
	}
	
	
	@Autowired
    private ModeloServiceInt modeloService;
    
}
