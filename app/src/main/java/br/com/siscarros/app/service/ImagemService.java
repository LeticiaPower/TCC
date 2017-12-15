package br.com.siscarros.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.siscarros.app.dao.ImagemDao;
import br.com.siscarros.app.entities.Imagem;


@Service
public class ImagemService implements ImagemServiceInt{
	
	@Autowired
	private ImagemDao imagemDao;

	@Override
	public Imagem Cadastra(Imagem nomeImagem) {
		return imagemDao.save(nomeImagem);
	}

	@Override
	public Imagem Altera(Imagem nomeImagem) {
		return imagemDao.save(nomeImagem);
	}

	@Override
	public void Deleta(Long id) {
		imagemDao.delete(id);
	}

	@Override
	public List<Imagem> ListaTodos() {
		return imagemDao.findAll();
	}

	@Override
	public Imagem BuscaPorId(Long id) {
		return imagemDao.findOne(id);
	}



	



}
