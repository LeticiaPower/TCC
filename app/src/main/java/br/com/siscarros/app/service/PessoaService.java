package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.PessoaDao;
import br.com.siscarros.app.entities.Pessoa;

@Service
public class PessoaService implements PessoaServiceInt{
	
	@Autowired
	private PessoaDao pessoaDao;

	@Override
	public Pessoa CadastraPessoa(Pessoa pessoa) {
		return pessoaDao.save(pessoa);
	}

	@Override
	public List<Pessoa> ListaPessoa() {
		return pessoaDao.findAll();
	}

}
