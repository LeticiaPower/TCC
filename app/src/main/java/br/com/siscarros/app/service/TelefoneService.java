package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.TelefoneDao;
import br.com.siscarros.app.entities.Pessoa;
import br.com.siscarros.app.entities.Telefone;
import br.com.siscarros.app.entities.converter.PessoaConverter;
import br.com.siscarros.app.entities.converter.TelefoneConverter;
import br.com.siscarros.app.entities.dto.PessoaDTO;
import br.com.siscarros.app.entities.dto.TelefoneDTO;

@Service
public class TelefoneService implements TelefoneServiceInt{
	
	@Autowired
	private TelefoneDao telefoneDao;

	@Autowired
	private TelefoneConverter telefoneConverter;
	
	@Override
	public TelefoneDTO Cadastra(TelefoneDTO telefoneDTO) {
		Telefone telefone = telefoneConverter.convertToEntity(telefoneDTO);
		Telefone retorno = telefoneDao.save(telefone);
		return telefoneConverter.convertToDTO(retorno);
	}

	@Override
	public TelefoneDTO Altera(TelefoneDTO telefoneDTO) {
		Telefone telefone = telefoneConverter.convertToEntity(telefoneDTO);
		Telefone retorno = telefoneDao.save(telefone);
		return telefoneConverter.convertToDTO(retorno);
	}

	@Override
	public void Deleta(Long id) {
		Telefone telefone = telefoneDao.findOne(id);
		telefoneDao.delete(telefone);
		
	}

	@Override
	public List<TelefoneDTO> ListaTodos() {
		List<Telefone> telefones = telefoneDao.findAll();
		return telefoneConverter.convertToDTO(telefones);
	}

	@Override
	public TelefoneDTO BuscaPorId(Long id) {
		Telefone telefone = telefoneDao.findOne(id);
		return telefoneConverter.convertToDTO(telefone);
	}

	


}
