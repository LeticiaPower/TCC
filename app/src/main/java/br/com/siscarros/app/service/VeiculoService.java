package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.VeiculoDao;
import br.com.siscarros.app.entities.Veiculo;
import br.com.siscarros.app.entities.Veiculo;
import br.com.siscarros.app.entities.converter.VeiculoConverter;
import br.com.siscarros.app.entities.converter.VeiculoConverter;
import br.com.siscarros.app.entities.dto.VeiculoDTO;
import br.com.siscarros.app.entities.dto.VeiculoDTO;

@Service
public class VeiculoService implements VeiculoServiceInt {
	
	@Autowired
	private VeiculoDao veiculoDao;
	
	@Autowired
	private VeiculoConverter veiculoConverter;

	@Override
	public VeiculoDTO Cadastra(VeiculoDTO veiculoDTO) {
		Veiculo veiculo = veiculoConverter.convertToEntity(veiculoDTO);
		Veiculo retorno = veiculoDao.save(veiculo);
		return veiculoConverter.convertToDTO(retorno);
	}

	@Override
	public VeiculoDTO Altera(VeiculoDTO veiculoDTO) {
		Veiculo veiculo = veiculoConverter.convertToEntity(veiculoDTO);
		Veiculo retorno = veiculoDao.save(veiculo);
		return veiculoConverter.convertToDTO(retorno);
	}

	@Override
	public void Deleta(Long id) {
		Veiculo veiculo = veiculoDao.findOne(id);
		veiculoDao.delete(veiculo);
		
	}

	@Override
	public List<VeiculoDTO> ListaTodos() {
		List<Veiculo> veiculos = veiculoDao.findAll();
		return veiculoConverter.convertToDTO(veiculos);
	}

	@Override
	public VeiculoDTO BuscaPorId(Long id) {
		Veiculo veiculo = veiculoDao.findOne(id);
		return veiculoConverter.convertToDTO(veiculo);
	}

	


}

