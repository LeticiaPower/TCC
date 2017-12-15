package br.com.siscarros.app.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_usuario")
public class Imagem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private List<String> nomeImagem;
	@ManyToOne
	private DadosAnuncio anuncio;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public DadosAnuncio getAnuncio() {
		return anuncio;
	}
	public void setAnuncio(DadosAnuncio anuncio) {
		this.anuncio = anuncio;
	}
	public List<String> getNomeImagem() {
		return nomeImagem;
	}
	public void setNomeImagem(List<String> nomeImagem) {
		this.nomeImagem = nomeImagem;
	}
	
	
}
