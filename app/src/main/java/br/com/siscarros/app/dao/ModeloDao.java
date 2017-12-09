package br.com.siscarros.app.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.siscarros.app.entities.Modelo;





@Repository
public interface ModeloDao extends JpaRepository<Modelo, Long>{

}
