package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Versao;
import br.com.siscarros.app.service.VersaoServiceInt;



@RestController
public class VersaoController {
	
	@GetMapping(path="/CadastraVersao")
	public void CadastraVersao () {	
	}
	
	
	@GetMapping(path="/ListaVersao")
	public List<Versao> ListaVersao () {
			
	return versaoService.ListaVersao();	
		
	}
	
	@GetMapping(path="/ExcluiVersao")
	public void ExcluiVersao () {
		
	}
	@GetMapping(path="/AlterarVersao")
	public void AlteraVersao () {
		
	}
	
	
	@Autowired
    private VersaoServiceInt versaoService;
    
    
	
	
}


