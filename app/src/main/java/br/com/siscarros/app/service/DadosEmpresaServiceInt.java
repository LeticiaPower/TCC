package br.com.siscarros.app.service;

import java.util.List;

import br.com.siscarros.app.entities.DadosEmpresa;

public interface DadosEmpresaServiceInt {
	
	DadosEmpresa CadastraDadosEmpresa (DadosEmpresa dadosE);
	
	List<DadosEmpresa> ListaDadosEmpresa();

}
