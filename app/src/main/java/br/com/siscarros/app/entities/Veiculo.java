package br.com.siscarros.app.entities;

import java.util.Date;
import java.util.List;

public class Veiculo {

	private Long id;
	private Date anoFabricacao;
	private Date anoModelo;
	private String combustivel;
	private Integer portas;
	private String cambio;
	private Double potencia;
	private Integer kilometragem;
	private String descricao;
	private String placa;
	private Boolean visibilidadePlaca;
	private Cor cor;
	private Marca marca;
	private Modelo modelo;
	private Categoria categoria;
	private Versao versao;
	private Pessoa pessoa;
	private DadosAnuncio dadosAnuncio;
	private List<Caracteristica> caracteristicas;
	
	
	
	public DadosAnuncio getDadosAnuncio() {
		return dadosAnuncio;
	}
	public void setDadosAnuncio(DadosAnuncio dadosAnuncio) {
		this.dadosAnuncio = dadosAnuncio;
	}
	public Long getId() {
		return id;
	}
	public List<Caracteristica> getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(List<Caracteristica> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(Date anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public Date getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(Date anoModelo) {
		this.anoModelo = anoModelo;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public Integer getPortas() {
		return portas;
	}
	public void setPortas(Integer portas) {
		this.portas = portas;
	}
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	public Double getPotencia() {
		return potencia;
	}
	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}
	public Integer getKilometragem() {
		return kilometragem;
	}
	public void setKilometragem(Integer kilometragem) {
		this.kilometragem = kilometragem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Boolean getVisibilidadePlaca() {
		return visibilidadePlaca;
	}
	public void setVisibilidadePlaca(Boolean visibilidadePlaca) {
		this.visibilidadePlaca = visibilidadePlaca;
	}
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Versao getVersao() {
		return versao;
	}
	public void setVersao(Versao versao) {
		this.versao = versao;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	
	
	
	
}
