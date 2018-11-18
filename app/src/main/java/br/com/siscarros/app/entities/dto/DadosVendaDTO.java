package br.com.siscarros.app.entities.dto;


import br.com.siscarros.app.entities.DadosAnuncio;

public class DadosVendaDTO {
	
	private Long id;
	private Double valor;
	private Boolean troca;
	private Boolean parcela;
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
