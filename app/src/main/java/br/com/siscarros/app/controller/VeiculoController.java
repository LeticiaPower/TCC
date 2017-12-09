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
	
	@GetMapping(path="/CadastraVeiculo")
	public void CadastraVeiculo () {	
	}
	
	@GetMapping(path="/ListaVeiculo")
	public List<Veiculo> ListaVeiculo () {
			
	return veiculoService.ListaTodos();		
	}
	
	@GetMapping(path="/ExcluiVeiculo")
	public void ExcluiVeiculo () {
		
	}
	@GetMapping(path="/AlteraVeiculo")
	public void AlteraVeiculo () {
		
	}
	
	@GetMapping(path="/BuscaPorId")
	public void BuscaPorId () { 	
	}
	

    

}
