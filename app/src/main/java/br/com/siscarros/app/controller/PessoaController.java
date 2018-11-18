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

import br.com.siscarros.app.entities.Pessoa;
import br.com.siscarros.app.entities.dto.DadosAnuncioDTO;
import br.com.siscarros.app.entities.dto.PessoaDTO;
import br.com.siscarros.app.service.PessoaServiceInt;


@RestController
@RequestMapping("/pessoa")
@CrossOrigin("*")
public class PessoaController {
	
	
	@Autowired
    private PessoaServiceInt pessoaService;
	
	@PostMapping(path="/cadastraPessoa")
		public void CadastraPessoa (@RequestBody PessoaDTO pessoaDTO) {
		pessoaService.Cadastra(pessoaDTO);
	}
	
	
	@GetMapping(path="/listaPessoa")
	public List<PessoaDTO> ListaPessoa () {
		return pessoaService.ListaTodos();	
			
		}
	
	@GetMapping(path="/excluiPessoa/{id}")
	public void ExcluiPessoa (@PathVariable Long id) {
		pessoaService.Deleta(id);
		
	}
	@PostMapping(path="/alterarPessoa")
	public void AlteraPessoa (@RequestBody PessoaDTO pessoaDTO) {
		pessoaService.Altera(pessoaDTO);
		
	}
	
	@GetMapping(path="/buscaPorId/{id}")
	public PessoaDTO BuscaPorId (@PathVariable Long id) {
		return pessoaService.BuscaPorId(id);
	}
    
    


}
