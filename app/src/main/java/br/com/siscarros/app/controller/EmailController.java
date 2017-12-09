package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Email;
import br.com.siscarros.app.service.EmailServiceInt;



@RestController(value="/email")
public class EmailController {
	
	@Autowired
    private EmailServiceInt emailService;
    
	
	@GetMapping(path="/CadastraEmail")
	public void CadastraEmail () {	
	}
	
	
	@GetMapping(path="/ListaEmail")
	public List<Email> ListaEmail () {
			
	return emailService.ListaTodos();	
		
	}
	
	@GetMapping(path="/ExcluiEmail")
	public void ExcluiEmail () {
		
	}
	@GetMapping(path="/AlterarEmail")
	public void AlteraEmail () {
		
	}
	@GetMapping(path="/BuscaPorId")
	public void BuscaPorId () { 	
	}
	
	

}
