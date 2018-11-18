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

import br.com.siscarros.app.entities.dto.PecaDTO;
import br.com.siscarros.app.service.PecaServiceInt;

@RestController
@RequestMapping("/pecas")
@CrossOrigin("*")
public class PecaController {
	
	@Autowired
    private PecaServiceInt pecaService;
	
	@PostMapping(path="/cadastraPeca")
	public void CadastraPeca (@RequestBody PecaDTO pecaDTO) {	
		pecaService.Cadastra(pecaDTO);
	}
	
	
	@GetMapping(path="/listaPeca")
	public List<PecaDTO> ListaPeca () {
	return pecaService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiPeca/{id}")
	public void ExcluiPeca (@PathVariable Long id) {
		pecaService.Deleta(id);
		
	}
	@PostMapping(path="/alterarPeca")
	public void AlteraPeca (@RequestBody PecaDTO pecaDTO) {
		pecaService.Altera(pecaDTO);
		
	}
	
	@GetMapping(path="/buscaPorId/{id}")
	public void BuscaPorId (@PathVariable Long id) { 	
		pecaService.BuscaPorId(id);
	}
	
	
    
	
	

}
