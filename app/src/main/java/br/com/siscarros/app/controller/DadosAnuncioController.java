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
import br.com.siscarros.app.entities.dto.DadosAnuncioDTO;
import br.com.siscarros.app.service.DadosAnuncioServiceInt;



@RestController
@RequestMapping("/dadosAnuncio")
@CrossOrigin("*")
public class DadosAnuncioController {
	
	@Autowired
    private DadosAnuncioServiceInt dadosAnuncioService;
	
	@PostMapping(path="/cadastraDadosAnuncio")
	public void CadastraDadosAnuncio (@RequestBody DadosAnuncioDTO dadosAnuncioDTO) {
		dadosAnuncioService.Cadastra(dadosAnuncioDTO);
	}
	
	
	@GetMapping(path="/listaDadosAnuncio")
	public List<DadosAnuncioDTO> ListaDadosAnuncio () {
	return dadosAnuncioService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiDadosAnuncio/{id}")
	public void ExcluiDadosAnuncio (@PathVariable Long id) {
		dadosAnuncioService.Deleta(id);
		
	}
	@PostMapping(path="/alterarDadosanuncio")
	public void AlteraDadosAnuncio (@RequestBody DadosAnuncioDTO dadosAnuncioDTO) {
		dadosAnuncioService.Altera(dadosAnuncioDTO);
		
	}
	
	@GetMapping(path="/buscaPorId/{id}")
	public DadosAnuncioDTO BuscaPorId (@PathVariable Long id) {
		return dadosAnuncioService.BuscaPorId(id);
	}
	
	
    

}
