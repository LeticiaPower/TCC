package br.com.siscarros.app.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_veiculo")
public class Veiculo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Date anoFabricacao;
	private Date anoModelo;
	private String combustivel;
	private Integer portas;
	private String cambio;
	private Double cilindrada;
	private Integer kilometragem;
	private String detalhesVeiculo;
	private String placa;
	private Boolean visibilidadePlaca;
	@ManyToOne
	private Cor cor;
	@ManyToOne
	private Marca marca;
	@ManyToOne
	private Modelo modelo;
	@ManyToOne
	private Categoria categoria;
	@ManyToOne
	private Versao versao;
	@ManyToOne
	private Pessoa pessoa;
	@ManyToOne
	private DadosAnuncio dadosAnuncio;
	@ManyToMany
	private List<Caracteristica> caracteristicas;
	@OneToMany
	private List<Imagem> imagens;
		
	public Double getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(Double cilindrada) {
		this.cilindrada = cilindrada;
	}
	public String getDetalhesVeiculo() {
		return detalhesVeiculo;
	}
	public void setDetalhesVeiculo(String detalhesVeiculo) {
		this.detalhesVeiculo = detalhesVeiculo;
	}
	public List<Imagem> getImagens() {
		return imagens;
	}
	public void setImagens(List<Imagem> imagens) {
		this.imagens = imagens;
	}
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
		return cilindrada;
	}
	public void setPotencia(Double potencia) {
		this.cilindrada = potencia;
	}
	public Integer getKilometragem() {
		return kilometragem;
	}
	public void setKilometragem(Integer kilometragem) {
		this.kilometragem = kilometragem;
	}
	public String getDescricao() {
		return detalhesVeiculo;
	}
	public void setDescricao(String descricao) {
		this.detalhesVeiculo = descricao;
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
