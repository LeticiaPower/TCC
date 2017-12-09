package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Categoria;
import br.com.siscarros.app.service.CategoriaServiceInt;



@RestController(value="/categoria")
public class CategoriaController {
	
	@Autowired
    private CategoriaServiceInt categoriaService;
	
	@GetMapping(path="/CadastraCategoria")
	public void CadastraCategoria () {	
	}
	
	
	@GetMapping(path="/ListaCategoria")
	public List<Categoria> ListaCategoria () {
			
	return categoriaService.ListaTodos();	
		
	}
	
	@GetMapping(path="/ExcluiCategoria")
	public void ExcluiCategoria () {
		
	}
	@GetMapping(path="/AlterarCategoria")
	public void AlteraCategoria () {
		
	}
	
	@GetMapping(path="/BuscaPorId")
	public void BuscaPorId () { 	
	}
	
	


}
