package br.com.siscarros.app.service;

import java.util.List;

import br.com.siscarros.app.entities.Pessoa;

public interface PessoaServiceInt {
	
	Pessoa CadastraPessoa (Pessoa pessoa);
	
	List<Pessoa> ListaPessoa();
	
	
}
