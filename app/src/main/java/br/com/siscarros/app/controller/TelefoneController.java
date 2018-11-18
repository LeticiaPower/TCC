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

import br.com.siscarros.app.entities.Telefone;
import br.com.siscarros.app.entities.dto.PessoaDTO;
import br.com.siscarros.app.entities.dto.TelefoneDTO;
import br.com.siscarros.app.service.TelefoneServiceInt;



@RestController
@RequestMapping("/telefone")
@CrossOrigin("*")
public class TelefoneController {
	
	@Autowired
    private TelefoneServiceInt telefoneService;
    
	
	@PostMapping(path="/cadastraTelefone")
	public void CadastraTelefone(@RequestBody TelefoneDTO telefoneDTO) {
	telefoneService.Cadastra(telefoneDTO);
}
	
	
	@GetMapping(path="/listaTelefone")
	public List<TelefoneDTO> ListaTelefone () {
	return telefoneService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiTelefone")
	public void ExcluiTelefone(@PathVariable Long id) {
		telefoneService.Deleta(id);
		
	}
	@PostMapping(path="/alterarTelefone")
	public void AlteraTelefone(@RequestBody TelefoneDTO telefoneDTO) {
		telefoneService.Altera(telefoneDTO);
		
	}
	@GetMapping(path="/buscaPorId{id}")
	public TelefoneDTO BuscaPorId (@PathVariable Long id) {
		return telefoneService.BuscaPorId(id);
	}
	

	
    
	
}
