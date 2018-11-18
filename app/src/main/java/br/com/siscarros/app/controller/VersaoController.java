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

import br.com.siscarros.app.entities.Versao;
import br.com.siscarros.app.entities.dto.PessoaDTO;
import br.com.siscarros.app.entities.dto.VersaoDTO;
import br.com.siscarros.app.service.VersaoServiceInt;



@RestController
@RequestMapping("/versao")
@CrossOrigin("*")
public class VersaoController {
	
	@Autowired
    private VersaoServiceInt versaoService;
	
	@PostMapping(path="/cadastraVersao")
	public void CadastraVersao (@RequestBody VersaoDTO versaoDTO) {
	versaoService.Cadastra(versaoDTO);
}
	
	@GetMapping(path="/listaVersao")
	public List<VersaoDTO> ListaVersao () {
	return versaoService.ListaTodos();		
	}
	
	@GetMapping(path="/excluiVersao/{id}")
	public void ExcluiVersao () {
		
		
	}
	@PostMapping(path="/alteraVersao")
	public void AlteraVersao(@RequestBody VersaoDTO versaoDTO) {
		versaoService.Altera(versaoDTO);
		
	}
	
	@GetMapping(path="/buscaPorId")
	public VersaoDTO BuscaPorId (@PathVariable Long id) {
		return versaoService.BuscaPorId(id);
	}
	

    
    
	
	
}


