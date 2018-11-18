
package br.com.siscarros.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.siscarros.app.dao.CaracteristicaDao;
import br.com.siscarros.app.entities.Caracteristica;
import br.com.siscarros.app.entities.converter.CaracteristicaConverter;
import br.com.siscarros.app.entities.dto.CaracteristicaDTO;

@Service
public class CaracteristicaService implements CaracteristicaServiceInt{
	
	@Autowired
	private CaracteristicaDao caracteristicaDao;
	
	@Autowired
	private CaracteristicaConverter caracteristicaConverter;

	@Override
	public CaracteristicaDTO Cadastra(CaracteristicaDTO caracteristicaDTO) {
		Caracteristica caracteristica = caracteristicaConverter.convertToEntity(caracteristicaDTO);
		Caracteristica retorno = caracteristicaDao.save(caracteristica);
		return caracteristicaConverter.convertToDTO(retorno);
	}

	@Override
	public CaracteristicaDTO Altera(CaracteristicaDTO caracteristicaDTO) {
		Caracteristica caracteristica = caracteristicaConverter.convertToEntity(caracteristicaDTO);
		Caracteristica retorno = caracteristicaDao.save(caracteristica);
		return caracteristicaConverter.convertToDTO(retorno);
	}

	@Override
	public void Deleta(Long id) {
		Caracteristica caracteristica = caracteristicaDao.findOne(id);
		caracteristicaDao.delete(caracteristica);
		
	}

	@Override
	public List<CaracteristicaDTO> ListaTodos() {
		List<Caracteristica> caracteristicas = caracteristicaDao.findAll();
		return caracteristicaConverter.convertToDTO(caracteristicas);
	}

	@Override
	public CaracteristicaDTO BuscaPorId(Long id) {
		Caracteristica caracteristica = caracteristicaDao.findOne(id);
		return caracteristicaConverter.convertToDTO(caracteristica);
	}





}
