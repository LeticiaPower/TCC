package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Veiculo;
import br.com.siscarros.app.service.VeiculoServiceInt;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {
	
	@Autowired
    private VeiculoServiceInt veiculoService;
	
	@GetMapping(path="/cadastraVeiculo")
	public void CadastraVeiculo () {	
	}
	
	@GetMapping(path="/listaVeiculo")
	public List<Veiculo> ListaVeiculo () {
			
	return veiculoService.ListaTodos();		
	}
	
	@GetMapping(path="/excluiVeiculo")
	public void ExcluiVeiculo () {
		
	}
	@GetMapping(path="/alteraVeiculo")
	public void AlteraVeiculo () {
		
	}
	
	@GetMapping(path="/buscaPorId")
	public void BuscaPorId () { 	
	}
	

    

}
