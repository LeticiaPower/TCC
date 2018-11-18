package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.siscarros.app.entities.dto.CategoriaDTO;
import br.com.siscarros.app.service.CategoriaServiceInt;



@RestController
@RequestMapping("/categoria")
@CrossOrigin("*")
public class CategoriaController {
	
	@Autowired
    private CategoriaServiceInt categoriaService;
	
	@PostMapping(path="/cadastraCategoria")
	public void CadastraCategoria (@RequestBody CategoriaDTO categoriaDTO) {	
		categoriaService.Cadastra(categoriaDTO);
	}
	
	
	@GetMapping(path="/listaCategoria")
	public List<CategoriaDTO> ListaCategoria () {
	return categoriaService.ListaTodos();
		
	}
	
	@GetMapping(path="/excluiCategoria/{id}")
	public void ExcluiCategoria (@PathVariable Long id) {
		categoriaService.Deleta(id);
		
	}
	@PostMapping(path="/alterarCategoria")
	public void AlteraCategoria (@RequestBody CategoriaDTO categoriaDTO) {
		categoriaService.Altera(categoriaDTO);
		
	}
	
	@GetMapping(path="/buscaPorId/{id}")
	public CategoriaDTO BuscaPorId (@PathVariable Long id) { 
		return categoriaService.BuscaPorId(id);
	}
	
	


}
