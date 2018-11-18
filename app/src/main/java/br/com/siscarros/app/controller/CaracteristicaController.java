package br.com.siscarros.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.siscarros.app.entities.dto.CaracteristicaDTO;
import br.com.siscarros.app.service.CaracteristicaServiceInt;


@RestController
@RequestMapping("/caracteristica")
@CrossOrigin("*")
public class CaracteristicaController {
	
	@Autowired
    private CaracteristicaServiceInt caracteristicaService;
	
	@PostMapping(path="/cadastraCaracteristica")
	public void CadastraCaracteristica (@RequestBody CaracteristicaDTO caracteristicaDTO) {	
		caracteristicaService.Cadastra(caracteristicaDTO);
	}
	
	
	@GetMapping(path="/listaCaracteristica")
	public List<CaracteristicaDTO> ListaCaracteristica () {
	return caracteristicaService.ListaTodos();	
		
	}
	
	@GetMapping(path="/excluiCaracteristica/{id}")
	public void ExcluiCaracteristica (@PathVariable Long id) {
		caracteristicaService.Deleta(id);
		
	}
	@PostMapping(path="/alterarCaracteristica")
	public void AlteraCaracteristica (@RequestBody CaracteristicaDTO caracteristicaDTO) {
		caracteristicaService.Altera(caracteristicaDTO);
		
	}
	
	@GetMapping(path="/buscaPorId{id}")
	public void BuscaPorId (@PathVariable Long id) { 	
		caracteristicaService.BuscaPorId(id);
	}
	
	
    

}
