package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Marca;
import br.com.siscarros.app.service.MarcaServiceInt;


@RestController
public class MarcaController {
	
	@GetMapping(path="/CadastraMarca")
	public void CadastraMarca () {	
	}
	
	
	@GetMapping(path="/ListaMarca")
	public List<Marca> ListaMarca () {
			
	return marcaService.ListaMarca();	
		
	}
	
	@GetMapping(path="/ExcluiMarca")
	public void ExcluiMarca () {
		
	}
	@GetMapping(path="/AlterarMarca")
	public void AlteraMarca () {
		
	}
	
	
	@Autowired
    private MarcaServiceInt marcaService;

}
