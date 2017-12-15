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
	
	@GetMapping(path="/cadastraVersao")
	public void CadastraVersao () {	
		
		Versao v = new Versao();
		v.setNomeVersao("Way");
		v.setNomeVersao("Vivace");
				
		versaoService.Cadastra(v);
		
	}
	
	@GetMapping(path="/listaVersao")
	public List<Versao> ListaVersao () {
			
	return versaoService.ListaTodos();		
	}
	
	@GetMapping(path="/excluiVersao")
	public void ExcluiVersao () {
		
		
	}
	@GetMapping(path="/alteraVersao")
	public void AlteraVersao () {
	
		
	}
	
	@GetMapping(path="/buscaPorId")
	public void BuscaPorId () { 	
	}
	
	
	

    
    
	
	
}


