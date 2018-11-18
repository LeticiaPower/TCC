package br.com.siscarros.app.entities.dto;

import java.util.List;

import br.com.siscarros.app.entities.Versao;

public class ModeloDTO {

	
	private Long id;
	private String nomeModelo;
	private List<Versao> versao;
	
	
	
	
	public List<Versao> getVersao() {
		return versao;
	}
	public void setVersao(List<Versao> versao) {
		this.versao = versao;
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
