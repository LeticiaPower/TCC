package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Imagem;
import br.com.siscarros.app.service.ImagemServiceInt;

@RestController
@RequestMapping("/imagem")
public class ImagemController {
	
	@Autowired
    private ImagemServiceInt imagemService;
	
	@GetMapping(path="/cadastraImagem")
	public void CadastraImagem () {	
	}
	
	
	@GetMapping(path="/listaImagem")
	public List<Imagem> ListaImagem () {
			
	return imagemService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiImagem")
	public void ExcluiPessoa () {
		
	}
	@GetMapping(path="/alterarImagem")
	public void AlteraPessoa () {
		
	}
	
	@GetMapping(path="/buscaPorId")
	public void BuscaPorId () { 	
	}
	
}
