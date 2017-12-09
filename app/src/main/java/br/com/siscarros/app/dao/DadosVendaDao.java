package br.com.siscarros.app.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.siscarros.app.entities.DadosVenda;





@Repository
public interface DadosVendaDao extends JpaRepository<DadosVenda, Long>{

}
