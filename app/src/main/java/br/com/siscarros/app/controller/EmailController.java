package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Email;
import br.com.siscarros.app.service.EmailServiceInt;



@RestController
public class EmailController {
	
	@GetMapping(path="/CadastraEmail")
	public void CadastraEmail () {	
	}
	
	
	@GetMapping(path="/ListaEmail")
	public List<Email> ListaEmail () {
			
	return emailService.ListaEmail();	
		
	}
	
	@GetMapping(path="/ExcluiVersao")
	public void ExcluiVersao () {
		
	}
	@GetMapping(path="/AlterarEmail")
	public void AlteraEmail () {
		
	}
	
	
	@Autowired
    private EmailServiceInt emailService;
    
    

}
