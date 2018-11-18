package br.com.siscarros.app.entities.dto;

import java.util.ArrayList;
import java.util.List;
import br.com.siscarros.app.entities.Pessoa;
import br.com.siscarros.app.entities.Role;

public class UsuarioDTO {


	private Long id;
	private String login;
	private String senha;
	private Boolean status;
	private Pessoa pessoa;
	private List<Role> role = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public List<Role> getRole() {
		return role;
	}

	public void setRole(List<Role> role) {
		this.role = role;
	}
	
	
	
}
