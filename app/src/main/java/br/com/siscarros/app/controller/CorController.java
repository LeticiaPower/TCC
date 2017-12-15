package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Cor;
import br.com.siscarros.app.service.CorServiceInt;


@RestController
@RequestMapping("/cor")
class CorController {
	
	@Autowired
    private CorServiceInt corService;
	
	@GetMapping(path="/cadastraCor")
	public void CadastraCor () {	
	}
	
	
	@GetMapping(path="/listaCor")
	public List<Cor> ListaCor () {
			
	return corService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiCor")
	public void ExcluiCor () {
		
	}
	@GetMapping(path="/alterarCor")
	public void AlteraCor () {
		
	}
	
	@GetMapping(path="/buscaPorId")
	public void BuscaPorId () { 	
	}
	
	
    

}
