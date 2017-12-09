package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.DadosVenda;
import br.com.siscarros.app.service.DadosVendaServiceInt;



@RestController(value="/dadosVenda")
public class DadosVendaController {
	
	@Autowired
    private DadosVendaServiceInt dadosVendaService;
	
	@GetMapping(path="/CadastraDadosVenda")
	public void CadastraDadosVenda () {	
	}
	
	
	@GetMapping(path="/ListaDadosVenda")
	public List<DadosVenda> ListaDadosVenda () {
			
	return dadosVendaService.ListaTodos();	
		
	}
	
	@GetMapping(path="/ExcluiDadosVenda")
	public void ExcluiDadosVenda () {
		
	}
	@GetMapping(path="/AlterarDadosVenda")
	public void AlteraDadosVenda () {
		
	}
	
	@GetMapping(path="/BuscaPorId")
	public void BuscaPorId () { 	
	}
	
	
    

}
