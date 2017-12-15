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

	
	@GetMapping(path="/cadastraMarca")
	public void CadastraMarca () {	
	}
	
	
	@GetMapping(path="/listaMarca")
	public List<Marca> ListaMarca () {
			
	return marcaService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiMarca")
	public void ExcluiMarca () {
		
	}
	@GetMapping(path="/alterarMarca")
	public void AlteraMarca () {
		
	}
	
	@GetMapping(path="/buscaPorId")
	public void BuscaPorId () { 	
	}
	
	
	
}
