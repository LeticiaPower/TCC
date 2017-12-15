package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Telefone;
import br.com.siscarros.app.service.TelefoneServiceInt;



@RestController
@RequestMapping("/telefone")
public class TelefoneController {
	
	@Autowired
    private TelefoneServiceInt telefoneService;
    
	
	@GetMapping(path="/cadastraTelefone")
	public void CadastraTelefone () {	
	}
	
	
	@GetMapping(path="/listaTelefone")
	public List<Telefone> ListaTelefone () {
			
	return telefoneService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiTelefone")
	public void ExcluiTelefone () {
		
	}
	@GetMapping(path="/alterarTelefone")
	public void AlteraTelefone () {
		
	}
	
	@GetMapping(path="/buscaPorId")
	public void BuscaPorId () { 	
	}
	

	
    
	
}
