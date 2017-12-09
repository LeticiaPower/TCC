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
	public Veiculo CadastraVeiculo(Veiculo veiculo) {
		return veiculoDao.save(veiculo);
	}

	@Override
	public List<Veiculo> ListaVeiculo() {
		return veiculoDao.findAll();
	}
}

