package br.com.siscarros.app.entities.converter;

import org.springframework.stereotype.Component;

import br.com.siscarros.app.entities.Veiculo;
import br.com.siscarros.app.entities.dto.VeiculoDTO;
import br.com.siscarros.app.entities.util.BaseConverter;

@Component
public class VeiculoConverter extends BaseConverter<Veiculo, VeiculoDTO>{

	@Override
	public VeiculoDTO convertToDTO(Veiculo entity) {
		VeiculoDTO dto = new VeiculoDTO();
		dto.setAnoFabricacao(entity.getAnoFabricacao());
		dto.setAnoModelo(entity.getAnoModelo());
		dto.setCambio(entity.getCambio());
		dto.setCaracteristicas(entity.getCaracteristicas());
		dto.setCategoria(entity.getCategoria());
		dto.setCilindrada(entity.getCilindrada());
		dto.setCombustivel(entity.getCombustivel());
		dto.setCor(entity.getCor());
		dto.setDadosAnuncio(entity.getDadosAnuncio());
		dto.setDetalhesVeiculo(entity.getDetalhesVeiculo());
		dto.setId(entity.getId());
		dto.setImagens(entity.getImagens());
		dto.setKilometragem(entity.getKilometragem());
		dto.setMarca(entity.getMarca());
		dto.setModelo(entity.getModelo());
		dto.setPessoa(entity.getPessoa());
		dto.setPlaca(entity.getPlaca());
		dto.setPortas(entity.getPortas());
		dto.setVersao(entity.getVersao());
		dto.setVisibilidadePlaca(entity.getVisibilidadePlaca());
		return dto;
	}

	@Override
	public Veiculo convertToEntity(VeiculoDTO dto) {
		Veiculo veiculo = new Veiculo();
		dto.setAnoFabricacao(dto.getAnoFabricacao());
		dto.setAnoModelo(dto.getAnoModelo());
		dto.setCambio(dto.getCambio());
		dto.setCaracteristicas(dto.getCaracteristicas());
		dto.setCategoria(dto.getCategoria());
		dto.setCilindrada(dto.getCilindrada());
		dto.setCombustivel(dto.getCombustivel());
		dto.setCor(dto.getCor());
		dto.setDadosAnuncio(dto.getDadosAnuncio());
		dto.setDetalhesVeiculo(dto.getDetalhesVeiculo());
		dto.setId(dto.getId());
		dto.setImagens(dto.getImagens());
		dto.setKilometragem(dto.getKilometragem());
		dto.setMarca(dto.getMarca());
		dto.setModelo(dto.getModelo());
		dto.setPessoa(dto.getPessoa());
		dto.setPlaca(dto.getPlaca());
		dto.setPortas(dto.getPortas());
		dto.setVersao(dto.getVersao());
		dto.setVisibilidadePlaca(dto.getVisibilidadePlaca());
		return veiculo;
	}

}
