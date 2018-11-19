package br.com.siscarros.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.siscarros.app.entities.Usuario;

@Repository
public interface UsuarioDao extends JpaRepository<Usuario, Long>{

	@Query("SELECT u FROM Usuario u WHERE u.login = :login AND u.senha = :senha")
	Usuario logar(@Param("login") String login, @Param("senha") String senha); 
}
 