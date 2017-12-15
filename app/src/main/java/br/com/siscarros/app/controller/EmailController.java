package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Email;
import br.com.siscarros.app.service.EmailServiceInt;



@RestController
@RequestMapping("/email")
public class EmailController {
	
	@Autowired
    private EmailServiceInt emailService;
    
	
	@GetMapping(path="/cadastraEmail")
	public void CadastraEmail () {	
	}
	
	
	@GetMapping(path="/listaEmail")
	public List<Email> ListaEmail () {
			
	return emailService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiEmail")
	public void ExcluiEmail () {
		
	}
	@GetMapping(path="/alterarEmail")
	public void AlteraEmail () {
		
	}
	@GetMapping(path="/buscaPorId")
	public void BuscaPorId () { 	
	}
	
	

}
