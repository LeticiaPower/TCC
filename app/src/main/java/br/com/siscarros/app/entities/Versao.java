package br.com.siscarros.app.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_versao")
public class Versao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nomeVersao;

	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeVersao() {
		return nomeVersao;
	}
	public void setNomeVersao(String nomeVersao) {
		this.nomeVersao = nomeVersao;
	}

	
	

}
