package br.com.siscarros.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.siscarros.app.dao.MarcaDao;
import br.com.siscarros.app.entities.Marca;
import br.com.siscarros.app.entities.converter.MarcaConverter;
import br.com.siscarros.app.entities.dto.MarcaDTO;

@Service
public class MarcaService implements MarcaServiceInt{
	
	@Autowired
	private MarcaDao marcaDao;
	
	@Autowired
	private MarcaConverter marcaConverter;

	@Override
	public MarcaDTO Cadastra(MarcaDTO marcaDTO) {
		Marca marca = marcaConverter.convertToEntity(marcaDTO);
		Marca retorno = marcaDao.save(marca);
		return marcaConverter.convertToDTO(retorno);
	}

	@Override
	public MarcaDTO Altera(MarcaDTO marcaDTO) {
		Marca marca = marcaConverter.convertToEntity(marcaDTO);
		Marca retorno = marcaDao.save(marca);
		return marcaConverter.convertToDTO(retorno);
	}

	@Override
	public void Deleta(Long id) {
		Marca marca = marcaDao.findOne(id);
		marcaDao.delete(marca);
		
	}

	@Override
	public List<MarcaDTO> ListaTodos() {
		List<Marca> marcas = marcaDao.findAll();
		return marcaConverter.convertToDTO(marcas);
	}

	@Override
	public MarcaDTO BuscaPorId(Long id) {
		Marca marca = marcaDao.findOne(id);
		return marcaConverter.convertToDTO(marca);
	}





}
