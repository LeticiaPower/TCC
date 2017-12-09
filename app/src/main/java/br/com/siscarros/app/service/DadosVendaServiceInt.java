package br.com.siscarros.app.service;

import java.util.List;

import br.com.siscarros.app.entities.DadosVenda;

public interface DadosVendaServiceInt {
	
	DadosVenda CadastraDadosVenda (DadosVenda dadosV);
	
	List<DadosVenda> ListaDadosVenda();

}
