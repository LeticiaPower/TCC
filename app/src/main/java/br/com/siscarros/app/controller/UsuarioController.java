package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import br.com.siscarros.app.entities.Usuario;
import br.com.siscarros.app.entities.dto.PessoaDTO;
import br.com.siscarros.app.entities.dto.UsuarioDTO;
import br.com.siscarros.app.service.UsuarioServiceInt;

@RestController
@RequestMapping("usuario")
@CrossOrigin("*")
public class UsuarioController {
	
	@Autowired
    private UsuarioServiceInt usuarioService;
    
	
	@RequestMapping(value="/cadastroUsuario", method=RequestMethod.POST)
	public void CadastraUsuario (@RequestBody UsuarioDTO usuarioDTO) {		
    
		usuarioService.Cadastra(usuarioDTO);
	}
    
	@GetMapping(path="/listaUsuario")
	public List<UsuarioDTO> ListaUsuario () {
			
	return usuarioService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiUsuario/{id}")
	public void ExcluiUsuario (@PathVariable Long id) {
		usuarioService.Deleta(id);
		
	}
	@PostMapping(path="/alteraUsuario")
	public void AlteraUsuario(@RequestBody UsuarioDTO usuarioDTO) {
		usuarioService.Altera(usuarioDTO);
		
	}
	
	@GetMapping(path="/buscaPorId/{id}")
	public UsuarioDTO BuscaPorId (@PathVariable Long id) {
		return usuarioService.BuscaPorId(id);
	}
	

    
	
	
}
