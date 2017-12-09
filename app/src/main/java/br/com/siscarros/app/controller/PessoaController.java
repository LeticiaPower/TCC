package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Pessoa;
import br.com.siscarros.app.service.PessoaServiceInt;


@RestController
public class PessoaController {
	
	@GetMapping(path="/CadastraPessoa")
	public void CadastraPessoa () {	
	}
	
	
	@GetMapping(path="/ListaPessoa")
	public List<Pessoa> ListaPessoa () {
			
	return pessoaService.ListaPessoa();	
		
	}
	
	@GetMapping(path="/ExcluiPessoa")
	public void ExcluiPessoa () {
		
	}
	@GetMapping(path="/AlterarPessoa")
	public void AlteraPessoa () {
		
	}
	
	
	@Autowired
    private PessoaServiceInt pessoaService;
    
    


}
