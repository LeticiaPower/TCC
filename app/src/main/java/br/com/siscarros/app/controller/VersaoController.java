package br.com.siscarros.app.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Versao;
import br.com.siscarros.app.service.VersaoServiceInt;



@RestController
@RequestMapping("/versao")
public class VersaoController {
	
	@Autowired
    private VersaoServiceInt versaoService;
	
	@GetMapping(path="/CadastraVersao")
	public void CadastraVersao () {	
		
		Versao v = new Versao();
		v.setNomeVersao("Way");
		v.setNomeVersao("Vivace");
				
		versaoService.Cadastra(v);
		
	}
	
	@GetMapping(path="/ListaVersao")
	public List<Versao> ListaVersao () {
			
	return versaoService.ListaTodos();		
	}
	
	@GetMapping(path="/ExcluiVersao")
	public void ExcluiVersao () {
		
		
	}
	@GetMapping(path="/AlteraVersao")
	public void AlteraVersao () {
	
		
	}
	
	@GetMapping(path="/BuscaPorId")
	public void BuscaPorId () { 	
	}
	
	
	

    
    
	
	
}


