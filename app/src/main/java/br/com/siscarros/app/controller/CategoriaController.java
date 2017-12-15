package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Categoria;
import br.com.siscarros.app.service.CategoriaServiceInt;



@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
    private CategoriaServiceInt categoriaService;
	
	@GetMapping(path="/cadastraCategoria")
	public void CadastraCategoria () {	
	}
	
	
	@GetMapping(path="/listaCategoria")
	public List<Categoria> ListaCategoria () {
			
	return categoriaService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiCategoria")
	public void ExcluiCategoria () {
		
	}
	@GetMapping(path="/alterarCategoria")
	public void AlteraCategoria () {
		
	}
	
	@GetMapping(path="/buscaPorId")
	public void BuscaPorId () { 	
	}
	
	


}
