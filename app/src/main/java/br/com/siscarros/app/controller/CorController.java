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
import br.com.siscarros.app.entities.dto.CorDTO;
import br.com.siscarros.app.service.CorServiceInt;


@RestController
@RequestMapping("/cor")
@CrossOrigin("*")
public class CorController {
	
	@Autowired
    private CorServiceInt corService;
	
	@PostMapping(path="/cadastraCor")
	public void CadastraCor (@RequestBody CorDTO corDTO) {
		corService.Cadastra(corDTO);
	}
	
	
	@GetMapping(path="/listaCor")
	public List<CorDTO> ListaCor () {
	return corService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiCor/{id}")
	public void ExcluiCor (@PathVariable Long id) {
		corService.Deleta(id);
	}
	@PostMapping(path="/alterarCor")
	public void AlteraCor (@RequestBody CorDTO corDTO) {
		corService.Altera(corDTO);
	}
	
	@GetMapping(path="/buscaPorId/{id}")
	public CorDTO BuscaPorId (@PathVariable Long id) {
		return corService.BuscaPorId(id);
	}
	
	
    

}
