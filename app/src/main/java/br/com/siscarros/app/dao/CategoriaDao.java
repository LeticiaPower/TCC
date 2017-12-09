package br.com.siscarros.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.siscarros.app.entities.Categoria;

public interface CategoriaDao extends JpaRepository <Categoria, Long>{

}
