package br.com.siscarros.app.entities.dto;



import br.com.siscarros.app.entities.DadosAnuncio;

public class ImagemDTO {


	private Long id;
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
	

	
	
	
}
