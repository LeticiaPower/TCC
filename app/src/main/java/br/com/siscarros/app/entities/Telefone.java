package br.com.siscarros.app.entities;

public class Telefone {

	private Long id;
	private Integer numeroTelefone;
	private String tipoTelefone;
	private DadosEmpresa dadosEmpresa;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getNumeroTelefone() {
		return numeroTelefone;
	}
	public void setNumeroTelefone(Integer numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	public String getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	public DadosEmpresa getDadosEmpresa() {
		return dadosEmpresa;
	}
	public void setDadosEmpresa(DadosEmpresa dadosEmpresa) {
		this.dadosEmpresa = dadosEmpresa;
	}
	
	
	
	
}
