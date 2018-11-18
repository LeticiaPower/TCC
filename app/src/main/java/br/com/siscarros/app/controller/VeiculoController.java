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

import br.com.siscarros.app.entities.dto.VeiculoDTO;
import br.com.siscarros.app.service.VeiculoServiceInt;


@RestController
@RequestMapping("/veiculo")
@CrossOrigin("*")
public class VeiculoController {
	
	
	@Autowired
    private VeiculoServiceInt veiculoService;
	
	@PostMapping(path="/cadastraVeiculo")
		public void CadastraVeiculo(@RequestBody VeiculoDTO veiculoDTO) {
		veiculoService.Cadastra(veiculoDTO);
	}
	
	
	@GetMapping(path="/listaVeiculo")
	public List<VeiculoDTO> ListaVeiculo () {
		return veiculoService.ListaTodos();	
			
		}
	
	@GetMapping(path="/excluiVeiculo/{id}")
	public void ExcluiVeiculo(@PathVariable Long id) {
		veiculoService.Deleta(id);
		
	}
	@PostMapping(path="/alterarVeiculo")
	public void AlteraVeiculo(@RequestBody VeiculoDTO veiculoDTO) {
		veiculoService.Altera(veiculoDTO);
		
	}
	
	@GetMapping(path="/buscaPorId/{id}")
	public VeiculoDTO BuscaPorId (@PathVariable Long id) {
		return veiculoService.BuscaPorId(id);
	}
    
    


}

