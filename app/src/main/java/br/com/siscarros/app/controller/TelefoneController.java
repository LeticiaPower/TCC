package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Telefone;
import br.com.siscarros.app.service.TelefoneServiceInt;



@RestController
public class TelefoneController {
	
	@GetMapping(path="/CadastraTelefone")
	public void CadastraTelefone () {	
	}
	
	
	@GetMapping(path="/ListaTelefone")
	public List<Telefone> ListaTelefone () {
			
	return telefoneService.ListaTelefone();	
		
	}
	
	@GetMapping(path="/ExcluiTelefone")
	public void ExcluiTelefone () {
		
	}
	@GetMapping(path="/AlterarTelefone")
	public void AlteraTelefone () {
		
	}

	@Autowired
    private TelefoneServiceInt telefoneService;
    
    
	
}
