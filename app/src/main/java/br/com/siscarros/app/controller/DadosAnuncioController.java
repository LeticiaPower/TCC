package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.DadosAnuncio;
import br.com.siscarros.app.service.DadosAnuncioServiceInt;



@RestController(value="/dadosAnuncio")
public class DadosAnuncioController {
	
	@Autowired
    private DadosAnuncioServiceInt dadosAnuncioService;
	
	@GetMapping(path="/CadastraDadosAnuncio")
	public void CadastraDadosAnuncio () {	
	}
	
	
	@GetMapping(path="/ListaDadosAnuncio")
	public List<DadosAnuncio> ListaDadosAnuncio () {
			
	return dadosAnuncioService.ListaTodos();	
		
	}
	
	@GetMapping(path="/ExcluiDadosAnuncio")
	public void ExcluiDadosAnuncio () {
		
	}
	@GetMapping(path="/AlterarDadosanuncio")
	public void AlteraDadosAnuncio () {
		
	}
	
	@GetMapping(path="/BuscaPorId")
	public void BuscaPorId () { 	
	}
	
	
    

}
