package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Pessoa;
import br.com.siscarros.app.entities.Usuario;
import br.com.siscarros.app.service.UsuarioServiceInt;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
    private UsuarioServiceInt usuarioService;
    
	
	@GetMapping(path="/cadastroUsuario")
	public void TesteUsuario () {		
	
		
	Pessoa p = new Pessoa();
	p.setNome("Ana");
	p.setCpf("025.265.265-42");
	p.setCep("72.240-807");
	p.setCelular(32536579);
		
		
	Usuario u = new Usuario();
	u.setLogin("LeticiaPower");
	u.setSenha("lilica");
	u.setStatus(false);
    u.setPessoa(p);
    
    usuarioService.Cadastra(u);
    
    
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
