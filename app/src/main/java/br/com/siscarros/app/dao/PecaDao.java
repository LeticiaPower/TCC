package br.com.siscarros.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.siscarros.app.entities.Peca;
import br.com.siscarros.app.entities.dto.PecaDTO;


@Repository
public interface PecaDao extends JpaRepository<Peca, Long> {

}
