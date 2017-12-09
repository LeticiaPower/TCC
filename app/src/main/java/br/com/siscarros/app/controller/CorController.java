package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Cor;
import br.com.siscarros.app.service.CorServiceInt;


@RestController
class CorController {
	@GetMapping(path="/CadastraCor")
	public void CadastraCor () {	
	}
	
	
	@GetMapping(path="/ListaCor")
	public List<Cor> ListaCor () {
			
	return corService.ListaCor();	
		
	}
	
	@GetMapping(path="/ExcluiCor")
	public void ExcluiCor () {
		
	}
	@GetMapping(path="/AlterarCor")
	public void AlteraCor () {
		
	}
	
	
	@Autowired
    private CorServiceInt corService;
    

}
