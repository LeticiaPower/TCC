package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Modelo;
import br.com.siscarros.app.service.ModeloServiceInt;


@RestController
@RequestMapping("/modelo")
public class ModeloController {
	
	@Autowired
    private ModeloServiceInt modeloService;
    

	@GetMapping(path="/cadastraModelo")
	public void CadastraModelo () {	
	}
	
	
	@GetMapping(path="/listaModelo")
	public List<Modelo> ListaModelo () {
			
	return modeloService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiModelo")
	public void ExcluiModelo () {
		
	}
	@GetMapping(path="/alterarModelo")
	public void AlteraModelo () {
		
	}
	
	
	@GetMapping(path="/buscaPorId")
	public void BuscaPorId () { 	
	}
	
	
	
}
