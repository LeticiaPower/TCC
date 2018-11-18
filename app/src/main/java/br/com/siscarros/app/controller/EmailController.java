package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.siscarros.app.entities.dto.EmailDTO;
import br.com.siscarros.app.service.EmailServiceInt;



@RestController
@RequestMapping("/email")
@CrossOrigin("*")
public class EmailController {
	
	@Autowired
    private EmailServiceInt emailService;
    
	
	@PostMapping(path="/cadastraEmail")
	public void CadastraEmail (@RequestBody EmailDTO emailDTO) {
		emailService.Cadastra(emailDTO);
	}
	
	
	@GetMapping(path="/listaEmail")
	public List<EmailDTO> ListaEmail () {
	return emailService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiEmail/{id}")
	public void ExcluiEmail (@PathVariable Long id) {
		emailService.Deleta(id);
		
	}
	@PostMapping(path="/alterarEmail")
	public void AlteraEmail (@RequestBody EmailDTO emailDTO) {
		emailService.Altera(emailDTO);
		
	}
	@GetMapping(path="/buscaPorId")
	public EmailDTO BuscaPorId (Long id) {
		return emailService.BuscaPorId(id);
	}
	
	

}
