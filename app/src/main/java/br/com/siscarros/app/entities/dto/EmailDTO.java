package br.com.siscarros.app.entities.dto;


import br.com.siscarros.app.entities.DadosEmpresa;

public class EmailDTO {
	
	private Long id;
	private String nomeEmail;
	private String tipoEmail;
	private DadosEmpresa dadosEmpresa;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeEmail() {
		return nomeEmail;
	}
	public void setNomeEmail(String nomeEmail) {
		this.nomeEmail = nomeEmail;
	}
	public String getTipoEmail() {
		return tipoEmail;
	}
	public void setTipoEmail(String tipoEmail) {
		this.tipoEmail = tipoEmail;
	}
	public DadosEmpresa getDadosEmpresa() {
		return dadosEmpresa;
	}
	public void setDadosEmpresa(DadosEmpresa dadosEmpresa) {
		this.dadosEmpresa = dadosEmpresa;
	}
	
	

}
