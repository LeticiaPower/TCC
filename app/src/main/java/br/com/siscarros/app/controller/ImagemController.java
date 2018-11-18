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

import br.com.siscarros.app.entities.Imagem;
import br.com.siscarros.app.entities.dto.ImagemDTO;
import br.com.siscarros.app.entities.dto.PessoaDTO;
import br.com.siscarros.app.service.ImagemServiceInt;

@RestController
@RequestMapping("/imagem")
@CrossOrigin("*")
public class ImagemController {
	
	@Autowired
    private ImagemServiceInt imagemService;
	
	@PostMapping(path="/cadastraImagem")
	public void CadastraImagem(@RequestBody ImagemDTO imagemDTO) {
	imagemService.Cadastra(imagemDTO);
}
	
	
	@GetMapping(path="/listaImagem")
	public List<ImagemDTO> ListaImagem () {
	return imagemService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiImagem/{id}")
	public void ExcluiImagem(@PathVariable Long id) {
		imagemService.Deleta(id);
		
	}
	@PostMapping(path="/alterarImagem")
	public void AlteraImagem(@RequestBody ImagemDTO imagemDTO) {
		imagemService.Altera(imagemDTO);
		
	}
	
	@GetMapping(path="/buscaPorId/{id}")
	public ImagemDTO BuscaPorId (@PathVariable Long id) {
		return imagemService.BuscaPorId(id);
	}
	
}
