package br.com.siscarros.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.siscarros.app.dao.ModeloDao;
import br.com.siscarros.app.entities.Modelo;
import br.com.siscarros.app.entities.converter.ModeloConverter;
import br.com.siscarros.app.entities.dto.ModeloDTO;

@Service
public class ModeloService implements ModeloServiceInt{
	
	@Autowired
	private ModeloDao modeloDao;
	
	@Autowired
	private ModeloConverter modeloConverter;

	@Override
	public ModeloDTO Cadastra(ModeloDTO modeloDTO) {
		Modelo modelo = modeloConverter.convertToEntity(modeloDTO);
		Modelo retorno = modeloDao.save(modelo);
		return modeloConverter.convertToDTO(retorno);
	}

	@Override
	public ModeloDTO Altera(ModeloDTO modeloDTO) {
		Modelo modelo = modeloConverter.convertToEntity(modeloDTO);
		Modelo retorno = modeloDao.save(modelo);
		return modeloConverter.convertToDTO(retorno);
	}

	@Override
	public void Deleta(Long id) {
		Modelo modelo = modeloDao.findOne(id);
		modeloDao.delete(modelo);
		
	}

	@Override
	public List<ModeloDTO> ListaTodos() {
		List<Modelo> modelo = modeloDao.findAll();
		return modeloConverter.convertToDTO(modelo);
	}

	@Override
	public ModeloDTO BuscaPorId(Long id) {
		Modelo modelo = modeloDao.findOne(id);
		return modeloConverter.convertToDTO(modelo);
	}

	


}
