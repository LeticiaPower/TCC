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

import br.com.siscarros.app.entities.Marca;
import br.com.siscarros.app.entities.dto.MarcaDTO;
import br.com.siscarros.app.entities.dto.PessoaDTO;
import br.com.siscarros.app.service.MarcaServiceInt;


@RestController
@RequestMapping("/marca")
@CrossOrigin("*")
public class MarcaController {
	
	@Autowired
    private MarcaServiceInt marcaService;

	
	@PostMapping(path="/cadastraMarca")
	public void CadastraMarca(@RequestBody MarcaDTO marcaDTO) {
	marcaService.Cadastra(marcaDTO);
}
	
	
	@GetMapping(path="/listaMarca")
	public List<MarcaDTO> ListaMarca () {
	return marcaService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiMarca/{id}")
	public void ExcluiMarca (@PathVariable Long id) {
		marcaService.Deleta(id);
		
	}
	@PostMapping(path="/alterarMarca")
	public void AlteraMarca(@RequestBody MarcaDTO marcaDTO) {
		marcaService.Altera(marcaDTO);
		
	}
	
	@GetMapping(path="/buscaPorId/{id}")
	public MarcaDTO BuscaPorId (@PathVariable Long id) {
		return marcaService.BuscaPorId(id);
	}
	
	
	
}
