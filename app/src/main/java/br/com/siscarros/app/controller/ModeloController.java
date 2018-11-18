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

import br.com.siscarros.app.dao.ModeloDao;
import br.com.siscarros.app.entities.Modelo;
import br.com.siscarros.app.entities.dto.ModeloDTO;
import br.com.siscarros.app.entities.dto.PessoaDTO;
import br.com.siscarros.app.service.ModeloServiceInt;


@RestController
@RequestMapping("/modelo")
@CrossOrigin("*")
public class ModeloController {
	
	@Autowired
    private ModeloServiceInt modeloService;
    

	@PostMapping(path="/cadastraModelo")
	public void CadastraModelo (@RequestBody ModeloDTO modeloDTO) {
		modeloService.Cadastra(modeloDTO);
	}
	
	
	@GetMapping(path="/listaModelo")
	public List<ModeloDTO> ListaModelo () {		
	return modeloService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiModelo/{id}")
	public void ExcluiModelo (@PathVariable Long id) {
		modeloService.Deleta(id);
		
	}
	@PostMapping(path="/alterarModelo")
	public void AlteraModelo(@RequestBody ModeloDTO modeloDTO) {
		modeloService.Altera(modeloDTO);
		
	}
	
	
	@GetMapping(path="/buscaPorId/{id}")
	public ModeloDTO BuscaPorId (@PathVariable Long id) {
		return modeloService.BuscaPorId(id);
	}
	
	
	
}
