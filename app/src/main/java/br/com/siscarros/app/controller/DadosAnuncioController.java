package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.DadosAnuncio;
import br.com.siscarros.app.service.DadosAnuncioServiceInt;



@RestController
@RequestMapping("/dadosAnuncio")
public class DadosAnuncioController {
	
	@Autowired
    private DadosAnuncioServiceInt dadosAnuncioService;
	
	@GetMapping(path="/cadastraDadosAnuncio")
	public void CadastraDadosAnuncio () {	
	}
	
	
	@GetMapping(path="/listaDadosAnuncio")
	public List<DadosAnuncio> ListaDadosAnuncio () {
			
	return dadosAnuncioService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiDadosAnuncio")
	public void ExcluiDadosAnuncio () {
		
	}
	@GetMapping(path="/alterarDadosanuncio")
	public void AlteraDadosAnuncio () {
		
	}
	
	@GetMapping(path="/buscaPorId")
	public void BuscaPorId () { 	
	}
	
	
    

}
