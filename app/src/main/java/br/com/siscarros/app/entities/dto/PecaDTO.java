package br.com.siscarros.app.entities.dto;

import br.com.siscarros.app.entities.DadosEmpresa;
import br.com.siscarros.app.entities.Pessoa;

public class PecaDTO {
	
	private Long id;
	private String tipo;
	private String aplicacao;
	private Pessoa pessoa;
	
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getAplicacao() {
		return aplicacao;
	}
	public void setAplicacao(String aplicacao) {
		this.aplicacao = aplicacao;
	}
	
	
	

}
