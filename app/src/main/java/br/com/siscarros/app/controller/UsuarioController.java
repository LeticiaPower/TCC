package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Pessoa;
import br.com.siscarros.app.entities.Usuario;
import br.com.siscarros.app.service.UsuarioServiceInt;

@RestController
@RequestMapping("usuario")
@CrossOrigin("*")
public class UsuarioController {
	
	@Autowired
    private UsuarioServiceInt usuarioService;
    
	
	@RequestMapping(value="/cadastroUsuario", method=RequestMethod.POST)
	public void CadastraUsuario (@RequestBody Usuario usuario) {		
    
		usuarioService.Cadastra(usuario);
	}
    
	@GetMapping(path="/listaUsuario")
	public List<Usuario> ListaUsuario () {
			
	return usuarioService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiUsuario")
	public void ExcluiUsuario () {
		
	}
	@GetMapping(path="/alteraUsuario")
	public void AlteraUsuario () {
		
	}
	
	@GetMapping(path="/buscaPorId")
	public void BuscaPorId () { 	
	}
	

    
	
	
}
