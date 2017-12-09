package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Marca;
import br.com.siscarros.app.service.MarcaServiceInt;


@RestController
@RequestMapping("/marca")
public class MarcaController {
	
	@Autowired
    private MarcaServiceInt marcaService;

	
	@GetMapping(path="/CadastraMarca")
	public void CadastraMarca () {	
	}
	
	
	@GetMapping(path="/ListaMarca")
	public List<Marca> ListaMarca () {
			
	return marcaService.ListaTodos();	
		
	}
	
	@GetMapping(path="/ExcluiMarca")
	public void ExcluiMarca () {
		
	}
	@GetMapping(path="/AlterarMarca")
	public void AlteraMarca () {
		
	}
	
	@GetMapping(path="/BuscaPorId")
	public void BuscaPorId () { 	
	}
	
	
	
}
