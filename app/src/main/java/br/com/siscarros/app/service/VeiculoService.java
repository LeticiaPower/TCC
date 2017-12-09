package br.com.siscarros.app.service;

import java.util.List;

import br.com.siscarros.app.entities.Veiculo;

public interface VeiculoServiceInt {
	
	Veiculo CadastraVeiculo (Veiculo veiculo);
	
	List<Veiculo> ListaVeiculo();

}
