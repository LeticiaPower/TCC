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

import br.com.siscarros.app.entities.DadosVenda;
import br.com.siscarros.app.entities.dto.DadosVendaDTO;
import br.com.siscarros.app.service.DadosVendaServiceInt;



@RestController
@RequestMapping("/dadosVenda")
@CrossOrigin("*")
public class DadosVendaController {
	
	@Autowired
    private DadosVendaServiceInt dadosVendaService;
	
	@PostMapping(path="/cadastraDadosVenda")
	public void CadastraDadosVenda (@RequestBody DadosVendaDTO dadosVendaDTO) {
		dadosVendaService.Cadastra(dadosVendaDTO);
	}
	
	
	@GetMapping(path="/listaDadosVenda")
	public List<DadosVendaDTO> ListaDadosVenda () {
	return dadosVendaService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiDadosVenda/{id}")
	public void ExcluiDadosVenda (Long id) {
		dadosVendaService.Deleta(id);
		
	}
	@PostMapping(path="/alterarDadosVenda")
	public void AlteraDadosVenda (@RequestBody DadosVendaDTO dadosVendaDTO) {
		dadosVendaService.Altera(dadosVendaDTO);
		
	}
	
	@GetMapping(path="/buscaPorId/{id}")
	public DadosVendaDTO BuscaPorId (@PathVariable Long id) { 	
		return dadosVendaService.BuscaPorId(id);
	}
	
	
    

}
