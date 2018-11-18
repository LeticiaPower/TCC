package br.com.siscarros.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.siscarros.app.dao.ImagemDao;
import br.com.siscarros.app.entities.Imagem;
import br.com.siscarros.app.entities.converter.ImagemConverter;
import br.com.siscarros.app.entities.dto.ImagemDTO;


@Service
public class ImagemService implements ImagemServiceInt{
	
	@Autowired
	private ImagemDao imagemDao;
	
	@Autowired
	private ImagemConverter imagemConverter;

	@Override
	public ImagemDTO Cadastra(ImagemDTO imagemDTO) {
		Imagem imagem = imagemConverter.convertToEntity(imagemDTO);
		Imagem retorno = imagemDao.save(imagem);
		return imagemConverter.convertToDTO(retorno);
	}

	@Override
	public ImagemDTO Altera(ImagemDTO imagemDTO) {
		Imagem imagem = imagemConverter.convertToEntity(imagemDTO);
		Imagem retorno = imagemDao.save(imagem);
		return imagemConverter.convertToDTO(retorno);
	}

	@Override
	public void Deleta(Long id) {
		Imagem imagem = imagemDao.findOne(id);
		imagemDao.delete(imagem);
		
	}

	@Override
	public List<ImagemDTO> ListaTodos() {
		List<Imagem> imagem = imagemDao.findAll();
		return imagemConverter.convertToDTO(imagem);
	}

	@Override
	public ImagemDTO BuscaPorId(Long id) {
		Imagem imagem = imagemDao.findOne(id);
		return imagemConverter.convertToDTO(imagem);
	}


}
