package br.com.siscarros.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_email")
public class Email {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nomeEmail;
	private String tipoEmail;
	@ManyToOne
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
