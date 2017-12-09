package br.com.siscarros.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_dadosVenda")
public class DadosVenda {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Double valor;
	private Boolean troca;
	private Boolean parcela;
	@OneToOne
	private DadosAnuncio dadosAnuncio;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Boolean getTroca() {
		return troca;
	}
	public void setTroca(Boolean troca) {
		this.troca = troca;
	}
	public Boolean getParcela() {
		return parcela;
	}
	public void setParcela(Boolean parcela) {
		this.parcela = parcela;
	}
	public DadosAnuncio getDadosAnuncio() {
		return dadosAnuncio;
	}
	public void setDadosAnuncio(DadosAnuncio dadosAnuncio) {
		this.dadosAnuncio = dadosAnuncio;
	}
	
	

}
