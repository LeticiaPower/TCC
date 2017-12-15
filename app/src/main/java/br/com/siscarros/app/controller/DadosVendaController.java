package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.DadosVenda;
import br.com.siscarros.app.service.DadosVendaServiceInt;



@RestController
@RequestMapping("/dadosVenda")
public class DadosVendaController {
	
	@Autowired
    private DadosVendaServiceInt dadosVendaService;
	
	@GetMapping(path="/cadastraDadosVenda")
	public void CadastraDadosVenda () {	
	}
	
	
	@GetMapping(path="/listaDadosVenda")
	public List<DadosVenda> ListaDadosVenda () {
			
	return dadosVendaService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiDadosVenda")
	public void ExcluiDadosVenda () {
		
	}
	@GetMapping(path="/alterarDadosVenda")
	public void AlteraDadosVenda () {
		
	}
	
	@GetMapping(path="/buscaPorId")
	public void BuscaPorId () { 	
	}
	
	
    

}
