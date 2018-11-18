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
import br.com.siscarros.app.entities.dto.DadosEmpresaDTO;
import br.com.siscarros.app.service.DadosEmpresaServiceInt;



@RestController
@RequestMapping("/dadosEmpresa")
@CrossOrigin("*")
public class DadosEmpresaController {
	
	@Autowired
    private DadosEmpresaServiceInt dadosEmpresaService;
	
	@PostMapping(path="/cadastraDadosEmpresa")
	public void CadastraDadosEmpresa (@RequestBody DadosEmpresaDTO dadosEmpresaDTO) {
		dadosEmpresaService.Cadastra(dadosEmpresaDTO);
	
	}
	
	
	@GetMapping(path="/listaDadosEmpresa")
	public List<DadosEmpresaDTO> ListaDadosEmpresa () {
	return dadosEmpresaService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiDadosEmpresa/{id}")
		public void ExcluiDadosEmpresa (@PathVariable Long id) {
		dadosEmpresaService.Deleta(id);
	}
	@PostMapping(path="/alterarDadosEmpresa")
	public void AlteraDadosEmpresa (@RequestBody DadosEmpresaDTO dadosEmpresaDTO) {
		dadosEmpresaService.Altera(dadosEmpresaDTO);
	}
	
	@GetMapping(path="/buscaPorId/{id}")
	public DadosEmpresaDTO BuscaPorId (@PathVariable Long id) {
		return dadosEmpresaService.BuscaPorId(id);
	}
	
	
	

}
