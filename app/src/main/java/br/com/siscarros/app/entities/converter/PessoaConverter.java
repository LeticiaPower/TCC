package br.com.siscarros.app.entities.converter;

import org.springframework.stereotype.Component;

import br.com.siscarros.app.entities.Pessoa;
import br.com.siscarros.app.entities.dto.PessoaDTO;
import br.com.siscarros.app.entities.util.BaseConverter;

@Component
public class PessoaConverter extends BaseConverter<Pessoa, PessoaDTO>{

	@Override
	public PessoaDTO convertToDTO(Pessoa entity) {
		PessoaDTO dto = new PessoaDTO();
		dto.setId(entity.getId());
		dto.setBairro(entity.getBairro());
		dto.setCelular(entity.getCelular());
		dto.setCep(entity.getCep());
		dto.setCidade(entity.getCidade());
		dto.setComplemento(entity.getComplemento());
		dto.setCpf(entity.getComplemento());
		dto.setDataNasc(entity.getDataNasc());
		dto.setEstado(entity.getEstado());
		dto.setLogradouro(entity.getLogradouro());
		dto.setNome(entity.getNome());
		dto.setNumero(entity.getNumero());
		dto.setPais(entity.getPais());
		dto.setTelefone(entity.getTelefone());
		dto.setDadosEmpresa(entity.getDadosEmpresa());
		return dto;
	}

	@Override
	public Pessoa convertToEntity(PessoaDTO dto) {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(dto.getId());
		pessoa.setBairro(dto.getBairro());
		pessoa.setCelular(dto.getCelular());
		pessoa.setCep(dto.getCep());
		pessoa.setCidade(dto.getCidade());
		pessoa.setComplemento(dto.getComplemento());
		pessoa.setCpf(dto.getComplemento());
		pessoa.setDataNasc(dto.getDataNasc());
		pessoa.setEstado(dto.getEstado());
		pessoa.setLogradouro(dto.getLogradouro());
		pessoa.setNome(dto.getNome());
		pessoa.setNumero(dto.getNumero());
		pessoa.setPais(dto.getPais());
		pessoa.setTelefone(dto.getTelefone());
		pessoa.setDadosEmpresa(dto.getDadosEmpresa());
		return pessoa;
	}

}
