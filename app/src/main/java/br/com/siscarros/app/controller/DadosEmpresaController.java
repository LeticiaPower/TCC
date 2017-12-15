package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.DadosEmpresa;
import br.com.siscarros.app.service.DadosEmpresaServiceInt;



@RestController
@RequestMapping("/dadosEmpresa")
public class DadosEmpresaController {
	
	@Autowired
    private DadosEmpresaServiceInt dadosEmpresaService;
	
	@GetMapping(path="/cadastraDadosEmpresa")
	public void CadastraDadosEmpresa () {	
	
	}
	
	
	@GetMapping(path="/listaDadosEmpresa")
	public List<DadosEmpresa> ListaDadosEmpresa () {
			
	return dadosEmpresaService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiDadosEmpresa")
	public void ExcluiDadosEmpresa () {
		
	}
	@GetMapping(path="/alterarDadosEmpresa")
	public void AlteraDadosEmpresa () {
		
	}
	
	@GetMapping(path="/buscaPorId")
	public void BuscaPorId () { 	
	}
	
	
	

}
