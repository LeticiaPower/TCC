package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.siscarros.app.entities.Pessoa;
import br.com.siscarros.app.entities.Usuario;
import br.com.siscarros.app.service.UsuarioServiceInt;

@RestController(value="/usuario")
public class UsuarioController {
	
	@Autowired
    private UsuarioServiceInt usuarioService;
    
	
	@GetMapping(path="/CadastroUsuario")
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
    
	@GetMapping(path="/ListaUsuario")
	public List<Usuario> ListaUsuario () {
			
	return usuarioService.ListaTodos();	
		
	}
	
	@GetMapping(path="/ExcluiUsuario")
	public void ExcluiUsuario () {
		
	}
	@GetMapping(path="/AlteraUsuario")
	public void AlteraUsuario () {
		
	}
	
	@GetMapping(path="/BuscaPorId")
	public void BuscaPorId () { 	
	}
	

    
	
	
}
