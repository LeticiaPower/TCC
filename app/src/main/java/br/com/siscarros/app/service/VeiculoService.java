package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.VeiculoDao;
import br.com.siscarros.app.entities.Veiculo;


@Service
public class VeiculoService implements VeiculoServiceInt{
	
	@Autowired
	private VeiculoDao veiculoDao;

	@Override
	public Veiculo Cadastra(Veiculo veiculo) {
		return veiculoDao.save(veiculo);
	}

	@Override
	public Veiculo Altera(Veiculo veiculo) {
		return veiculoDao.save(veiculo);
	}

	@Override
	public void Deleta(Long id) {
		
	}

	@Override
	public List<Veiculo> ListaTodos() {
		return veiculoDao.findAll();
	}

	@Override
	public Veiculo BuscaPorId(Long id) {
		return veiculoDao.findOne(id);
	}

	
}
