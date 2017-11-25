package br.com.siscarros.app.entities;

import java.util.Date;

public class DadosAnuncio {

	private Long id;
	private String titulo;
	private Date dataDoCadastro;
	private Date dataUpdate;
	private Date dataExpirecao;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getDataDoCadastro() {
		return dataDoCadastro;
	}
	public void setDataDoCadastro(Date dataDoCadastro) {
		this.dataDoCadastro = dataDoCadastro;
	}
	public Date getDataUpdate() {
		return dataUpdate;
	}
	public void setDataUpdate(Date dataUpdate) {
		this.dataUpdate = dataUpdate;
	}
	public Date getDataExpirecao() {
		return dataExpirecao;
	}
	public void setDataExpirecao(Date dataExpirecao) {
		this.dataExpirecao = dataExpirecao;
	}
	
	
	
	
}
