package br.com.siscarros.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_caracteristica")
public class Caracteristica {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nomeCaracteristicas;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeCaracteristica() {
		return nomeCaracteristicas;
	}
	public void setNomeCaracteristica(String nomeCaracteristicas) {
		this.nomeCaracteristicas = nomeCaracteristicas;
	}



	
	
	
	

}
