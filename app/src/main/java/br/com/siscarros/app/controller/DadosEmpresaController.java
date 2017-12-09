package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.DadosEmpresa;
import br.com.siscarros.app.service.DadosEmpresaServiceInt;



@RestController
public class DadosEmpresaController {
	@GetMapping(path="/CadastraDadosEmpresa")
	public void CadastraDadosEmpresa () {	
	}
	
	
	@GetMapping(path="/ListaDadosEmpresa")
	public List<DadosEmpresa> ListaDadosEmpresa () {
			
	return dadosEmpresaService.ListaDadosEmpresa();	
		
	}
	
	@GetMapping(path="/ExcluiDadosEmpresa")
	public void ExcluiDadosEmpresa () {
		
	}
	@GetMapping(path="/AlterarDadosEmpresa")
	public void AlteraDadosEmpresa () {
		
	}
	
	
	@Autowired
    private DadosEmpresaServiceInt dadosEmpresaService;

}
