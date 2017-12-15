package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Pessoa;
import br.com.siscarros.app.service.PessoaServiceInt;


@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	
	@Autowired
    private PessoaServiceInt pessoaService;
	
	@GetMapping(path="/cadastraPessoa")
	public void CadastraPessoa () {	
	}
	
	
	@GetMapping(path="/listaPessoa")
	public List<Pessoa> ListaPessoa () {
			
	return pessoaService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiPessoa")
	public void ExcluiPessoa () {
		
	}
	@GetMapping(path="/alterarPessoa")
	public void AlteraPessoa () {
		
	}
	
	@GetMapping(path="/buscaPorId")
	public void BuscaPorId () { 	
	}
	

    
    


}
