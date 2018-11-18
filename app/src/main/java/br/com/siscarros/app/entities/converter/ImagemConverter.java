package br.com.siscarros.app.entities.converter;

import org.springframework.stereotype.Component;

import br.com.siscarros.app.entities.Imagem;
import br.com.siscarros.app.entities.Pessoa;
import br.com.siscarros.app.entities.dto.ImagemDTO;
import br.com.siscarros.app.entities.dto.PessoaDTO;
import br.com.siscarros.app.entities.util.BaseConverter;

@Component
public class ImagemConverter extends BaseConverter<Imagem, ImagemDTO>{

	@Override
	public ImagemDTO convertToDTO(Imagem entity) {
		ImagemDTO dto = new ImagemDTO();
		dto.setId(entity.getId());
		dto.setAnuncio(entity.getAnuncio());
		return dto;
	}

	@Override
	public Imagem convertToEntity(ImagemDTO dto) {
		Imagem imagem = new Imagem();
		imagem.setId(dto.getId());
		imagem.setAnuncio(dto.getAnuncio());
		return imagem;
	}

}

