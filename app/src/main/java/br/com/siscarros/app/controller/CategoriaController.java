package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Categoria;
import br.com.siscarros.app.service.CategoriaServiceInt;



@RestController
public class CategoriaController {
	
	@GetMapping(path="/CadastraCategoria")
	public void CadastraCategoria () {	
	}
	
	
	@GetMapping(path="/ListaCategoria")
	public List<Categoria> ListaCategoria () {
			
	return categoriaService.ListaCategoria();	
		
	}
	
	@GetMapping(path="/ExcluiCategoria")
	public void ExcluiCategoria () {
		
	}
	@GetMapping(path="/AlterarCategoria")
	public void AlteraCategoria () {
		
	}
	
	
	@Autowired
    private CategoriaServiceInt categoriaService;

}
