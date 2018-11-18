package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.PessoaDao;
import br.com.siscarros.app.entities.Pessoa;
import br.com.siscarros.app.entities.converter.PessoaConverter;
import br.com.siscarros.app.entities.dto.PessoaDTO;

@Service
public class PessoaService implements PessoaServiceInt {
	
	@Autowired
	private PessoaDao pessoaDao;
	
	@Autowired
	private PessoaConverter pessoaConverter; 

	@Override
	public PessoaDTO Cadastra(PessoaDTO pessoaDTO) {
		Pessoa pessoa = pessoaConverter.convertToEntity(pessoaDTO);
		Pessoa retorno = pessoaDao.save(pessoa);
		return pessoaConverter.convertToDTO(retorno);
	}

	@Override
	public PessoaDTO Altera(PessoaDTO pessoaDTO) {
		Pessoa pessoa = pessoaConverter.convertToEntity(pessoaDTO);
		Pessoa retorno = pessoaDao.save(pessoa);
		return pessoaConverter.convertToDTO(retorno);
	}

	@Override
	public void Deleta(Long id) {
		Pessoa pessoa = pessoaDao.findOne(id);
		pessoaDao.delete(pessoa);
		
	}

	@Override
	public List<PessoaDTO> ListaTodos() {
		List<Pessoa> pessoas = pessoaDao.findAll();
		return pessoaConverter.convertToDTO(pessoas);
	}

	@Override
	public PessoaDTO BuscaPorId(Long id) {
		Pessoa pessoa = pessoaDao.findOne(id);
		return pessoaConverter.convertToDTO(pessoa);
	}

	


}

