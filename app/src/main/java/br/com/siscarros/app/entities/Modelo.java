package br.com.siscarros.app.entities;

import java.util.List;

public class Modelo {
	
	
	private Long id;
	private String nomeModelo;
	private List<Versao> versoes;
	
	
	
	
	public List<Versao> getVersoes() {
		return versoes;
	}
	public void setVersoes(List<Versao> versoes) {
		this.versoes = versoes;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeModelo() {
		return nomeModelo;
	}
	public void setNomeModelo(String nomeModelo) {
		this.nomeModelo = nomeModelo;
	}
	
	
	

}
